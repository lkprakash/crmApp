package net.crm.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.crm.springboot.model.Tickets;


@Repository
public interface TicketRepository extends JpaRepository<Tickets, Long> {
	
}
