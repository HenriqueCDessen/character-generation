package br.com.grupo.estudo.ded.breed.model.human;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;

import br.com.grupo.estudo.ded.breed.model.BreedStrategy;
import java.util.HashMap;
import java.util.Map;

public class Human implements BreedStrategy {

  Map<String, String> infos = new HashMap();

  @Override
  public Map<String, String> generateBreed() {
    infos.put(STRENGTH, "1");
    infos.put(DEXTERITY, "1");
    infos.put(CONSTITUTION, "1");
    infos.put(INTELLIGENCE, "1");
    infos.put(WISDOM, "1");
    infos.put(CHARISMA, "1");
    return infos;
  }
}
