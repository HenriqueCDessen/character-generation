package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntelligenceTests {

  private static Intelligence intelligence;

  @BeforeAll
  public static void setUp() {
    intelligence = new Intelligence(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, intelligence.getModify());
  }

  @Test
  public void should_get_proficy() {
    intelligence.setSkill("test", true);
    assertEquals(6, intelligence.getSkillModifier("test", 1));
    assertEquals(7, intelligence.getSkillModifier("test", 2));
  }
}
