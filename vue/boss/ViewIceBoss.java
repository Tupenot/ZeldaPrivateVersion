package game.vue.boss;

import java.io.File;

import javafx.scene.image.Image;

public class ViewIceBoss {
	
	public Image spawn() {
        File image_iceboss = new File("src/game/resources/boss/firsticeboss.png");
        Image iceboss = new Image(image_iceboss.toURI().toString());
        return iceboss;
    }
	
	public Image unspawn() {
		 File image_iceboss_unspawn = new File("");
	     Image iceboss_unspawn = new Image(image_iceboss_unspawn.toURI().toString());
	        return iceboss_unspawn;
	}
}
