package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CharismaTests {

  private static Charisma charisma;

  @BeforeAll
  public static void setUp() {
    charisma = new Charisma(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, charisma.getModify());
  }

  @Test
  public void should_get_proficy() {
    charisma.setSkill("test", true);
    assertEquals(6, charisma.getSkillModifier("test", 1));
    assertEquals(7, charisma.getSkillModifier("test", 2));
  }
}
