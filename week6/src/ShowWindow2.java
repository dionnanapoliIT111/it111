import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {

    public static void main (String[]args) {

        final int WINDOW_WIDTH = 300; //pixels
        final int WINDOW_HEIGHT = 350; //pixels


        JFrame window = new JFrame();

        JLabel myLabel = new JLabel("My First Big Label!!!");

        myLabel.setBounds(20, 45, 220, 30);

        myLabel.setFont(new Font("Verdana", Font.PLAIN, 16));

        JLabel myLabel2 = new JLabel("My Second Big Label!");

        myLabel2.setBounds(20, 100, 300, 50);

        myLabel2.setFont(new Font("Verdana", Font.BOLD, 12));

        JTextField textField1 = new JTextField();

        textField1.setBounds(20, 80, 220, 30);

        JTextField textField2 = new JTextField();

        textField2.setBounds(20, 145, 220, 30);

        window.setTitle("A Simple Window");

        window.setLayout(null);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.getContentPane().setBackground(Color.red);

        window.setLocation(600, 250);

        window.add(myLabel);

        window.add(myLabel2);

        window.add(textField1);

        window.add(textField2);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);

    }


}
