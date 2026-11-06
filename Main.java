import javax.swing.JFrame;
//this is the main class that will run the game, it will create a window and add the game panel to it
public class Main {
    public static void main(String[] args) throws Exception {
        
        //create a window
        JFrame window = new JFrame("Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(900, 900);

        //add our game panel to the window
        GamePanel panel = new GamePanel();
        window.add(panel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.launchGame(); //call the launchGame method to start the game loop
    }
}
