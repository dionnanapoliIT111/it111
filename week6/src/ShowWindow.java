import javax.swing. *;

public class ShowWindow {

    public static void main (String[]args) {
        // declare our variables
        // make them CONSTANTS (ie cannot change) - final is what makes them a constant variable

        final int WINDOW_WIDTH = 350; //pixels
        final int WINDOW_HEIGHT = 250; //pixels

        // create a window

        JFrame window = new JFrame();
        // set the Title
        window.setTitle("My Simple Window");

        // set size of window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display, it will not display
        // displaying the window is a boolean
        window.setVisible(true);

    }


}
