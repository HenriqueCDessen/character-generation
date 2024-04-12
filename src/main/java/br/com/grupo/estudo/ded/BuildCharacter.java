package br.com.grupo.estudo.ded;

import br.com.grupo.estudo.ded.modify.model.*;
import java.util.HashMap;
import java.util.Map;

import static br.com.grupo.estudo.ded.modify.utils.SkillsConstants.*;

public class BuildCharacter {

  private final Strength strength;
  private final Dexterity dexterity;
  private final Constitution constitution;
  private final Intelligence intelligence;
  private final Wisdom wisdom;
  private final Charisma charisma;
  private final int proficiencyBonus;
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

    skillsMap.put(STRENGTH, strength);
    skillsMap.put(ATHLETIC, strength);

    skillsMap.put(DEXTERITY, dexterity);
    skillsMap.put(STUNT, dexterity);
    skillsMap.put(STEALTH, dexterity);
    skillsMap.put(PRESTIDIGITATION, dexterity);

    skillsMap.put(CONSTITUTION, constitution);

    skillsMap.put(INTELLIGENCE, intelligence);
    skillsMap.put(ARCANA, intelligence);
    skillsMap.put(HISTORY, intelligence);
    skillsMap.put(INVESTIGATION, intelligence);
    skillsMap.put(NATURE, intelligence);

    skillsMap.put(WISDOM, wisdom);
    skillsMap.put(DEALING_WITH_ANIMALS, wisdom);
    skillsMap.put(MEDICINE, wisdom);
    skillsMap.put(PERCEPTION, wisdom);
    skillsMap.put(SURVIVAL, wisdom);

    skillsMap.put(CHARISMA, charisma);
    skillsMap.put(PERFORMANCE, charisma);
    skillsMap.put(BLUFF, charisma);
    skillsMap.put(INTIMIDATION, charisma);
    skillsMap.put(PERSUASION, charisma);
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