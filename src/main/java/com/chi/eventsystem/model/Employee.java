package com.chi.eventsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private int empid;
    private String name;
    private String email;
    private String jobTitle;
    private String mobile;
    private String lineID;
}
