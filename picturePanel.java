
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

public class picturePanel extends JPanel implements MouseListener, MouseMotionListener  {

    
}
