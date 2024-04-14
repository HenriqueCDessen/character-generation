package br.com.grupo.estudo.ded;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;
import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.PERFORMANCE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuildCharacterTests {

  private static BuildCharacter buildCharacter;

  @BeforeAll
  public static void setUp() {
    buildCharacter = new BuildCharacter(18, 18, 14, 10, 10, 10, 1);
  }

  @Test
  public void should_create_character() {
    buildCharacter.setSkill(STRENGTH);
    buildCharacter.setSkill(ATHLETIC);

    buildCharacter.setSkill(DEXTERITY);
    buildCharacter.setSkill(STEALTH);
    buildCharacter.setSkill(PRESTIDIGITATION);

    assertEquals(5, buildCharacter.getSkill(STRENGTH));
    assertEquals(5, buildCharacter.getSkill(ATHLETIC));

    assertEquals(5, buildCharacter.getSkill(DEXTERITY));
    assertEquals(4, buildCharacter.getSkill(STUNT));
    assertEquals(5, buildCharacter.getSkill(STEALTH));
    assertEquals(5, buildCharacter.getSkill(PRESTIDIGITATION));

    assertEquals(2, buildCharacter.getSkill(CONSTITUTION));
  }

  @Test
  public void should_create_character_two_characters_with_different_proficiency_bonus() {

    BuildCharacter buildCharacterOne = new BuildCharacter(10, 18, 14, 16, 13, 10, 2);

    buildCharacterOne.setSkill(ARCANA);
    buildCharacterOne.setSkill(PRESTIDIGITATION);

    BuildCharacter buildCharacterTwo = new BuildCharacter(10, 18, 14, 16, 13, 10, 3);

    buildCharacterTwo.setSkill(ARCANA);
    buildCharacterTwo.setSkill(PRESTIDIGITATION);

    assertEquals(5, buildCharacterOne.getSkill(ARCANA));
    assertEquals(6, buildCharacterOne.getSkill(PRESTIDIGITATION));
    assertEquals(0, buildCharacterOne.getSkill(PERFORMANCE));

    assertEquals(6, buildCharacterTwo.getSkill(ARCANA));
    assertEquals(7, buildCharacterTwo.getSkill(PRESTIDIGITATION));
    assertEquals(0, buildCharacterTwo.getSkill(PERFORMANCE));
  }

  @Test
  public void should_throw_exception_when_set_invalid_skill() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              buildCharacter.setSkill("InvalidSkill");
            });

    assert (exception.getMessage().contains("Perícia não encontrada."));
  }

  @Test
  public void should_throw_exception_when_get_invalid_skill() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              buildCharacter.getSkill("InvalidSkill");
            });

    assert (exception.getMessage().contains("Perícia não encontrada."));
  }
}
