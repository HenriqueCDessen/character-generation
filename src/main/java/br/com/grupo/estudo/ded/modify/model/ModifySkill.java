package br.com.grupo.estudo.ded.modify.model;

public abstract class ModifySkill {

  private int point;

  public ModifySkill(int point) {
    invalidPoint(point);
    this.point = point;
  }

  public void addPoint(int point) {
    invalidPoint(point);
    this.point = point;
  }

  public int getModify() {
    if (this.point < 10) {
      return -1;
    }
    return Math.max(0, (this.point - 10) / 2);
  }

  private static void invalidPoint(int point) {
    if (!(point >= 8 && point <= 20)) {
      throw new IllegalArgumentException("O número deve estar no intervalo de 8 a 20.");
    }
  }

  public abstract void setSkill(String skillName, boolean haveProficiency);

  public abstract int getSkillModifier(String skillName, int proficiencyBonus);
}
