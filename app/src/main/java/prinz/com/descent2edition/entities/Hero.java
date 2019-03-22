package prinz.com.descent2edition.entities;

import prinz.com.descent2edition.R;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Hero {

    ALYS_RAINE("Alys Raine", R.drawable.warrior, Archetype.WARRIOR, 4, 12, 4, Dice.GREY, 2, 3, 4, 2, "HELDENFÄHIGKEIT", "HELDENTAT", Expansion.BASIS, "FLUFFTEXT"),
    SHIVER("Shiver",R.drawable.warrior, Archetype.MAGE, 4, 10, 4, Dice.GREY, 2, 3, 4, 2, "HELDENFÄHIGKEIT", "HELDENTAT", Expansion.BASIS, "FLUFFTEXT");


    private String name;
    private int imagePath;
    private Archetype archetype;
    private long speed;
    private long health;
    private long stamina;
    private Dice defenceDice;
    private long strength;
    private long willpower;
    private long knowledge;
    private long awareness;
    private String heroAbility;
    private String heroicFeat;
    private Expansion expansion;
    private String fluffText;

    private Hero(String name, Integer imagePath, Archetype archetype, long speed, long health, long stamina, Dice defenceDice, long strength, long willpower, long knowledge, long awareness, String heroAbility, String heroicFeat, Expansion expansion, String fluffText) {
        this.name = name;
        this.imagePath = imagePath;
        this.archetype = archetype;
        this.speed = speed;
        this.health = health;
        this.stamina = stamina;
        this.defenceDice = defenceDice;
        this.strength = strength;
        this.willpower = willpower;
        this.knowledge = knowledge;
        this.awareness = awareness;
        this.heroAbility = heroAbility;
        this.heroicFeat = heroicFeat;
        this.expansion = expansion;
        this.fluffText = fluffText;
    }

    public String getName() {
        return name;
    }

    public Archetype getArchetype() {
        return archetype;
    }

    public int getImagePath() {
        return imagePath;
    }
}
