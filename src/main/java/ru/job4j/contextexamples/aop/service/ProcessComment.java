package ru.job4j.contextexamples.aop.service;

import org.springframework.stereotype.Component;
import ru.job4j.contextexamples.aop.model.Comment;

@Component
public class ProcessComment {

    public void publishingComment(Comment comment) {
        System.out.println("Выполняем публикацию комментария : " + comment.getComment());
    }

    public int deleteComment(int commentId) {
        System.out.println("Выполняем удаление комментария : " + commentId);
        return commentId;
    }
}