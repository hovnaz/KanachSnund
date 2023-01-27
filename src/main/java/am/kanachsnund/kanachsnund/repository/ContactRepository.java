package am.kanachsnund.kanachsnund.repository;

import am.kanachsnund.kanachsnund.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
