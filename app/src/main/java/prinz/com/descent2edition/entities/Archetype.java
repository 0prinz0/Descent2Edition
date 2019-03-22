package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Archetype {

    WARRIOR("Krieger","PATH"),
    HEALER("Heiler","PATH"),
    MAGE("Magier","PATH"),
    SCOUT("Kundschafter","PATH");

    private String name;
    private String imagePath;

    private Archetype(String name,String imagePath){
        this.name=name;
        this.imagePath=imagePath;
    }

    public String getName() {
        return name;
    }
}
