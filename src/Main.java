import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintApp extends JFrame implements MouseListener, MouseMotionListener {
    private int x, y;
    private Graphics g;

    public PaintApp() {
        setTitle("Paint App");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        g = getGraphics();
    }

    public void mouseDragged(MouseEvent e) {
        int newX = e.getX();
        int newY = e.getY();
        g.setColor(Color.WHITE);
        g.drawLine(x, y, newX, newY);
        x = newX;
        y = newY;
    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new PaintApp();
    }
}