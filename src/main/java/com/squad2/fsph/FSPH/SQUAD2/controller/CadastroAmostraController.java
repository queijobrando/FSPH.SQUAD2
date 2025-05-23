package com.squad2.fsph.FSPH.SQUAD2.controller;

import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.amostra.service.AmostraService;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraFlebotomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraTriatomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraEscorpiao;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraFlebotomineos;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraTriatomineos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastro/amostra")
public class CadastroAmostraController {

    private final AmostraService amostraService;

    public CadastroAmostraController(AmostraService amostraService) {
        this.amostraService = amostraService;
    }

    @PostMapping("escorpiao")
    public ResponseEntity<AmostraEscorpiao> cadastrarEscorpiao(@RequestBody AmostraEscorpiaoDto dto) {
        var novaAmostra = amostraService.cadastrarAmostraEscorpiao(dto);
        return ResponseEntity.ok(novaAmostra);
    }

    @PostMapping("flebotomineo")
    public ResponseEntity<AmostraFlebotomineos> cadastrarFlebotomineos(@RequestBody AmostraFlebotomineosDto dto) {
        var novaAmostra = amostraService.cadastrarAmostraFlebotomineos(dto);
        return ResponseEntity.ok(novaAmostra);
    }

    @PostMapping("triatomineo")
    public ResponseEntity<AmostraTriatomineos> cadastrarTriatomineos(@RequestBody AmostraTriatomineosDto dto) {
        var novaAmostra = amostraService.cadastrarAmostraTriatomineos(dto);
        return ResponseEntity.ok(novaAmostra);
    }

}
