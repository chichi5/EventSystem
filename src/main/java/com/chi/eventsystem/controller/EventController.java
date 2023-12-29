package com.chi.eventsystem.controller;

import com.chi.eventsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {
    @Autowired
    EventService eventService;


    // http://localhost:8064/event/cont?cate=2  (參數: 1 2 3 4 5)
    @GetMapping("/event/cont")
    public String eventCount(@RequestParam("cate") int type, Model model){
        // @RequestParam("cate")轉換為type
       int count = eventService.getEventCount(type);
       model.addAttribute("cnt",count);
       return "event_count";
    }
}
