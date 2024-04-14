package br.com.grupo.estudo.ded.modify.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
