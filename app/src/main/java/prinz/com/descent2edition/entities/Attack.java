package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Attack {

    MELEE("Nahkampf", "PATH"),
    RANGED("Fernkampf", "PATH");

    private String name;
    private String imagePath;

    private Attack(String name, String imagePath) {
        name = name;
        imagePath = imagePath;
    }
}
