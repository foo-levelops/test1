package com.cognitree.reminder.repositories;

import com.cognitree.reminder.models.Event;
import com.cognitree.reminder.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;
import java.util.List;

@Component
public interface EventRepository extends JpaRepository<Event,Integer> {

}
