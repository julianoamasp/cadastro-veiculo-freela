package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cor;
import com.example.demo.Repository.CorRepository;

@Service
public class CorService {
	@Autowired
	private CorRepository corRepository;

	public List<Cor> ListarCor(){
		return corRepository.findAll();
	}
}
