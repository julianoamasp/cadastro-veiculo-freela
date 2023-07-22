package com.example.demo.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String condutor;
    private String observacao;
    private Timestamp hora_entrada;
    private Timestamp hora_saida;

    
    public Timestamp getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Timestamp hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public Timestamp getHora_saida() {
		return hora_saida;
	}

	public void setHora_saida(Timestamp hora_saida) {
		this.hora_saida = hora_saida;
	}

	@ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;
    
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "veiculo_id")
    private List<Historico> historicos;
    
    @ManyToOne
    @JoinColumn(name = "cor_id")
    private Cor cor;
    

    public List<Historico> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}

	public Veiculo() {
    }




	public Veiculo(Long id, String placa, String condutor, String observacao, Timestamp hora_entrada,
			Timestamp hora_saida, Modelo modelo, List<Historico> historicos, Cor cor) {
		super();
		this.id = id;
		this.placa = placa;
		this.condutor = condutor;
		this.observacao = observacao;
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
		this.modelo = modelo;
		this.historicos = historicos;
		this.cor = cor;
	}
	

	public Veiculo(Long id, String placa, String condutor, String observacao) {
		super();
		this.id = id;
		this.placa = placa;
		this.condutor = condutor;
		this.observacao = observacao;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

	public String getCondultor() {
		return this.condutor;
	}

	public void setCondultor(String condutor) {
		this.condutor = condutor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}