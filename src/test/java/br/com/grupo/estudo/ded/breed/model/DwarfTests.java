package br.com.grupo.estudo.ded.breed.model;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.grupo.estudo.ded.breed.model.dwarf.HillDwarf;
import br.com.grupo.estudo.ded.breed.model.dwarf.MountainDwarf;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DwarfTests {

  @Test
  public void should_get() {
    BreedStrategy breedStrategy = new MountainDwarf();
    Map<String, String> breedAttributes = breedStrategy.generateBreed();
    assertEquals("2", breedAttributes.get(CONSTITUTION));
    assertEquals("2", breedAttributes.get(STRENGTH));

    System.out.println(breedAttributes.values());
  }

  @Test
  public void should_get_get() {
    BreedStrategy breedStrategy = new HillDwarf();
    Map<String, String> breedAttributes = breedStrategy.generateBreed();
    assertEquals("2", breedAttributes.get(CONSTITUTION));
    assertEquals("2", breedAttributes.get(WISDOM));

    System.out.println(breedAttributes.values());
  }
}
