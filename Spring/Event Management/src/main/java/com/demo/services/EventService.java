package com.demo.services;

import com.demo.model.Event;

public interface EventService {

	Event createEvent(Event event) throws Exception;
	public Event getEvent(Integer id, Event event);
	public Event deleteEvent(Integer id, Event event);
}
