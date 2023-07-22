package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Cor;

@Repository
public interface CorRepository extends JpaRepository<Cor, Long> {
	
}
