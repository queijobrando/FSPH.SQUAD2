package com.squad2.fsph.FSPH.SQUAD2.controller;

import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.amostra.service.AmostraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("amostra")
public class GetterAmostraController {

    private final AmostraService amostraService;

    public GetterAmostraController(AmostraService amostraService) {
        this.amostraService = amostraService;
    }

    @GetMapping
    public ResponseEntity<List<Amostra>> listarTodasAmostras(){
        var lista = amostraService.listarAmostras();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Amostra> listarAmostraPorId(@PathVariable Long id){
        var amostra = amostraService.listarAmostraPorId(id);
        return ResponseEntity.ok(amostra);
    }
}
