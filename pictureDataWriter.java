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
