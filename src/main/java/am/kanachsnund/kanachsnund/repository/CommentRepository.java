package am.kanachsnund.kanachsnund.repository;

import am.kanachsnund.kanachsnund.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Feedback, Integer> {
}
