package game.vue.player;

import javafx.scene.image.Image;

import java.io.File;

public class ViewPlayer {

    public Image up() {
        File image_link_up = new File("src/game/resources/player/player_up.png");
        Image link_up = new Image(image_link_up.toURI().toString());
        return link_up;
    }

    public Image down() {
        File image_link_down = new File("src/game/resources/player/player_down.png");
        Image link_down = new Image(image_link_down.toURI().toString());
        return link_down;
    }

    public Image left() {
        File image_link_left = new File("src/game/resources/player/player_left.png");
        Image link_left = new Image(image_link_left.toURI().toString());
        return link_left;
    }

    public Image right() {
        File image_link_right = new File("src/game/resources/player/player_right.png");
        Image link_right = new Image(image_link_right.toURI().toString());
        return link_right;
    }
    
    public Image heart3 () {
    	File image_link_heart3 = new File("src/game/resources/other/3.png");
        Image link_heart3 = new Image(image_link_heart3.toURI().toString());
        return link_heart3;
    }
    
    public Image heart25 () {
    	File image_link_heart25 = new File("src/game/resources/other/2,5.png");
        Image link_heart25 = new Image(image_link_heart25.toURI().toString());
        return link_heart25;
    }
    
    public Image heart2 () {
    	File image_link_heart2 = new File("src/game/resources/other/2.png");
        Image link_heart2 = new Image(image_link_heart2.toURI().toString());
        return link_heart2;
    }
    
    public Image heart15 () {
    	File image_link_heart15 = new File("src/game/resources/other/1,5.png");
        Image link_heart15 = new Image(image_link_heart15.toURI().toString());
        return link_heart15;
    }
    
    public Image heart1 () {
    	File image_link_heart1 = new File("src/game/resources/other/1.png");
        Image link_heart1 = new Image(image_link_heart1.toURI().toString());
        return link_heart1;
    }
    
    public Image heart05 () {
    	File image_link_heart05 = new File("src/game/resources/other/0,5.png");
        Image link_heart05 = new Image(image_link_heart05.toURI().toString());
        return link_heart05;
    }
    
    
    
}
