package br.com.grupo.estudo.ded.breed.model.dwarf;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;

import br.com.grupo.estudo.ded.breed.model.BreedStrategy;
import java.util.HashMap;
import java.util.Map;

public class MountainDwarf extends Dwarf implements BreedStrategy {

  Map<String, String> infos = new HashMap();

  @Override
  public Map<String, String> generateBreed() {
    infos.putAll(super.generateBreed());
    infos.put(STRENGTH, "2");
    return infos;
  }
}
