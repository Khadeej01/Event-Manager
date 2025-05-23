package org.budgetmanager.eventmanager.repository;

import org.budgetmanager.eventmanager.entity.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}

