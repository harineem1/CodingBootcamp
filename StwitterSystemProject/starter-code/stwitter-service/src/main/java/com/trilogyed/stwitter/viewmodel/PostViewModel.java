package com.trilogyed.stwitter.viewmodel;


import com.trilogyed.stwitter.util.message.Comment;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostViewModel {

//    private int postId;
//    private LocalDate postDate;
//    private String posterName;
//    private String post;
    private List<CommentViewModel> commentViewModelList = new ArrayList<>();

    private int postId;
    @NotEmpty(message = "Please supply a value for model")
    private String post;
    @NotEmpty(message = "Please supply a value for model")
    private LocalDate postDate;
    @NotEmpty(message = "Please supply a value for model")
    private String posterName;
    @NotEmpty(message = "Please supply a value for model")
    //private List<Comment> comments;

    public PostViewModel() {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public void addComments(CommentViewModel commentViewModel) {
        commentViewModelList.add(commentViewModel);
    }
    public void removeComments(CommentViewModel commentViewModel)
    {
        commentViewModelList.remove(commentViewModel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostViewModel that = (PostViewModel) o;
        return getPostId() == that.getPostId() &&
                Objects.equals(commentViewModelList, that.commentViewModelList) &&
                Objects.equals(getPost(), that.getPost()) &&
                Objects.equals(getPostDate(), that.getPostDate()) &&
                Objects.equals(getPosterName(), that.getPosterName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentViewModelList, getPostId(), getPost(), getPostDate(), getPosterName());
    }

    public List<CommentViewModel> getCommentViewModelList() {
        return commentViewModelList;
    }

    public void setCommentViewModelList(List<CommentViewModel> commentViewModelList) {
        this.commentViewModelList = commentViewModelList;
    }

    @Override
    public String toString() {
        return "PostViewModel{" +
                "commentViewModelList=" + commentViewModelList +
                ", postId=" + postId +
                ", post='" + post + '\'' +
                ", postDate=" + postDate +
                ", posterName='" + posterName + '\'' +
                '}';
    }
}
