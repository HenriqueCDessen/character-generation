package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StrengthTests {

  private static Strength strength;

  @BeforeAll
  public static void setUp() {
    strength = new Strength(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, strength.getModify());
  }

  @Test
  public void should_get_proficy() {
    strength.setSkill("test", true);
    assertEquals(6, strength.getSkillModifier("test", 1));
    assertEquals(7, strength.getSkillModifier("test", 2));
  }
}
