package br.com.grupo.estudo.ded.modify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.grupo.estudo.ded.BuildCharacter;
import br.com.grupo.estudo.ded.modify.model.Intelligence;
import org.junit.jupiter.api.Test;

public class ModifySkillTests {

  @Test
  public void should_calculete_modify() {

    Intelligence intelligence = new Intelligence(20);

    intelligence.addPoint(20);
    assertEquals(5, intelligence.getModify());

    intelligence.addPoint(19);
    assertEquals(4, intelligence.getModify());

    intelligence.addPoint(18);
    assertEquals(4, intelligence.getModify());

    intelligence.addPoint(17);
    assertEquals(3, intelligence.getModify());

    intelligence.addPoint(16);
    assertEquals(3, intelligence.getModify());

    intelligence.addPoint(15);
    assertEquals(2, intelligence.getModify());

    intelligence.addPoint(14);
    assertEquals(2, intelligence.getModify());

    intelligence.addPoint(13);
    assertEquals(1, intelligence.getModify());

    intelligence.addPoint(12);
    assertEquals(1, intelligence.getModify());

    intelligence.addPoint(11);
    assertEquals(0, intelligence.getModify());

    intelligence.addPoint(10);
    assertEquals(0, intelligence.getModify());

    intelligence.addPoint(9);
    assertEquals(-1, intelligence.getModify());

    intelligence.addPoint(8);
    assertEquals(-1, intelligence.getModify());
  }

  @Test
  public void should_calculete_pericia() {

    BuildCharacter buildCharacterOne = new BuildCharacter(10, 18, 14, 16, 13, 10, 2);

    buildCharacterOne.setSkill("Arcana");
    buildCharacterOne.setSkill("Pertidigitation");

    BuildCharacter buildCharacterTwo = new BuildCharacter(10, 18, 14, 16, 13, 10, 3);

    buildCharacterTwo.setSkill("Arcana");
    buildCharacterTwo.setSkill("Pertidigitation");

    assertEquals(5, buildCharacterOne.getSkill("Arcana"));
    assertEquals(6, buildCharacterOne.getSkill("Pertidigitation"));
    assertEquals(0, buildCharacterOne.getSkill("Performance"));

    assertEquals(6, buildCharacterTwo.getSkill("Arcana"));
    assertEquals(7, buildCharacterTwo.getSkill("Pertidigitation"));
    assertEquals(0, buildCharacterTwo.getSkill("Performance"));
  }
}
