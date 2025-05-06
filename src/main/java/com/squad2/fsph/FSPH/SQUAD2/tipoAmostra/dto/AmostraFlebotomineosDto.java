package com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.dto;

import com.squad2.fsph.FSPH.SQUAD2.amostra.dto.EnderecoDto;
import com.squad2.fsph.FSPH.SQUAD2.tipoAmostra.enuns.*;

import java.time.LocalDateTime;

public record AmostraFlebotomineosDto(LocalDateTime dataHora,
                                      EnderecoDto enderecoDto,
                                      ClassificacaoAreaLT classificacaoAreaLT,
                                      ClassificacaoAreaLV classificacaoAreaLV,
                                      TipoAtividadeLT tipoAtividadeLT,
                                      TipoAtividadeLV tipoAtividadeLV,
                                      TipoVegetacao tipoVegetacao,
                                      Integer distanciaVegetacao,
                                      String temperaturaChegada,
                                      String temperaturaSaida,
                                      String temperaturaMax,
                                      String temperaturaMin,
                                      String umidadeChegada,
                                      String umidadeSaida,
                                      String umidadeMax,
                                      String umidadeMin,
                                      FasesLua faseLua,
                                      Vento vento,
                                      PresencaAnimalIntra presencaAnimalIntra,
                                      PresencaAnimalPeri presencaAnimalPeri,
                                      Galinheiro galinheiro,
                                      Estacao estacaoAno,
                                      MateriaOrganica materiaOrganica,
                                      Precipitacao precipitacao,
                                      String observacao) {
}
