package com.yash.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.book.ticket.app.enties.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
