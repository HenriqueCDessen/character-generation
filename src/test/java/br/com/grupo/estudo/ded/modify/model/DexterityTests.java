package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DexterityTests {

  private static Dexterity dexterity;

  @BeforeAll
  public static void setUp() {
    dexterity = new Dexterity(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, dexterity.getModify());
  }

  @Test
  public void should_get_proficy() {
    dexterity.setSkill("test", true);
    assertEquals(6, dexterity.getSkillModifier("test", 1));
    assertEquals(7, dexterity.getSkillModifier("test", 2));
  }
}
