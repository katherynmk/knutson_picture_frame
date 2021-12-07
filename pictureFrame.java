/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * A JFrame descendant. It should be 290 pixels wide and 400 pixels
 * tall. It should use a BorderLayout to arrange the controls as shown in the examples above.
 * The north part should be occupied by a PicturePanel. The center of the PictureFrame should
 * consist of a JPanel that likewise uses a BorderLayout, with its north section filled with a
 * JTextField for holding the date, its center section filled with the description JTextArea, and its
 * south section filled with a JPanel that holds the three buttons.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.Graphics;

public class pictureFrame extends JFrame {
    ArrayList<BufferedImage> loadedpictures = pictureLoader.loadImagesFromPictureData(pictureDataReader.readQuestionsFromFile("descriptions.txt"));
    ArrayList<pictureData> pictures = pictureDataReader.readQuestionsFromFile("descriptions.txt");
    int index = 0;
    pictureData Picture;
    private BufferedImage picture;
    //Picture = new pictureData(pictures[index].getDescription,  pictues[index].getDate, pictures[index].getName);


    //pas two array lists
    //current index is 0 
    //frame tells panel what the picture is
    //dont load anything in the panel 

    //code from klumps in class menu and mouse frame 
    private void setimage(int index){
        this.index += index;
    }

    private void setup(picturePanel panel, JTextField date, JTextArea description){
        panel.setPicture(loadedpictures.get(index));
        date.setText(pictures.get(index).getDate());
        description.setText(pictures.get(index).getDescription());
    }



    public void setupMainMenu() {   
        JMenuBar mbar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
        JMenu mnuHelp = new JMenu("Help");
        mbar.add(mnuFile);
        mbar.add(mnuHelp);

        JMenuItem miSave = new JMenuItem("Save");
        mnuFile.add(miSave);
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnuFile.add(miExit);
        JMenuItem miAbout = new JMenuItem("About");
        miAbout.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"By Katie Knutson: Java Expert");
                }
            }
        );
        mnuHelp.add(miAbout);
        setJMenuBar(mbar);
    }
//1 text panel, 1 button panel, 1 picture panel 
    
    public pictureFrame(){
        //code from notes 
        
        setupMainMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Picture Frame");
        setBounds(100,100,290,400);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        picturePanel picturePanel = new picturePanel();
        c.add(picturePanel, BorderLayout.NORTH);

        //this is where the text is 
        JTextField date = new JTextField("yeet");
        JTextArea description = new JTextArea("desceioptjajf");

        //this is where the buttons are 
        JPanel panCenter = new JPanel(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setBackground(Color.WHITE);
        //add all of the buttons to the botton 
        JButton prev = new JButton("Prev");
        prev.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setimage(-1);
                    setup(picturePanel, date, description);
                }
            }
        );
        panSouth.add(prev);
        JButton save = new JButton ("Save");
        prev.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
       
                }
            }
        );
        panSouth.add(save);
        JButton next = new JButton ("Next");
        prev.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setimage(+1);
                    setup(picturePanel, date, description);
                }
            }
        );


        panSouth.add(next);
        panCenter.add(panSouth, BorderLayout.SOUTH);
        

        //where the pictures are

        panCenter.add(date, BorderLayout.NORTH);
        panCenter.add(description, BorderLayout.CENTER);
        c.add(panCenter, BorderLayout.CENTER);

    }

}
