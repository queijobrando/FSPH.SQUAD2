package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.model;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.AmostraDto;
import com.squad2.fsph.FSPH.SQUAD2.amostra.model.Amostra;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "amostraLarva")
@Entity
public class AmostraLarva extends Amostra {

    private Integer quantidadeTubito;

}
