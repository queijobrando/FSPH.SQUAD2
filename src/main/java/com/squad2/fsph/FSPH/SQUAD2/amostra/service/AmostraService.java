package com.squad2.fsph.FSPH.SQUAD2.amostra.service;

import com.squad2.fsph.FSPH.SQUAD2.amostra.repository.AmostraRepository;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraFlebotomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraEscorpiao;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraFlebotomineos;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.repository.AmostraEscorpiaoRepository;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.repository.AmostraFlebotomineoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AmostraService {

    public final AmostraRepository amostraRepository;
    public final AmostraEscorpiaoRepository amostraEscorpiaoRepository;
    public final AmostraFlebotomineoRepository amostraFlebotomineoRepository;

    public AmostraService(AmostraRepository amostraRepository, AmostraEscorpiaoRepository amostraEscorpiaoRepository, AmostraFlebotomineoRepository amostraFlebotomineoRepository) {
        this.amostraRepository = amostraRepository;
        this.amostraEscorpiaoRepository = amostraEscorpiaoRepository;
        this.amostraFlebotomineoRepository = amostraFlebotomineoRepository;
    }

    @Transactional
    public AmostraEscorpiao cadastrarAmostraEscorpiao(AmostraEscorpiaoDto dados){
        AmostraEscorpiao novaAmostra = new AmostraEscorpiao(dados);
        return amostraEscorpiaoRepository.save(novaAmostra);
    }

    @Transactional
    public AmostraFlebotomineos cadastrarAmostraFlebotomineos(AmostraFlebotomineosDto dados){
        AmostraFlebotomineos novaAmostra = new AmostraFlebotomineos(dados);
        return amostraFlebotomineoRepository.save(novaAmostra);
    }
}
