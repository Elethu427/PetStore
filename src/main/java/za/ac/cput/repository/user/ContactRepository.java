package za.ac.cput.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.user.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Contact findByEmail(String email);

    Contact findByPhone(String phone);
}