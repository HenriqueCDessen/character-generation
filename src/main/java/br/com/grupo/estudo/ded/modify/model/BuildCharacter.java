package br.com.grupo.estudo.ded.modify.model;

import java.util.HashMap;
import java.util.Map;

public class BuildCharacter{

    public Strength strength;
    public Dexterity dexterity;
    public Constitution constitution;
    public Intelligence intelligence;
    public Wisdom wisdom;
    public Charisma charisma;
    private Map<String, ModifySkill> skillsMap;

    public BuildCharacter(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,int proficienfy) {
        skillsMap = new HashMap<>();
        this.strength = new Strength(strength);
        this.dexterity = new Dexterity(dexterity);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence);
        this.wisdom = new Wisdom(wisdom);
        this.charisma = new Charisma(charisma);
        initializeSkillsMap();
        inicializeProficiency(proficienfy);
    }

    public void inicializeProficiency(int bonus) {
        strength.setProficiencyBonus(bonus);
        dexterity.setProficiencyBonus(bonus);
        constitution.setProficiencyBonus(bonus);
        intelligence.setProficiencyBonus(bonus);
        wisdom.setProficiencyBonus(bonus);
        charisma.setProficiencyBonus(bonus);
    }

    private void initializeSkillsMap() {
        skillsMap = new HashMap<>();

        skillsMap.put("strength", strength);
        skillsMap.put("Athletic", strength);

        skillsMap.put("dexterity", dexterity);
        skillsMap.put("Stunt", dexterity);
        skillsMap.put("Stealth", dexterity);
        skillsMap.put("Pertidigitation", dexterity);

        skillsMap.put("constitution",constitution);

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

    public void setSkill(String skillName, boolean value, Class<? extends ModifySkill> skillClass) {
        ModifySkill skill = skillsMap.get(skillName);
        if (skill != null && skillClass.isInstance(skill)) {
            skill.setSkill(skillName, value);
        } else {
            throw new IllegalArgumentException("Pericia não encontrada.");
        }
    }

}
