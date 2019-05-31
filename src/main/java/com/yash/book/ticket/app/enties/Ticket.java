package com.yash.book.ticket.app.enties;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TICKET")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TICKET_ID")
private Integer ticketId;
	@Column(name="PASSENGER_NAME")
private String passengerName;
	@Column(name="BOOKING_DATE")
private Date bookingDate;
	@Column(name="SOURCE_STATION")
private String sourceStation;
	@Column(name="DEST_STATION")
private String destStation;
	@Column(name="EMAIL")
private String email;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestStation() {
		return destStation;
	}
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
