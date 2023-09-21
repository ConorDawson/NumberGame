import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        numbergame();
    }

    public static void numbergame(){
        int Score = 0, Round=1;
        NumberGame game = new NumberGame();
        game.generateAnswer(Round,Score);

    }




}