package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.senderModel.sender;
public interface proRepo extends JpaRepository<sender, Integer> {
}