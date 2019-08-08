package com.trilogyed.comment.controller;


import com.trilogyed.comment.dao.CommentDao;
import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
public class CommentController {

    @Autowired
    CommentDao commentDao;

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    public Comment getCommentByCommentId(@PathVariable int id) {
        return commentDao.getComment(id);
    }

    @RequestMapping(value = "/comments/post/{id}", method = RequestMethod.GET)
    public List<Comment> getCommentByPostId(@PathVariable int id) {
        return commentDao.getCommentByPostId(id);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> getAllComments() {
        return commentDao.getAllComments();
    }



}
