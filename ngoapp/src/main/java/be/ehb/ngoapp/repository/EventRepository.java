package be.ehb.ngoapp.repository;

import be.ehb.ngoapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findTop10ByOrderByTijdstipDesc();
}