
/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * A descendant of JPanel that has a BufferedImage object called picture as a private
 * data member as well as a setPicture function that takes in a
 * BufferedImage object to set picture to. When setPicture changes the value of the picture
 * private data member, it calls repaint, so that PicturePanel's paintComponent function
 * renders the new image
 */


import java.awt.Dimension;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.Graphics;


public class picturePanel extends JPanel implements MouseListener {
    private String messageToShow;
    private int msgX, msgY;
  
    public picturePanel() {
            messageToShow = "(x = 0, y = 0)";
            setPreferredSize(new Dimension(290,400)); 
            addMouseListener(this);
            msgX = 10;
            msgY = 20;
        }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(messageToShow,msgX,msgY);
        try {
            BufferedImage img = ImageIO.read(new File("pic1.png"));
        g.drawImage(img, 0, 0, null);
        } catch (Exception ex){ 

            }
        }
    public void mouseClicked(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        msgX = e.getX();
        msgY = e.getY();
        repaint(); // forces paintComponent to be called
    }
    public void mousePressed(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        repaint(); // forces paintComponent to be called
    }
    public void mouseReleased(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        repaint(); // forces paintComponent to be called
       
    }
    public void mouseEntered(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        repaint(); // forces paintComponent to be called
       
    }
    public void mouseExited(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        repaint(); // forces paintComponent to be called
       
    }
    public void mouseMoved(MouseEvent e) {
        messageToShow = String.format("(%d, %d)",e.getX(),e.getY());
        repaint(); // forces paintComponent to be called
       
    }

    
}
