package lotto;

import java.util.List;

import lotto.controller.GameController;


public class Application {
    public static void main(String[] args) {
    	GameController controller = new GameController();
    	controller.playLotto();
        
    }
}
