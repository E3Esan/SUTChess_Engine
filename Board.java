import java.awt.Graphics2D;
//this is the board class, it will handle the drawing of the chess board and pieces
public class Board {
    final int WIDTH = 8;
    final int HEIGHT = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE/2;
    
    public void draw(Graphics2D g2) {
        //if the sum of the row and column is even, draw a light square, otherwise draw a dark square

        //! please study this code, it is a very important concept in game development.
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                if ((row + col) % 2 == 0) {
                    g2.setColor(new java.awt.Color(236, 235, 231));
                } else {
                    g2.setColor(new java.awt.Color(50, 47, 53));
                }
                g2.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
        }
    }
}