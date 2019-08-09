package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.util.message.Post;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@FeignClient(name = "post-service")
public interface PostClient {

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Post createPost(@RequestBody @Valid Post post);

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> getAllPosts();

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Post getPost(@PathVariable int id);

    @RequestMapping(value = "/posts/user/{posterName}", method = RequestMethod.GET)
    public List<Post> getPostByPosterName(@PathVariable("posterName") String posterName);

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(@RequestBody @Valid Post post, @PathVariable("id") int id);

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable int id);

}
