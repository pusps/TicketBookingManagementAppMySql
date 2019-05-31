package com.yash.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.book.ticket.app.dao.TicketBookingDao;
import com.yash.book.ticket.app.enties.Ticket;

@Service
public class TicketBookingService {
	
@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		
		return ticketBookingDao.save(ticket) ;
	}
	public Ticket getTicketById(Integer ticketId) {
		
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTicket() {
		
		return ticketBookingDao.findAll();
	}
public void deleteTicket(Integer ticketId) {
	ticketBookingDao.delete(ticketId);	
}
public Ticket updateTicket(Integer ticketId, String newEmail) {
	Ticket ticketFromDb=ticketBookingDao.findOne(ticketId);
	ticketFromDb.setEmail(newEmail);
	Ticket updatedTicket=ticketBookingDao.save(ticketFromDb);
	
	return updatedTicket;
}
}
