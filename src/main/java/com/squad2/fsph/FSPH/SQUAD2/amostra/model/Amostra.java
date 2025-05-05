package com.squad2.fsph.FSPH.SQUAD2.amostra.model;


import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "amostra")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
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

    public Amostra(AmostraDto dados){
        this.dataHora = dados.dataHora();
        this.endereco = new Endereco(dados.enderecoDto());
    }
}
