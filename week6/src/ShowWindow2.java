import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {

    public static void main (String[]args) {

        final int WINDOW_WIDTH = 350; //pixels
        final int WINDOW_HEIGHT = 250; //pixels


        JFrame window = new JFrame();

        JLabel myLabel = new JLabel();

        JLabel myLabel2 = new JLabel();

        JTextField textField1 = new JTextField();

        JTextField textField2 = new JTextField();

        window.setTitle("A Simple Window");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.getContentPane().setBackground(Color.red);

        window.setLocation(550, 250);

        window.add(myLabel);

        window.add(myLabel2);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);

    }


}
