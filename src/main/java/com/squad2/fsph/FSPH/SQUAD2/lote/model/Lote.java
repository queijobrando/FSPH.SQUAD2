package com.squad2.fsph.FSPH.SQUAD2.lote.model;

import jakarta.persistence.*;

@Entity
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long protocolo;

    @PrePersist
    public void gerarProtocolo() {
        // Exemplo: gerar número com base no timestamp
        this.protocolo = System.currentTimeMillis();
    }
}
