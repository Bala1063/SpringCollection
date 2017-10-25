/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sprco;

import java.util.List;

/**
 *
 * @author BA391760
 */
public class Department {
    private String name;
    private String location;
    private List<String> jobs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }
    
    
}
