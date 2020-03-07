import javax.swing.*;
import java.io.IOException;

public class Randomizer {
    public static void main(String[] args) throws IOException {
        String input, message, title;
        int a = 0;
        int b;
        input = JOptionPane.showInputDialog(null, "Enter amount of numbers:", "Randomizer", JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null, "You haven't entered an amount of numbers!", "Input error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        b = Integer.parseInt(input);
        int randomNumber = a + (int) (Math.random() * b);
        JOptionPane.showMessageDialog(null, "Your number: " + randomNumber, "Randomizer", JOptionPane.PLAIN_MESSAGE);
    }
}
