package game.vue.boss;

import java.io.File;

import javafx.scene.image.Image;

public class ViewFireBoss {
	
		public Image spawn() {
	        File image_fireboss = new File("src/game/resources/boss/firstfireboss.png");
	        Image fireboss = new Image(image_fireboss.toURI().toString());
	        return fireboss;
	    }
		
		public Image unspawn() {
			 File image_fireboss_unspawn = new File("");
		     Image fireboss_unspawn = new Image(image_fireboss_unspawn.toURI().toString());
		        return fireboss_unspawn;
		}
}

