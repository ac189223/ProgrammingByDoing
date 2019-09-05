import javax.swing.*;

public class _39_AlphabeticalOrder {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name: ", "........");
        String output;

        if (name.compareTo("Carswell") < 0) output = "you don't have to wait long";
        else if (name.compareTo("Jones") < 0) output = "that's not bad";
        else if (name.compareTo("Smith") < 0) output = "looks like a bit of a wait";
        else if (name.compareTo("Young") < 0) output = "it's gonna be a while";
        else output = "not going anywhere for a while?";

        JOptionPane.showMessageDialog(null, name + ", " + output);
        System.exit(0);
    }
}
