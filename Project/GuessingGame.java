import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {

        int compNo = (int) (Math.random() * 100 + 1);
        int userno = 0;
        
        System.out.println("Correct Guess:- " + compNo);
        int count = 1;

        while (userno != compNo) {
            String result = JOptionPane.showInputDialog(null,
                    "Guess number between 1 to 100 ", "Guess the Number:", 3);
            userno = Integer.parseInt(result);
            JOptionPane.showMessageDialog(null, "" + Guess(userno, compNo, count));
            count++;
        }
    }

    public static String Guess(int userno, int compNo, int count) {
        if (userno <= 0 || userno > 100) {
            return "Your guess is invalid";
        } else if (userno == compNo) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userno > compNo) {
            return "Entered number is high. \nTry another number: " + count;
        } else if (userno < compNo) {
            return "Entered number is low.\nTry another number: " + count;
        } else {
            return "Entered number is incorrect\nTry another number: " + count;
        }
    }
}