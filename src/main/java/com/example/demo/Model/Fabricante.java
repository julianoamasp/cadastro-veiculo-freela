package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Fabricante {
	  	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;

	    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	    @JoinColumn(name = "fabricante_id")
	    private List<Modelo> modelos;
	    
	    public Fabricante(Long id, String nome, List<Modelo> modelos) {
			super();
			this.id = id;
			this.nome = nome;
			this.modelos = modelos;
		}

		public List<Modelo> getModelos() {
			return modelos;
		}

		public void setModelos(List<Modelo> modelos) {
			this.modelos = modelos;
		}

		public Fabricante() {
	    }

	    public Fabricante(String nome) {
	        this.nome = nome;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
}
