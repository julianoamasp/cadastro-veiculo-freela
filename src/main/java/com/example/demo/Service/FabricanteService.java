package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Fabricante;
import com.example.demo.Repository.FabricanteRepository;

@Service
public class FabricanteService {
	@Autowired
	FabricanteRepository fabricanteRepository;
	
	public List<Fabricante> ListaFabricante(){
		List<Fabricante> fabricantes = fabricanteRepository.findAll();
		return fabricantes;
	}
}
