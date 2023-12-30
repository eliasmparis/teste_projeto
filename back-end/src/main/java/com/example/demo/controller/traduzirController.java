package main.java.com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cadastroTraduzir;
import com.example.demo.service.traduzirService;
@RestController
@RequestMapping("/tradutores")
public class traduzirController {
    @Autowired
    private traduzirService tradutorService;

    @GetMapping
    public List<cadastroTraduzir> listarTradutoresAtivos() {
        return tradutorService.listarTradutoresAtivos();
    }

    @PostMapping
    public cadastroTraduzir cadastrarTradutor(@RequestBody cadastroTraduzir tradutor) {
        return tradutorService.cadastrarTradutor(tradutor);
    }

    @GetMapping("/{id}")
    public cadastroTraduzir obterTradutor(@PathVariable Long id) {
        return tradutorService.obterTradutor(id);
    }

    @PutMapping("/{id}")
    public cadastroTraduzir atualizarTradutor(@PathVariable Long id, @RequestBody cadastroTraduzir tradutor) {
        return tradutorService.atualizarTradutor(id, tradutor);
    }

    @DeleteMapping("/{id}")
    public void excluirTradutor(@PathVariable Long id) {
        tradutorService.excluirTradutor(id);
    }

    @PatchMapping("/{id}/desativar")
    public void desativarTradutor(@PathVariable Long id) {
        tradutorService.desativarTradutor(id);
    }
}
