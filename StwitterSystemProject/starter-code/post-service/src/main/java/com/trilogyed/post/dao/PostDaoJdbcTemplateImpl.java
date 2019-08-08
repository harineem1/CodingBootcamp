package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class PostDaoJdbcTemplateImpl implements PostDao {


    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_POST_SQL =

            "insert into post(post_date,poster_name,post) values(?,?,?)";

    private static final String UPDATE_POST_SQL =
            "update post set post_date=?, poster_name=?, post=? where post_id=?";

    private static final String SELECT_POST_SQL =
            "select * from post where post_id = ?";

    private static final String SELECT_ALL_POST_SQL =
            "select * from post";

    private static final String DELETE_POST_SQL =
            " delete from post where post_id =?";
    private static final String GETPOSTBY_POSTERNAME_SQL =
            "select * from post where poster_name = ?";


    @Autowired
    public PostDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Post getPost(int postId) {

        try {
            return jdbcTemplate.queryForObject(SELECT_POST_SQL, this::mapRowToPost, postId);

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    @Override
    @Transactional
    public Post addPost(Post post) {
            jdbcTemplate.update(
                    INSERT_POST_SQL,
                    post.getPostDate(),
                    post.getPosterName(),
                    post.getPost());


            int id = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);

            post.setPostId(id);

            return post;
        }


         @Override
         @Transactional
         public void updatePost(Post post) {

            jdbcTemplate.update(
                    UPDATE_POST_SQL,
                    post.getPostDate(),
                    post.getPosterName(),
                    post.getPost(),
                    post.getPostId());

        }
        @Override
        public List<Post> getAllPosts() {

            return jdbcTemplate.query(SELECT_ALL_POST_SQL, this::mapRowToPost);
        }

        @Override
        @Transactional
        public void deletePost(int postId) {
            jdbcTemplate.update(DELETE_POST_SQL, postId);
        }

        @Override
        public List<Post> getPostByPosterName(String posterName) {
        return jdbcTemplate.query(GETPOSTBY_POSTERNAME_SQL, this::mapRowToPost, posterName);
    }

        private Post mapRowToPost(ResultSet rs, int rowNum) throws SQLException {

            Post post = new Post();
            post.setPostId(rs.getInt("post_id"));
            post.setPosterName(rs.getString("poster_name"));
            post.setPostDate(rs.getDate("post_date").toLocalDate());
            post.setPost(rs.getString("post"));

            return post;
        }
    }

