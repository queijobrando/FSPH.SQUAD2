package com.squad2.fsph.FSPH.SQUAD2.amostra.model;


import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.lote.model.Lote;
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
public abstract class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;

    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "lote_id") // Amostra pode ou não ter um lote
    private Lote lote;

    public Amostra(AmostraDto dados){
        this.dataHora = dados.dataHora();
        this.endereco = new Endereco(dados.enderecoDto());
    }
}
