package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Before
    public void setUp() throws Exception {
        System.out.println(commentDao);
        List<Comment> commentList = this.commentDao.getAllComments();

        for(Comment comment : commentList) {
            commentDao.deleteComment(comment.getCommentId());
        }

    }

    @After
    public void tearDown() throws Exception {
        List<Comment> commentList = commentDao.getAllComments();
        commentList.stream()
                .forEach(comment -> {
                    commentDao.deleteComment(comment.getCommentId());
                });
    }


    @Test
    public void addGetDeleteComment() {

        Comment comment = new Comment();
        comment.setCommentId(9);
        comment.setPostId(8);
        comment.setCreateDate(LocalDate.of(2017,11,11));
        comment.setCommenterName("hello");
        comment.setComment("ok");

        comment = commentDao.addComment(comment);

        Comment comment1 = commentDao.getComment(comment.getCommentId());

        assertEquals(comment1,comment);

        commentDao.deleteComment(comment.getCommentId());

        comment1 = commentDao.getComment(comment.getCommentId());

        assertNull(comment1);
    }

    @Test
    public void getAllComments() {
        Comment comment = new Comment();
        comment.setCommentId(9);
        comment.setPostId(8);
        comment.setCreateDate(LocalDate.of(2017,11,11));
        comment.setCommenterName("hello");
        comment.setComment("ok");

        comment = commentDao.addComment(comment);

        List<Comment> commentList = commentDao.getAllComments();
        assertEquals(commentList.size(),1);
    }

    @Test
    public void updateComment() {

        Comment comment = new Comment();
        comment.setCommentId(9);
        comment.setPostId(8);
        comment.setCreateDate(LocalDate.of(2017,11,11));
        comment.setCommenterName("hello");
        comment.setComment("ok");
        commentDao.addComment(comment);

        comment.setCommenterName("helloUpdated");
        comment.setComment("okUpodated");
        commentDao.updateComment(comment);
        Comment comment1 = commentDao.getComment(comment.getCommentId());
        assertEquals(comment1,comment);

    }

}