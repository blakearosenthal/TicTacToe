// Blake Rosenthal
// Inherits-Asg5: Graphics MiniProject
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TicTacToe_RosenthalB
{
   public static void main(String[] args)
   {
      JFrame frame = new RectangleFrame2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class RectangleFrame2 extends JFrame
{
   private static final int FRAME_WIDTH = 900;
   private static final int FRAME_HEIGHT = 900;
   private RectangleComponent2 scene;
   
   class MousePressListener implements MouseListener
   {
      public void mousePressed(MouseEvent event)
      {
         int x = event.getX();
         int y = event.getY();
      }
      
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
      public void mousePressed(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
   }
   
   public void RectangleFrame2()
   {
      scene = new RectangleComponent2();
      add(scene);
      
      MouseListener listener = new MousePressListener();
      scene.addMouseListener(listener);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
}

class RectangleComponent2 extends JComponent
{
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;
   private Rectangle box;
   
   public RectangleComponent2()
   {
      box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
   }
   
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.draw(box);
   }
   
   public void moveRectangleTo(int x, int y)
   {
      box.setLocation(x, y);
      repaint();
   }
}

interface MouseListener
{
   void mousePressed(MouseEvent event);
   // Called when a mouse button has been pressed on a component
   void mouseReleased(MouseEvent event);
   // Called when a mouse button has been released on a component
   void mouseClicked(MouseEvent event);
   // Called when the mouse has been clicked on a component
   void mouseEntered(MouseEvent event);
   // Called when the mouse enters a component
   void mouseExited(MouseEvent event);
   // Called when the mouse exits a component
}