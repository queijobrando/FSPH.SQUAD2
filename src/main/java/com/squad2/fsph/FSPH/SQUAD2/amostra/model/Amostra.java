package com.squad2.fsph.FSPH.SQUAD2.amostra.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.lote.model.Lote;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.TipoAmostra;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraEscorpiao;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model.AmostraFlebotomineos;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "amostra")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipoAmostra"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AmostraEscorpiao.class, name = "ESCORPIAO"),
        @JsonSubTypes.Type(value = AmostraFlebotomineos.class, name = "FLEBOTOMINEO")
})
public abstract class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;

    @Embedded
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_amostra")
    @JsonIgnore // O JsonSubTypes vai ignorar quando retornar em formato json (evitar dois campos repetidos)
    private TipoAmostra tipoAmostra; // tipo da amostra (ele é setado automaticamente no tipo correspondente)

    @ManyToOne
    @JoinColumn(name = "lote_id") // Amostra pode ou não ter um lote
    private Lote lote;

    public Amostra(AmostraDto dados){
        this.dataHora = dados.dataHora();
        this.endereco = new Endereco(dados.enderecoDto());
    }
}
