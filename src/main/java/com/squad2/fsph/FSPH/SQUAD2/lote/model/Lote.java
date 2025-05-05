package com.squad2.fsph.FSPH.SQUAD2.lote.model;

import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long protocolo;

    @OneToMany(mappedBy = "lote", cascade = CascadeType.ALL)
    private List<Amostra> amostras = new ArrayList<>();

    @PrePersist
    public void gerarProtocolo() {
        // Exemplo: gerar número com base no timestamp
        this.protocolo = System.currentTimeMillis();
    }
}
