package br.com.grupo.estudo.ded.modify.model;

import org.jetbrains.annotations.NotNull;

public abstract class ModifySkill {

    private int proficiencyBonus = 0;
    private String name;
    private int point;

    public ModifySkill(int point) {
        this.point = point;
    }

    public void addPoint(int point){
        if (!(point >= 8 && point <= 20)) {
            throw new IllegalArgumentException("O número deve estar no intervalo de 8 a 20.");
        }
        this.point = point;
    }
    public int getModify() {
        if (this.point < 10) {
            return -1;
        }
        return Math.max(0,(this.point - 10) / 2);
    }

    public int getExpertiseOrResistance(@NotNull Boolean haveResist){
        if(haveResist){
            return getModify() + proficiencyBonus;
        }
        return getModify();
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public abstract void setSkill(String skillName, boolean value);
}