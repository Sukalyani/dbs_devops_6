package com.dbs.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.jpa.entity.Receiver;
import com.dbs.jpa.service.ReceiverService;

@RestController
public class ReceiverController {
	
	@Autowired
	ReceiverService receiverService;
    @RequestMapping("/receiver/all")
    public List<Receiver> getAllReceiver() {
        
        return receiverService.getAllReceiver();
        
    }
}
