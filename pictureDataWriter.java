/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * changes the descriptions txt file
 */

import java.util.*;
import java.io.*;

public class pictureDataWriter {
    public static void writeDataToFile (ArrayList<pictureData> pictureData){
        //from Zac's tutoring
        //takes in the text field values from picture frame, writes them to the already existing file we have,
        //should over-write that with the new values
        //when typing in the text field, be mindful of tabs
        
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("descriptions.txt"))));
            for(pictureData pic : pictureData){
                pw.printf("%s\t%s\t%s\n",pic.getName(), pic.getDate(), pic.getDescription());
            }
            pw.close();
        }catch(Exception ex){

        }
    }
    
}
