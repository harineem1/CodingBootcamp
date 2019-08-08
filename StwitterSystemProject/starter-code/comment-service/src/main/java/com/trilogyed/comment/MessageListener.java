package com.trilogyed.comment;

import com.trilogyed.comment.dao.CommentDao;
import com.trilogyed.comment.model.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageListener {

    @Autowired
    CommentDao commentDao;

    @RabbitListener(queues = CommentServiceApplication.QUEUE_NAME)
    public void receiveList(List<Comment> commentList) {

        for (Comment comment : commentList)
        {
            System.out.println(comment.getCommentId());
            if (comment.getCommentId() == 0) {
                comment = commentDao.addComment(comment);
            }
            else
            {
                commentDao.updateComment(comment);
            }
        }
    }

}
