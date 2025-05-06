package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto.AmostraFlebotomineosDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.*;
import jakarta.persistence.*;


@Table(name = "amostra_flebotomineos")
@Entity
public class AmostraFlebotomineos extends Amostra {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassificacaoAreaLV classificacaoAreaLV;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassificacaoAreaLT classificacaoAreaLT;

    // Tipo de atividade
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAtividadeLV tipoAtividadeLV;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAtividadeLT tipoAtividadeLT;

    // Dados ambientais

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoVegetacao tipoVegetacao;

    @Column(nullable = false)
    private Integer distanciaVegetacao;

    @Column(nullable = false)
    private String temperaturaChegada;

    @Column(nullable = false)
    private String temperaturaSaida;

    @Column(nullable = false)
    private String temperaturaMax;

    @Column(nullable = false)
    private String temperaturaMin;

    @Column(nullable = false)
    private String umidadeChegada;

    @Column(nullable = false)
    private String umidadeSaida;

    @Column(nullable = false)
    private String umidadeMax;

    @Column(nullable = false)
    private String umidadeMin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FasesLua faseLua;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Vento vento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PresencaAnimalIntra presencaAnimalIntra;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PresencaAnimalPeri presencaAnimalPeri;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Galinheiro galinheiro;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estacao estacaoAno;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MateriaOrganica materiaOrganica;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Precipitacao precipitacao;

    private String observacao;

    public AmostraFlebotomineos() {
        super();
    }

    public AmostraFlebotomineos(AmostraFlebotomineosDto dados){
        super(new AmostraDto(dados.dataHora(), dados.enderecoDto()));
        this.classificacaoAreaLV = dados.classificacaoAreaLV();
        this.classificacaoAreaLT = dados.classificacaoAreaLT();
        this.tipoAtividadeLV = dados.tipoAtividadeLV();
        this.tipoAtividadeLT = dados.tipoAtividadeLT();
        this.tipoVegetacao = dados.tipoVegetacao();
        this.distanciaVegetacao = dados.distanciaVegetacao();
        this.temperaturaChegada = dados.temperaturaChegada();
        this.temperaturaSaida = dados.temperaturaSaida();
        this.temperaturaMax = dados.temperaturaMax();
        this.temperaturaMin = dados.temperaturaMin();
        this.umidadeChegada = dados.umidadeChegada();
        this.umidadeSaida = dados.umidadeSaida();
        this.umidadeMax = dados.umidadeMax();
        this.umidadeMin = dados.umidadeMin();
        this.faseLua = dados.faseLua();
        this.vento = dados.vento();
        this.presencaAnimalIntra = dados.presencaAnimalIntra();
        this.presencaAnimalPeri = dados.presencaAnimalPeri();
        this.galinheiro = dados.galinheiro();
        this.estacaoAno = dados.estacaoAno();
        this.materiaOrganica = dados.materiaOrganica();
        this.precipitacao = dados.precipitacao();
        this.observacao = dados.observacao();
    }
}
