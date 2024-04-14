package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WisdomTests {

  private static Wisdom wisdom;

  @BeforeAll
  public static void setUp() {
    wisdom = new Wisdom(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, wisdom.getModify());
  }

  @Test
  public void should_get_proficy() {
    wisdom.setSkill("test", true);
    assertEquals(6, wisdom.getSkillModifier("test", 1));
    assertEquals(7, wisdom.getSkillModifier("test", 2));
  }
}
