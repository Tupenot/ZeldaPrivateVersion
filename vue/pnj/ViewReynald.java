package game.vue.pnj;

import java.io.File;

import javafx.scene.image.Image;

public class ViewReynald {
	
	public Image spawn() {
        File image_reynald = new File("src/game/resources/pnj/Pnj Reynald Gauche.png");
        Image reynald = new Image(image_reynald.toURI().toString());
        return reynald;
    }
	
	public Image unspawn() {
		 File image_reynald_unspawn = new File("");
	     Image reynald_unspawn = new Image(image_reynald_unspawn.toURI().toString());
	        return reynald_unspawn;
	}
}
