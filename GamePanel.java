import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
//new comment
//this is the game panel class, it will be added to the window and will handle the game loop and rendering
public class GamePanel extends JPanel implements Runnable {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 900;
    final int FPS = 120;
    Thread gameThread;
    Board board = new Board();

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start(); //call the run method
    }

    @Override
    public void run() {
     //! game loop, dev must learn how game loops work, this is an important one.
        long lastTime = System.nanoTime();
        double nsPerTick = 1000000000.0 / FPS;
        double delta = 0;

        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nsPerTick;
            lastTime = now;

            while (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    private void update() {
        //update game state here

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw game elements here
        //change the graphics object to a 2D graphics object so we can use 2D methods
        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);
    }
}
