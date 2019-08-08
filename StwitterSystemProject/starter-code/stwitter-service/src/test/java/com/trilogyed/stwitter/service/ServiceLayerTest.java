package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.util.message.Comment;
import com.trilogyed.stwitter.util.message.Post;
import com.trilogyed.stwitter.viewmodel.CommentViewModel;
import com.trilogyed.stwitter.viewmodel.PostViewModel;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ServiceLayerTest {

    PostClient postClient;
    CommentClient commentClient;
    ServiceLayer serviceLayer;

    @Before
    public void setUp() throws Exception {
        setUpCommentClient();
        setUpPostClient();
        serviceLayer = new ServiceLayer(commentClient, postClient);
    }

    @Test
    public void savePost() {

        PostViewModel postToFeignClient = new PostViewModel();
        postToFeignClient.setPostDate(LocalDate.of(2018, 7, 9));
        postToFeignClient.setPosterName("Prince");
        postToFeignClient.setPost("Persia");

        CommentViewModel commentFromFeignClient = new CommentViewModel();
        commentFromFeignClient.setCreateDate(LocalDate.of(2018, 7, 9));
        commentFromFeignClient.setCommenterName("Harry Potter");
        commentFromFeignClient.setComment("Entertaining");

        postToFeignClient.addComments(commentFromFeignClient);
        postToFeignClient = serviceLayer.savePost(postToFeignClient);

        PostViewModel fromService = serviceLayer.getPostsById(1);
        assertEquals(fromService, postToFeignClient);

    }

    @Test
    public void findPostsById() {

        PostViewModel postToFeignClient = new PostViewModel();
        postToFeignClient.setPostDate(LocalDate.of(2018, 7, 9));
        postToFeignClient.setPosterName("Prince");
        postToFeignClient.setPost("Persia");

        CommentViewModel commentFromFeignClient = new CommentViewModel();
        commentFromFeignClient.setCreateDate(LocalDate.of(2018, 7, 9));
        commentFromFeignClient.setCommenterName("Harry Potter");
        commentFromFeignClient.setComment("Entertaining");

        postToFeignClient.addComments(commentFromFeignClient);

        postToFeignClient = serviceLayer.savePost(postToFeignClient);

        PostViewModel pvmFromService = serviceLayer.getPostsById(1);
        assertEquals(pvmFromService, postToFeignClient);

    }

    @Test
    public void getPostsByPosterName() {

        PostViewModel postToFeignClient = new PostViewModel();
        postToFeignClient.setPostDate(LocalDate.of(2018, 7, 9));
        postToFeignClient.setPosterName("Prince");
        postToFeignClient.setPost("Persia");

        CommentViewModel commentFromFeignClient = new CommentViewModel();
        commentFromFeignClient.setCreateDate(LocalDate.of(2017, 9, 9));
        commentFromFeignClient.setCommenterName("Harry Potter");
        commentFromFeignClient.setComment("Entertaining");

        postToFeignClient.addComments(commentFromFeignClient);

        postToFeignClient = serviceLayer.savePost(postToFeignClient);

        List<PostViewModel> pvmList = serviceLayer.getPostsByPosterName("Prince");
        assertEquals(1, pvmList.size());

        pvmList = serviceLayer.getPostsByPosterName("Harry");
        assertEquals(0, pvmList.size());

    }


    private void setUpCommentClient()
    {
        commentClient= mock(CommentClient.class);

        Comment commentToFeignClient = new Comment();
        commentToFeignClient.setPostId(1);
        commentToFeignClient.setCreateDate(LocalDate.of(2018, 7, 9));
        commentToFeignClient.setCommenterName("Harry Potter");
        commentToFeignClient.setComment("Entertaining");

        Comment commentFromFeignClient = new Comment();
        commentFromFeignClient.setCommentId(1);
        commentFromFeignClient.setPostId(1);
        commentFromFeignClient.setCreateDate(LocalDate.of(2018, 7, 9));
        commentFromFeignClient.setCommenterName("Harry Potter");
        commentFromFeignClient.setComment("Entertaining");

        List<Comment> commentList = new ArrayList<>();
        commentList.add(commentFromFeignClient);

        doReturn(commentFromFeignClient).when(commentClient).addComment(commentToFeignClient);
        doReturn(commentFromFeignClient).when(commentClient).getCommentsByCommentId(1);
        doReturn(commentList).when(commentClient).getAllComments();
        doReturn(commentList).when(commentClient).getCommentsByPostId(1);
    }

    private void setUpPostClient()
    {
        postClient= mock(PostClient.class);

        Post postToFeignClient = new Post();
        postToFeignClient.setPostDate(LocalDate.of(2018, 7, 9));
        postToFeignClient.setPosterName("Prince");
        postToFeignClient.setPost("Persia");

        Post postFromFeignClient = new Post();
        postFromFeignClient.setPostId(1);
        postFromFeignClient.setPostDate(LocalDate.of(2018, 7, 9));
        postFromFeignClient.setPosterName("Prince");
        postFromFeignClient.setPost("Persia");

        List<Post> postList = new ArrayList<>();
        postList.add(postFromFeignClient);

        doReturn(postFromFeignClient).when(postClient).createPost(postToFeignClient);
        doReturn(postFromFeignClient).when(postClient).getPost(1);
        doReturn(postList).when(postClient).getAllPosts();
        doReturn(postList).when(postClient).getPostByPosterName("Prince");
    }

}