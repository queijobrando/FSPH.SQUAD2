package com.squad2.fsph.FSPH.SQUAD2.lote.service;

import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.amostra.repository.AmostraRepository;
import com.squad2.fsph.FSPH.SQUAD2.lote.dto.LoteDto;
import com.squad2.fsph.FSPH.SQUAD2.lote.model.Lote;
import com.squad2.fsph.FSPH.SQUAD2.lote.repository.LoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService {

    private final LoteRepository loteRepository;
    private final AmostraRepository amostraRepository;

    public LoteService(LoteRepository loteRepository, AmostraRepository amostraRepository) {
        this.loteRepository = loteRepository;
        this.amostraRepository = amostraRepository;
    }

    public Lote cadastrarLote(LoteDto dto){
        if (dto.idAmostras() == null || dto.idAmostras().isEmpty()) {
            throw new IllegalArgumentException("É necessário ao menos uma amostra.");
        }

        List<Amostra> amostras = amostraRepository.findAllById(dto.idAmostras());

        if (amostras.size() != dto.idAmostras().size()) {
            throw new IllegalArgumentException("Alguma amostra não foi encontrada.");
        }

        Lote lote = new Lote();
        for (Amostra amostra : amostras) {
            amostra.setLote(lote);
            lote.getAmostras().add(amostra);
        }

        return loteRepository.save(lote);
    }
}
