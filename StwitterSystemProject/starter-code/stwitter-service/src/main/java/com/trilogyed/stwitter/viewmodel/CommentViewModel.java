package com.trilogyed.stwitter.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CommentViewModel {



    private String commenterName;
    @NotEmpty(message = "Please supply a value for model")
    private LocalDate createDate;
    @NotEmpty(message = "Please supply a value for model")
    private String comment;

    public CommentViewModel() {
    }


    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String commentContent) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentViewModel that = (CommentViewModel) o;
        return Objects.equals(getCommenterName(), that.getCommenterName()) &&
                Objects.equals(getCreateDate(), that.getCreateDate()) &&
                Objects.equals(getComment(), that.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommenterName(), getCreateDate(), getComment());
    }

    @Override
    public String toString() {
        return "CommentViewModel{" +
                "commenterName='" + commenterName + '\'' +
                ", createDate=" + createDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
