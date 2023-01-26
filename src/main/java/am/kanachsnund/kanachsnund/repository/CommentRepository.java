package am.kanachsnund.kanachsnund.repository;

import am.kanachsnund.kanachsnund.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
