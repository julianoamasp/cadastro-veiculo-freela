package com.example.demo.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Veiculo;
import com.example.demo.Repository.VeiculoRepository;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo atualizarVeiculo(Long id, Veiculo veiculo) {
        Veiculo veiculoSalvo = buscarVeiculoPorId(id);
        veiculoSalvo.setPlaca(veiculo.getPlaca());
        veiculoSalvo.setCor(veiculo.getCor());
        return veiculoRepository.save(veiculoSalvo);
    }

    public void excluirVeiculo(Long id) {
        Veiculo veiculo = buscarVeiculoPorId(id);
        veiculoRepository.delete(veiculo);
    }

    private Veiculo buscarVeiculoPorId(Long id) {
        return veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }
}