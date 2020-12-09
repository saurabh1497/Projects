package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Event;
import com.demo.services.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService service;

	@PostMapping("/createevent")
	public Event createEvent(@RequestBody Event event) throws Exception {

		return service.createEvent(event);
	}

	@GetMapping("/getevent")
	public Event getEvent(@RequestBody Event event, Integer id) {
		return service.getEvent(id, event);
	}

	@DeleteMapping("/deleteevent")
	public Event deleteEvent(@RequestBody Event event, Integer id) {
		return service.deleteEvent(id, event);
	}
}
