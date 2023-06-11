package pl.whuzar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.whuzar.member.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
