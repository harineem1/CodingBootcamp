package com.trilogyed.post.controller;

import com.trilogyed.post.dao.PostDao;
import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RefreshScope
public class PostController {

    @Autowired
    PostDao postDao;

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public Post createPost(@RequestBody Post post) {
        return postDao.addPost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public Post getPost(@PathVariable int id) {
        return postDao.getPost(id);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    public void updatePost(@RequestBody Post post, @PathVariable int id) {
        if (post.getPostId() == 0)
            post.setPostId(id);
        if (id != post.getPostId()) {
            throw new IllegalArgumentException("Id's doesn't match the object");
        }
        postDao.updatePost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable int id) {
        postDao.deletePost(id);
    }
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> getAllPosts() {
        return postDao.getAllPosts();
    }
    @RequestMapping(value = "/posts/user/{posterName}", method = RequestMethod.GET)
    public List<Post> getPostByPosterName(@PathVariable("posterName") String posterName) {
        return postDao.getPostByPosterName(posterName);
    }

}
