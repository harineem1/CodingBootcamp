package com.trilogyed.stwitter.util.feign;


import com.trilogyed.stwitter.util.message.Comment;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@FeignClient(name = "comment-service")
public interface CommentClient {

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public Comment addComment(@RequestBody @Valid Comment comment);

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    public Comment getCommentsByCommentId(@PathVariable int id);

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> getAllComments();

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateComment(@RequestBody @Valid Comment comment, @PathVariable("id") int id);

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable int id);

    @RequestMapping(value = "/comments/post/{postId}", method = RequestMethod.GET)
    public List<Comment> getCommentsByPostId(@PathVariable int postId);

}
