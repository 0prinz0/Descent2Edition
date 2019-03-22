package prinz.com.descent2edition.entities;

/**
 * Created by Prinz on 04.03.2019.
 */

public enum Expansion {

    BASIS("Grundspiel","PATH");

    private String name;
    private String imagePath;

    private Expansion(String name, String imagePath){
        name=name;
        imagePath=imagePath;
    }
}
