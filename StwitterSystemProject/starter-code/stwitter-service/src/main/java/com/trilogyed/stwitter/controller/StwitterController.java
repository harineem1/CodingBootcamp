package com.trilogyed.stwitter.controller;

import com.trilogyed.stwitter.service.ServiceLayer;
import com.trilogyed.stwitter.viewmodel.PostViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sun.misc.PostVMInitHook;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
public class StwitterController {

    ServiceLayer service;

    @Autowired
    public StwitterController(ServiceLayer service) {
        this.service = service;
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public PostViewModel createPost(@RequestBody @Valid PostViewModel postViewModel)
    {
        System.out.println("Create NOT FROM CACHE");
        return service.savePost(postViewModel);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<PostViewModel> getAllPosts()
    {
        System.out.println("GetAll NOT FROM CACHE");
        return service.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public PostViewModel getPostByPostId(@PathVariable int id)
    {
        System.out.println("getPostById NOT FROM CACHE");
        return service.getPostsById(id);
    }

    @RequestMapping(value = "/posts/user/{posterName}", method = RequestMethod.GET)
    public List<PostViewModel> getpostByPosterName(@PathVariable("posterName") String posterName)
    {
        System.out.println("getByPosterName NOT FROM CACHE");
        return service.getPostsByPosterName(posterName);
    }

}
