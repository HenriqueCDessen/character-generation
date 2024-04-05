package br.com.grupo.estudo.ded.modify;

import br.com.grupo.estudo.ded.modify.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifySkillTests {


    @Test
    public void should_calculete_modify(){

        Intelligence intelligence = new Intelligence(20);

        intelligence.addPoint(20);
        assertEquals(5,intelligence.getModify());

        intelligence.addPoint(19);
        assertEquals(4,intelligence.getModify());

        intelligence.addPoint(18);
        assertEquals(4,intelligence.getModify());

        intelligence.addPoint(17);
        assertEquals(3,intelligence.getModify());

        intelligence.addPoint(16);
        assertEquals(3,intelligence.getModify());

        intelligence.addPoint(15);
        assertEquals(2,intelligence.getModify());

        intelligence.addPoint(14);
        assertEquals(2,intelligence.getModify());

        intelligence.addPoint(13);
        assertEquals(1,intelligence.getModify());

        intelligence.addPoint(12);
        assertEquals(1,intelligence.getModify());

        intelligence.addPoint(11);
        assertEquals(0,intelligence.getModify());

        intelligence.addPoint(10);
        assertEquals(0,intelligence.getModify());

        intelligence.addPoint(9);
        assertEquals(-1,intelligence.getModify());

        intelligence.addPoint(8);
        assertEquals(-1,intelligence.getModify());

    }

    @Test
    public void should_calculete_pericia(){

        BuildCharacter build = new BuildCharacter(
                10,
                18,
                14,
                16,
                13,
                10,
                2);

        build.setSkill("Arcana",true, Intelligence.class);
        build.setSkill("Pertidigitation",true, Dexterity.class);

        //16 de int = 3 + proficiencia
        assertEquals(5,build.intelligence.getSkillModifier("Arcana"));
        //18 de dex = 4 + proficiencia
        assertEquals(6,build.dexterity.getSkillModifier("Pertidigitation"));
        //10 de car = 0 + proficiencia
        assertEquals(0,build.charisma.getSkillModifier("Performance"));

    }

}
