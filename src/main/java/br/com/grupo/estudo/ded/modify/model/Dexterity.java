package br.com.grupo.estudo.ded.modify.model;

import java.util.HashMap;
import java.util.Map;

public class Dexterity extends ModifySkill {

  private final Map<String, Boolean> skills;

  public Dexterity(int point) {
    super(point);
    this.skills = new HashMap<>();
  }

  @Override
  public void setSkill(String skillName, boolean haveProficiency) {
    skills.put(skillName, haveProficiency);
  }

  @Override
  public int getSkillModifier(String skillName, int proficiencyBonus) {
    Boolean skillValue = skills.get(skillName);
    if (skillValue != null && skillValue) {
      return getModify() + proficiencyBonus;
    }
    return getModify();
  }
}
