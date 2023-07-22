package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Fabricante;
import com.example.demo.Service.FabricanteService;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
	
	@Autowired
	FabricanteService fabricanteService;
	
	@GetMapping
	public ResponseEntity<List<Fabricante>> ListFabricante(){
		List<Fabricante> fabricantes = fabricanteService.ListaFabricante();
		return ResponseEntity.ok(fabricantes);
	}
}
