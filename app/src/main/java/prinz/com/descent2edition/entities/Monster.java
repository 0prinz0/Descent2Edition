package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Monster {

    MERRIOD("Merriod"),
    AAS_DRACHE("Aas Drache");

    private String name;
    private String imagePath;
    private Attack attack;
    private Size size;
    private Terrain terrain;
    private Terrain terrain2;
    private long speed;
    private long health;
    private Dice[] defenceDice;
    private Dice[] attackDice;
    private Expansion expansion;

    Monster(String name){

        name = name;
    }
}
