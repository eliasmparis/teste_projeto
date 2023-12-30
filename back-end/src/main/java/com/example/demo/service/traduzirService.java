package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.cadastroTraduzir;
import com.example.demo.repository.traduzirRepository;

public class traduzirService {

    @Autowired
    private traduzirRepository tradutorRepository;

    public List<cadastroTraduzir> listarTradutoresAtivos() {
        return tradutorRepository.findByAtivo(true);
    }

    public cadastroTraduzir cadastrarTradutor(cadastroTraduzir tradutor) {
        return tradutorRepository.save(tradutor);
    }

    public cadastroTraduzir obterTradutor(Long id) {
        return tradutorRepository.findById(id).orElse(null);
    }

    public cadastroTraduzir atualizarTradutor(Long id, cadastroTraduzir tradutor) {
        if (tradutorRepository.existsById(id)) {
            tradutor.setId(id);
            return tradutorRepository.save(tradutor);
        }
        return null;
    }

    public void excluirTradutor(Long id) {
        tradutorRepository.deleteById(id);
    }

    public void desativarTradutor(Long id) {
        cadastroTraduzir tradutor = tradutorRepository.findById(id).orElse(null);
        if (tradutor != null) {
            tradutor.setAtivo(false);
            tradutorRepository.save(tradutor);
        }
    }
}
    
