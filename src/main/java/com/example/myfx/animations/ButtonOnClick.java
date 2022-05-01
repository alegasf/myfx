package com.example.myfx.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Merkulov A
 */
public class ButtonOnClick {
    private TranslateTransition translateTransition;

    public ButtonOnClick(Node node) {
        translateTransition = new TranslateTransition(Duration.millis(100), node);
        translateTransition.setFromX(0f);
        translateTransition.setByX(10f);
        translateTransition.setCycleCount(3);
        translateTransition.setAutoReverse(true);
    }

    public void playAnimation() {
        translateTransition.playFromStart();
    }
}
