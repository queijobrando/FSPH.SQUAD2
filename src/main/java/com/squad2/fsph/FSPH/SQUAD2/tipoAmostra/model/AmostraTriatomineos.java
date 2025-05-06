package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model;


import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraTriatomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.*;
import jakarta.persistence.*;

@Table(name = "amostra_triatomineos")
@Entity
public class AmostraTriatomineos extends Amostra {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Peridomicilio peridomicilio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Intradomicilio intradomicilio;

    @Column(nullable = false)
    private String comodoCaptura;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Vestigios vestigios;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Insetifugo insetifugo;

    @Column(nullable = false)
    private Integer numeroInsetos;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Condicao condicao;

    public AmostraTriatomineos(){
        super();
    }

    public AmostraTriatomineos(AmostraTriatomineosDto dados){
        super(new AmostraDto(dados.dataHora(), dados.enderecoDto()));
        this.peridomicilio = dados.peridomicilio();
        this.intradomicilio = dados.intradomicilio();
        this.comodoCaptura = dados.comodoCaptura();
        this.vestigios = dados.vestigios();
        this.insetifugo = dados.insetifugo();
        this.numeroInsetos = dados.numeroInsetos();
        this.condicao = dados.condicao();
    }

}
