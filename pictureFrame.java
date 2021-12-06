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

public class pictureFrame extends JFrame{
    //code from klumps in class menu and mouse frame 
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
                    JOptionPane.showMessageDialog(null,"Katie Knutson");
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

        //this is where the buttons are 
        JPanel panCenter = new JPanel(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setBackground(Color.WHITE);
        //add all of the buttons to the botton 
        JButton prev = new JButton("Prev");
        panSouth.add(prev);
        JButton save = new JButton ("Save");
        panSouth.add(save);
        JButton next = new JButton ("Next");
        panSouth.add(next);
        panCenter.add(panSouth, BorderLayout.SOUTH);
        

        //where the pictures are
        picturePanel picturePanel = new picturePanel();
        c.add(picturePanel, BorderLayout.NORTH);

        //this is where the text is 
        JTextField date = new JTextField("yeet");
        JTextArea description = new JTextArea("desceioptjajf");
        panCenter.add(date, BorderLayout.NORTH);
        panCenter.add(description, BorderLayout.CENTER);
        c.add(panCenter, BorderLayout.CENTER);

    }

}
