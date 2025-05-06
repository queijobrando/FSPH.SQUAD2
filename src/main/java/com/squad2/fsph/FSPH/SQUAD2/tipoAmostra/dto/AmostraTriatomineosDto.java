package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.EnderecoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.*;

import java.time.LocalDateTime;

public record AmostraTriatomineosDto(LocalDateTime dataHora,
                                     EnderecoDto enderecoDto,
                                     Peridomicilio peridomicilio,
                                     Intradomicilio intradomicilio,
                                     String comodoCaptura,
                                     Vestigios vestigios,
                                     Insetifugo insetifugo,
                                     Integer numeroInsetos,
                                     Condicao condicao) {
}
