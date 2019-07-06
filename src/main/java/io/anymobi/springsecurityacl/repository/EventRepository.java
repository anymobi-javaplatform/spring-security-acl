package io.anymobi.springsecurityacl.repository;

import io.anymobi.springsecurityacl.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {

} // The End...
