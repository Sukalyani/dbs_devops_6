package com.dbs.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.jpa.entity.Receiver;

public interface ReceiverRepo extends JpaRepository<Receiver, Integer> {
}