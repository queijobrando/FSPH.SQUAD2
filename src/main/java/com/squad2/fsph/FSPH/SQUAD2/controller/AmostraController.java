package com.squad2.fsph.FSPH.SQUAD2.controller;

import com.squad2.fsph.FSPH.SQUAD2.amostra.service.AmostraService;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraEscorpiao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("amostra")
public class AmostraController {

    private final AmostraService amostraService;

    public AmostraController(AmostraService amostraService) {
        this.amostraService = amostraService;
    }

    @PostMapping("escorpiao")
    public ResponseEntity<AmostraEscorpiao> cadastrarEscorpiao(@RequestBody AmostraEscorpiaoDto dto) {
        var novaAmostra = amostraService.cadastrarAmostraEscorpiao(dto);
        return ResponseEntity.ok(novaAmostra);
    }
}
