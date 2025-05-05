package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.EnderecoDto;

import java.time.LocalDateTime;

public record AmostraEscorpiaoDto(LocalDateTime dataHora, EnderecoDto enderecoDto, Integer quantidade , boolean acidente) {
}
