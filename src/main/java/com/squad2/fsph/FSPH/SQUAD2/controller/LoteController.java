package com.squad2.fsph.FSPH.SQUAD2.controller;

import com.squad2.fsph.FSPH.SQUAD2.lote.dto.LoteDto;
import com.squad2.fsph.FSPH.SQUAD2.lote.service.LoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lote")
public class LoteController {

    public final LoteService loteService;

    public LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @PostMapping
    public ResponseEntity cadastrarLote(@RequestBody LoteDto dto){
        var lote = loteService.cadastrarLote(dto);
        return ResponseEntity.ok(lote);
    }
}
