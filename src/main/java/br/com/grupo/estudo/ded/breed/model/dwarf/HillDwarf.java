package br.com.grupo.estudo.ded.breed.model.dwarf;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.WISDOM;

import br.com.grupo.estudo.ded.breed.model.BreedStrategy;
import java.util.HashMap;
import java.util.Map;

public class HillDwarf extends Dwarf implements BreedStrategy {

  Map<String, String> infos = new HashMap();

  @Override
  public Map<String, String> generateBreed() {
    infos.putAll(super.generateBreed());
    infos.put(WISDOM, "2");
    infos.put("Firmeza Anã", "+1 PA por nível");
    return infos;
  }
}
