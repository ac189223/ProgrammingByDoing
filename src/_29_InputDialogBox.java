import javax.swing.*;

public class _29_InputDialogBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?", ".....");
        String input = JOptionPane.showInputDialog("How old are you?", ".....");
        int age = Integer.parseInt(input);

        System.out.println("Hello " + age + " years old " + name + ".");
        //System.exit(1);
    }
}
