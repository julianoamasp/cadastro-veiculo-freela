package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.Cor;
import com.example.demo.Service.CorService;

@Controller
@RequestMapping("/cor")
public class CorController {
	@Autowired
	private CorService corService;
	
	@GetMapping
	public ResponseEntity<List<Cor>> ListarCor(){
		List<Cor> cores = corService.ListarCor();
		return ResponseEntity.ok(cores);
	}
}
