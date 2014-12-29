package com.jle.webapp.rest.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jle.webapp.rest.pojo.Dummy;

@Controller
public class SimpleRestService {
	
	@RequestMapping(value = "/v1.0/dummies", method = RequestMethod.GET)
    public @ResponseBody Dummy getDummy() {
        Dummy dummy = new Dummy();
        dummy.setId(1);
        dummy.setName("dummy1");
        return dummy;
    }
	
	@RequestMapping(value = "/v1.0/dummies/{id}", method = RequestMethod.GET)
    public @ResponseBody Dummy getDummy(@PathVariable("id") int id) {
        Dummy dummy = new Dummy();
        dummy.setId(1);
        dummy.setName("dummyGET-"+id);
        return dummy;
    }
}
