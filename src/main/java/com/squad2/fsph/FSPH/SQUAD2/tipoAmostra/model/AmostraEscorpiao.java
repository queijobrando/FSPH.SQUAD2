package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "amostraEscorpiao")
@Entity
public class AmostraEscorpiao extends Amostra {

    private Integer quantidade;
    private boolean acidente;

    public AmostraEscorpiao(AmostraEscorpiaoDto dados) {
        super(new AmostraDto(dados.dataHora(), dados.enderecoDto()));
        this.quantidade = dados.quantidade();
        this.acidente = dados.acidente();
    }
}
