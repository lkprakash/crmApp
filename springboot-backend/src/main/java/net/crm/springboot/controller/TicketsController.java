package net.crm.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.crm.springboot.repository.TicketRepository;
import net.crm.springboot.model.Tickets;

@RestController
@RequestMapping("/api/v1/")
public class TicketsController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	//get all Tickets
	
	@GetMapping("/tickets")
	public List<Tickets> getAllTickets() {
		return ticketRepository.findAll();
	}
	
}
