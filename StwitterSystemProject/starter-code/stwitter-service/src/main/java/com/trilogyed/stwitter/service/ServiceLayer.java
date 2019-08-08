package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.util.message.Comment;
import com.trilogyed.stwitter.util.message.Post;
import com.trilogyed.stwitter.viewmodel.CommentViewModel;
import com.trilogyed.stwitter.viewmodel.PostViewModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.amqp.core.Binding.DestinationType.EXCHANGE;

@Component
public class ServiceLayer {

    @Autowired
    CommentClient commentClient;
    @Autowired
    PostClient postClient;
    @Autowired
    RabbitTemplate rabbitTemplate;


    public ServiceLayer() {
    }

    public ServiceLayer(CommentClient commentClient, PostClient postClient, RabbitTemplate rabbitTemplate) {
        this.commentClient = commentClient;
        this.postClient = postClient;
        this.rabbitTemplate = rabbitTemplate;
    }
    public ServiceLayer(CommentClient commentClient, PostClient postClient) {
        this.commentClient = commentClient;
        this.postClient = postClient;
    }

    public PostViewModel savePost(PostViewModel postViewModel) {
        Post post = new Post();
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        post = postClient.createPost(post);
        postViewModel.setPostId(post.getPostId());

        List<Comment> commentList = new ArrayList<>();
        List<CommentViewModel> cList = new ArrayList<>();
        System.out.println(postViewModel.getComments());
        try {
            postViewModel.getComments().stream().
                    forEach(c ->
                    {
                        Comment comment = new Comment();
                        comment.setPostId(postViewModel.getPostId());
                        comment.setCreateDate(c.getCreateDate());
                        comment.setCommenterName(c.getCommenterName());
                        comment.setComment(c.getComment());
                        commentList.add(comment);

                        CommentViewModel commentViewModel = new CommentViewModel();
                        commentViewModel.setCreateDate(c.getCreateDate());
                        commentViewModel.setCommenterName(c.getCommenterName());
                        commentViewModel.setComment(c.getComment());
                        cList.add(commentViewModel);
                    });
        }
        catch (NullPointerException e)
        {
            postViewModel.setComments(commentList);
            return postViewModel;
        }

        return postViewModel;
    }


    public PostViewModel getPostsById(int postId) {

        try {
            Post post = postClient.getPost(postId);
            List<Comment> commentList = commentClient.getCommentsByPostId(post.getPostId());

            PostViewModel pvm = new PostViewModel();
            pvm.setPostId(post.getPostId());
            pvm.setPostDate(post.getPostDate());
            pvm.setPosterName(post.getPosterName());
            pvm.setPost(post.getPost());

            List<CommentViewModel> cvmList = new ArrayList<>();
            for (Comment comment : commentList) {
                CommentViewModel cvm = new CommentViewModel();
                cvm.setCreateDate(comment.getCreateDate());
                cvm.setCommenterName(comment.getCommenterName());
                cvm.setComment(comment.getComment());
                cvmList.add(cvm);
                pvm.addComments(cvm);
            }
            return pvm;
        }
        catch (NullPointerException e)
        {
            return null;
        }

    }

    public List<PostViewModel> getAllPosts() {

        List<Post> postList = postClient.getAllPosts();
        List<Comment> commentList = commentClient.getAllComments();
        List<PostViewModel> pList = new ArrayList<>();

        for (Post post : postList)
        {
            PostViewModel pvm = buildPostViewModel(post);
            pList.add(pvm);
        }
        return pList;
    }

    public List<PostViewModel> getPostsByPosterName(String posterName) {

        List<Post> postList = postClient.getPostByPosterName(posterName);
        List<PostViewModel> pvmList = new ArrayList<>();

        for (Post post : postList)
        {
            PostViewModel pvm = buildPostViewModel(post);
            pvmList.add(pvm);
        }
        return pvmList;
    }


    private PostViewModel buildPostViewModel(Post post) {

        PostViewModel pvm = new PostViewModel();
        pvm.setPostId(post.getPostId());
        pvm.setPostDate(post.getPostDate());
        pvm.setPosterName(post.getPosterName());
        pvm.setPost(post.getPost());

        List<Comment> commentList = commentClient.getCommentsByPostId(post.getPostId());
        List<CommentViewModel> cvmList = new ArrayList<>();
        for (Comment comment : commentList)
        {
            CommentViewModel cvm = new CommentViewModel();
            cvm.setCreateDate(comment.getCreateDate());
            cvm.setCommenterName(comment.getCommenterName());
            cvm.setComment(comment.getComment());
            cvmList.add(cvm);
        }
        pvm.setComments(commentList);

        return pvm;
    }

}
