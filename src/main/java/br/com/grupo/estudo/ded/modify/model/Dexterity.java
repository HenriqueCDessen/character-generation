package br.com.grupo.estudo.ded.modify.model;

import java.util.HashMap;
import java.util.Map;

public class Dexterity extends ModifySkill {

    private Map<String, Boolean> skills;

    public Dexterity(int point) {super(point);
        this.skills = new HashMap<>();
    }

    @Override
    public void setSkill(String skillName, boolean value) {
        skills.put(skillName, value);
    }

    public int getSkillModifier(String skillName) {
        Boolean skillValue = skills.get(skillName);
        if (skillValue != null && skillValue) {
            return getExpertiseOrResistance(true);
        } else {
            return getExpertiseOrResistance(false);
        }
    }

}
