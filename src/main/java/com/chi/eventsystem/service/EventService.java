package com.chi.eventsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public int getEventCount( int type){
        String sql = "Select count(*) from event where type=" + type;
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
