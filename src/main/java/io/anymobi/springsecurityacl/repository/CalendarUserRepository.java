package io.anymobi.springsecurityacl.repository;

import io.anymobi.springsecurityacl.domain.CalendarUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarUserRepository extends JpaRepository<CalendarUser, Integer> {

    CalendarUser findByEmail(String email);

} // The End...
