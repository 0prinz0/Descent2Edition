package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Dice {


    //Defending Dices
    BROWN("Braun",0, "PATH"),
    GREY("Grau",0, "PATH"),
    BLACK("Schwarz",0, "PATH"),

    //Attack Dices
    BLUE("Blau",1, "PATH"),
    RED("Rot", 1,"PATH"),
    YELLOW("Gelb",1, "PATH"),
    GREEN("Grün", 1,"PATH");


    private String name;
    private String imagePath;
    private int type;

    private Dice(String name,int type, String imagePath) {
        name = name;
        imagePath = imagePath;
        type = type;
    }

}
