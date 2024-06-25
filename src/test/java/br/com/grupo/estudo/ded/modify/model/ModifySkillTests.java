package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ModifySkillTests {

  @Test
  public void should_calculete_modify() {

    Intelligence intelligence = new Intelligence(8);

    intelligence.addPoint(2);
    assertEquals(0, intelligence.getModify());
  }

  @Test
  public void should_throw_exception_when_point_more_than_twenty() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              new Intelligence(21);
            });

    assert (exception.getMessage().contains("O número deve estar no intervalo de 8 a 20."));
  }

  @Test
  public void should_throw_exception_when_point_less_than_eight() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              new Intelligence(7);
            });

    assert (exception.getMessage().contains("O número deve estar no intervalo de 8 a 20."));
  }
}
