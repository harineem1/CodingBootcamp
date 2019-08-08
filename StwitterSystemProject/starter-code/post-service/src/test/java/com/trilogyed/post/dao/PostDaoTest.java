package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
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
public class PostDaoTest {

    @Autowired
    PostDao postDao;

    @Before
    public void setUp() throws Exception {
        System.out.println(postDao);
        List<Post> postList = this.postDao.getAllPosts();

        for(Post post : postList) {
            postDao.deletePost(post.getPostId());
        }
    }
    @After
    public void tearDown() throws Exception {
        List<Post> postList = postDao.getAllPosts();
        postList.stream()
                .forEach(post -> {
                    postDao.deletePost(post.getPostId());
                });
    }
    @Test
    public void addGetDeletePost() {

        Post post = new Post();
        post.setPostId(7);
        post.setPostDate(LocalDate.of(2017,11,11));
        post.setPosterName("hello");
        post.setPost("ok");

        post = postDao.addPost(post);

        Post post1 = postDao.getPost(post.getPostId());

        assertEquals(post1,post);

        postDao.deletePost(post.getPostId());

        post1 = postDao.getPost(post.getPostId());

        assertNull(post1);
    }
    @Test
    public void updatePost() {
        Post post = new Post();
        post.setPostId(7);
        post.setPostDate(LocalDate.of(2017,11,11));
        post.setPosterName("hello");
        post.setPost("ok");
        post = postDao.addPost(post);

        post.setPosterName("helloUpdated");
        post.setPost("okUpdated");
        postDao.updatePost(post);
        Post post1 = postDao.getPost(post.getPostId());
        assertEquals(post1,post);

    }

    @Test
    public void getAllPosts() {
        Post post = new Post();
        post.setPostId(7);
        post.setPostDate(LocalDate.of(2017,11,11));
        post.setPosterName("hello");
        post.setPost("ok");

        post = postDao.addPost(post);

        List<Post> postList = postDao.getAllPosts();
        assertEquals(postList.size(),1);


    }
}