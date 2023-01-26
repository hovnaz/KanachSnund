package am.kanachsnund.kanachsnund.service;

import am.kanachsnund.kanachsnund.model.Comment;

public interface CommentService {
    void saveComment(String email, String comment);
}
