package br.com.grupo.estudo.ded;

import br.com.grupo.estudo.ded.modify.model.*;

import java.util.HashMap;
import java.util.Map;

public class BuildCharacter {

  private final Strength strength;
  private final Dexterity dexterity;
  private final Constitution constitution;
  private final Intelligence intelligence;
  private final Wisdom wisdom;
  private final Charisma charisma;
  private int proficiencyBonus = 0;
  private Map<String, ModifySkill> skillsMap;

  public BuildCharacter(
      int strength,
      int dexterity,
      int constitution,
      int intelligence,
      int wisdom,
      int charisma,
      int proficiencyBonus) {
    skillsMap = new HashMap<>();
    this.strength = new Strength(strength);
    this.dexterity = new Dexterity(dexterity);
    this.constitution = new Constitution(constitution);
    this.intelligence = new Intelligence(intelligence);
    this.wisdom = new Wisdom(wisdom);
    this.charisma = new Charisma(charisma);
    this.proficiencyBonus = proficiencyBonus;
    initializeSkillsMap();
  }

  private void initializeSkillsMap() {
    skillsMap = new HashMap<>();

    skillsMap.put("strength", strength);
    skillsMap.put("Athletic", strength);

    skillsMap.put("dexterity", dexterity);
    skillsMap.put("Stunt", dexterity);
    skillsMap.put("Stealth", dexterity);
    skillsMap.put("Pertidigitation", dexterity);

    skillsMap.put("constitution", constitution);

    skillsMap.put("intelligence", intelligence);
    skillsMap.put("Arcana", intelligence);
    skillsMap.put("History", intelligence);
    skillsMap.put("Investigation", intelligence);
    skillsMap.put("Nature", intelligence);

    skillsMap.put("wisdom", wisdom);
    skillsMap.put("DealingWithAnimals", wisdom);
    skillsMap.put("Medicine", wisdom);
    skillsMap.put("Perception", wisdom);
    skillsMap.put("Survival", wisdom);

    skillsMap.put("charisma", charisma);
    skillsMap.put("Performance", charisma);
    skillsMap.put("bluff", charisma);
    skillsMap.put("intimidation", charisma);
    skillsMap.put("Persuasion", charisma);
  }

  public void setSkill(String skillName) {
    ModifySkill skill = skillsMap.get(skillName);

    if (skill == null) {
      throw new IllegalArgumentException("Perícia não encontrada.");
    }

    skill.setSkill(skillName, true);
  }

  public int getSkill(String skillName) {
    ModifySkill skill = skillsMap.get(skillName);

    if (skill == null) {
      throw new IllegalArgumentException("Perícia não encontrada.");
    }

    return skill.getSkillModifier(skillName, this.proficiencyBonus);
  }
}
