package kr.aaaron.jwt_demo.repo;

import kr.aaaron.jwt_demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
