package com.dbs.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.backend.senderModel.sender;
import com.dbs.backend.services.services;

@RestController
@CrossOrigin("http://localhost:4200/")
public class controller {

    @Autowired
    services serviceObj;

    @RequestMapping("/senderData")
    List<sender> getAllSenderData()
    {
        List<sender> senderList = serviceObj.getAllSenderData();
        return senderList;
    }

}
