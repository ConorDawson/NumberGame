import javax.swing.*;

public class NumberGame {

    int answerint;
    int randomnumber;

    public void generateAnswer(int CurrentRound, int CurrentScore){
        int Round = CurrentRound;
        int Score = CurrentScore;
        randomnumber = (int) (Math.random()*10)+1;
        displayGame(Round, Score);
    }
    public void displayGame(int CurrentRound, int CurrentScore){
        int Round = CurrentRound;
        int Score = CurrentScore;
        if(randomnumber == 10){

            int [] numbers =new int[] {randomnumber-4,randomnumber-3,randomnumber-2,randomnumber-1};
            String answer= JOptionPane.showInputDialog("What number is missing?\n"+numbers[0]+" "+numbers[1]+" "+numbers[2]+" "+ numbers[3]+" _ " );

            answerint = Integer.parseInt(answer);
        }//if random number is 10
        else if (randomnumber==9) {
            int [] numbers =new int[] {randomnumber-3,randomnumber-2,randomnumber-1,randomnumber+1};
            String answer=JOptionPane.showInputDialog("What number is missing?\n"+numbers[0]+" "+numbers[1]+" "+numbers[2]+" _ "+ numbers[3] );
            answerint = Integer.parseInt(answer);
        }//if random number is 9
        else if (randomnumber==1) {
            int [] numbers =new int[] {randomnumber+1,randomnumber+2,randomnumber+3,randomnumber+4};
            String answer=JOptionPane.showInputDialog("What number is missing?\n_ "+numbers[0]+" "+numbers[1]+" "+numbers[2]+" "+ numbers[3] );
            answerint = Integer.parseInt(answer);
        }// if random number is 1
        else if (randomnumber == 2) {
            int [] numbers =new int[] {randomnumber-1,randomnumber+1,randomnumber+2,randomnumber+3};
            String answer=JOptionPane.showInputDialog("What number is missing?\n"+numbers[0]+" _ "+numbers[1]+" "+numbers[2]+" "+ numbers[3] );
            answerint = Integer.parseInt(answer);
        }// if random number is 2
        else{
            int [] numbers =new int[] {randomnumber-2,randomnumber-1,randomnumber+1,randomnumber+2};
            String answer=JOptionPane.showInputDialog("What number is missing?\n"+numbers[0]+" "+numbers[1]+" _ "+numbers[2]+" "+ numbers[3] );
            answerint = Integer.parseInt(answer);
        }// numbers between 3 and 8

        checkAnswer( Round,  Score);
    }
    public void checkAnswer(int CurrentRound, int CurrentScore){
        int Round = CurrentRound;
        int Score = CurrentScore;

        if(answerint == randomnumber && Round <= 10){
            Round++;
            JOptionPane.showMessageDialog(null, "+ 1 Point");
            Score++;
            generateAnswer(Round,Score);
        }//Correct Answer
        else if(Round > 10){
        JOptionPane.showMessageDialog(null, "Your Score is "+ Score+" out of 10");
        System.exit(0);
    }//Game Win
        else{
            JOptionPane.showMessageDialog(null, "Wrong Try again", "Error", JOptionPane.ERROR_MESSAGE);
            Round++;
            displayGame(Round,Score);
        }//Wrong Answer

    }

}
