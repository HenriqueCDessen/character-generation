package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConstitutionTests {
  private static Constitution contitution;

  @BeforeAll
  public static void setUp() {
    contitution = new Constitution(20);
  }

  @Test
  public void should_get_modify() {
    assertEquals(5, contitution.getModify());
  }

  @Test
  public void should_get_proficy() {
    contitution.setSkill("test", true);
    assertEquals(6, contitution.getSkillModifier("test", 1));
    assertEquals(7, contitution.getSkillModifier("test", 2));
  }
}
