package com.dbs.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dbs.backend.repo.repository;
import com.dbs.backend.senderModel.sender;

@Service
@Component
public class services {

	@Autowired
	repository repositoryObj;

	public List<sender> getAllSenderData()
	{
		return repositoryObj.findAll();
	}

}
