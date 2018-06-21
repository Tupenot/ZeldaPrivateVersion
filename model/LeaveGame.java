package game.model;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class LeaveGame {


    // Leave condition
    private boolean leavegameescape = false;
    private boolean leavegamey = false;

    public boolean checker (KeyEvent event) {
        if (event.getCode() == KeyCode.ESCAPE && leavegamey) {
            leavegameescape = false;
        }

        if (event.getCode() == KeyCode.ESCAPE && !leavegamey) {
            leavegameescape = true;
            System.err.println("[!] You will leave the game, are you sure (y/n) ? [!]");
        }

        if (event.getCode() == KeyCode.Y && leavegameescape) {
            leavegamey = true;
        }

        if (event.getCode() == KeyCode.Y && !leavegameescape) {
            leavegamey = false;
        }

        if (event.getCode() == KeyCode.N) {
            leavegameescape = false;
            leavegamey = false;
        }

        if ((leavegameescape && leavegamey)) {
            System.err.println("[!] See you soon [!]");
            System.exit(0);
        }
            return false;
    }
}

