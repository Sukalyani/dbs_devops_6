package com.dbs.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.jpa.entity.Receiver;
import com.dbs.jpa.repo.ReceiverRepo;

@Service
public class ReceiverService {
	
	@Autowired
	ReceiverRepo receiverRepo;
	
	public List<Receiver> getAllReceiver() {
		// TODO Auto-generated method stub
		return receiverRepo.findAll();
	}
}
