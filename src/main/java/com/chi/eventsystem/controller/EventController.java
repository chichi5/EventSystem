package com.chi.eventsystem.controller;

import com.chi.eventsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
    @Autowired
    EventService eventService;


    // http://localhost:8064/event/cont  (參數: 1 2 3 4 5)
    @GetMapping("/event/cont")
    public String eventCount(){
       return "";
    }
}
