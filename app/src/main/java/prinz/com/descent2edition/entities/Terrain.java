package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Terrain {

    DARK("Dunkel", "PATH"),
    CAVE("Dunkel", "PATH"),
    MOUNTAIN("Dunkel", "PATH"),
    CURSED("Dunkel", "PATH"),
    CIVILZED("Dunkel", "PATH"),
    BUILDING("Dunkel", "PATH"),
    WILDERNESS("Dunkel", "PATH"),
    HOT("Dunkel", "PATH"),
    COLD("Dunkel", "PATH"),
    WATER("Dunkel", "PATH");


    private String name;
    private String imagePath;

    private Terrain(String name, String imagePath) {
        name = name;
        imagePath = imagePath;
    }
}
