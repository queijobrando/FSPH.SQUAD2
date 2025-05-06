package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraEscorpiaoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.TipoAmostra;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Table(name = "amostra_escorpiao")
@Entity
@Getter
public class AmostraEscorpiao extends Amostra {

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private boolean acidente;

    public AmostraEscorpiao() {
        super();
    }

    public AmostraEscorpiao(AmostraEscorpiaoDto dados) {
        super(new AmostraDto(dados.dataHora(), dados.enderecoDto()));
        this.quantidade = dados.quantidade();
        this.acidente = dados.acidente();
        this.setTipoAmostra(TipoAmostra.ESCORPIAO); // Seta o tipo da amostra
    }
}