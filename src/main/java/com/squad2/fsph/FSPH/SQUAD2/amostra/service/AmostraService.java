package com.squad2.fsph.FSPH.SQUAD2.amostra.service;

import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.amostra.repository.AmostraRepository;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraFlebotomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraTriatomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraEscorpiao;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraFlebotomineos;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraTriatomineos;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.repository.AmostraEscorpiaoRepository;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.repository.AmostraFlebotomineoRepository;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.repository.AmostraTriatomineosRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AmostraService {

    public final AmostraRepository amostraRepository;
    public final AmostraEscorpiaoRepository amostraEscorpiaoRepository;
    public final AmostraFlebotomineoRepository amostraFlebotomineoRepository;
    public final AmostraTriatomineosRepository amostraTriatomineosRepository;

    public AmostraService(AmostraRepository amostraRepository, AmostraEscorpiaoRepository amostraEscorpiaoRepository, AmostraFlebotomineoRepository amostraFlebotomineoRepository, AmostraTriatomineosRepository amostraTriatomineosRepository) {
        this.amostraRepository = amostraRepository;
        this.amostraEscorpiaoRepository = amostraEscorpiaoRepository;
        this.amostraFlebotomineoRepository = amostraFlebotomineoRepository;
        this.amostraTriatomineosRepository = amostraTriatomineosRepository;
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

    @Transactional
    public AmostraTriatomineos cadastrarAmostraTriatomineos(AmostraTriatomineosDto dados){
        AmostraTriatomineos novaAmostra = new AmostraTriatomineos(dados);
        return amostraTriatomineosRepository.save(novaAmostra);
    }

    public List<Amostra> listarAmostras(){
        return amostraRepository.findAll();
    }
}
