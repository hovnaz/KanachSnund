package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.model.Comment;
import am.kanachsnund.kanachsnund.repository.CommentRepository;
import am.kanachsnund.kanachsnund.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public void saveComment(String email, String comment) {
        Comment commentPeople = Comment.builder()
                .comment(comment)
                .email(email)
                .build();
        commentRepository.save(commentPeople);
    }
}
