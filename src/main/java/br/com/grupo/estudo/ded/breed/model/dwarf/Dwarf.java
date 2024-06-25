package br.com.grupo.estudo.ded.breed.model.dwarf;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;

import java.util.HashMap;
import java.util.Map;

public abstract class Dwarf {

  Map<String, String> infos = new HashMap();

  public Map<String, String> generateBreed() {
    infos.put(CONSTITUTION, "2");
    infos.put("Idiomas", "Anão e Comum");
    infos.put("Deslocamento", "7M");
    infos.put(
        "ExtraData",
        "Ferramentas: Proficiência em um entre ferramentas de Ferreiro, Maçom ou Cervejeiro.\n"
            + "Lento e Firme: Deslocamento não é reduzido por armadura.\n"
            + "Ligação com Pedra: Adiciona dobro de proficiência em História relacionado à origem de trabalhos de pedra.\n"
            + "Resiliência: Resistência a dano de veneno e Vantagem em testes de resistência contra veneno.\n"
            + "Treino em Combate Anão: Proficiência com machado de guerra, machadinha, martelo de arremesso, martelo de guerra.\n"
            + "Visão no Escuro: Trata escuridão a 18m como luz baixa, e luz baixa como brilhante");

    return infos;
  }
}
