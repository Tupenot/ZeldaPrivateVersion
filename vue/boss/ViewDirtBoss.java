package game.vue.boss;

import java.io.File;

import javafx.scene.image.Image;

public class ViewDirtBoss {
	
	public Image spawn() {
        File image_dirtboss = new File("src/game/resources/boss/firstdirtboss.png");
        Image dirtboss = new Image(image_dirtboss.toURI().toString());
        return dirtboss;
    }
	
	public Image unspawn() {
		 File image_dirtboss_unspawn = new File("");
	     Image dirtboss_unspawn = new Image(image_dirtboss_unspawn.toURI().toString());
	        return dirtboss_unspawn;
	}

}
