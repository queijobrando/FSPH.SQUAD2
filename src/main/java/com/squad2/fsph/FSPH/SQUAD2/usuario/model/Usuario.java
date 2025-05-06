package com.squad2.fsph.FSPH.SQUAD2.usuario.model;

import com.squad2.fsph.FSPH.SQUAD2.usuario.enuns.Setor;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String senha;
    private Setor setor;
}
