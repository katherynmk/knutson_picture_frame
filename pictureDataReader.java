/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * @return ArrayList<PictureData> 
 * With a readPictureDataFromFile function that returns an ArrayList<PictureData>. 
 * You call it near the beginning of your program to create the PictureDataReader objects 
 * that will serve as the model for your application
 */
import java.util.*;
import java.io.*;
public class pictureDataReader  {
    public static ArrayList<pictureData> readQuestionsFromFile(String fname){
        ArrayList<pictureData> pictures = new ArrayList<pictureData>();
        pictureData Picture = new pictureData();
        String name, description, date; 

    try{
            Scanner sc = new Scanner(new File(fname)).useDelimiter("\t");
            do{
                name = sc.next();
                date = sc.next();
                description = sc.next();
            
                Picture = new pictureData(description, date, name);
                pictures.add(Picture);

            }while (sc.hasNextLine());//fix

    } catch(Exception ex){
        //if the name of the file does not exist the function should return null
            return null;   
        }
        return pictures;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(readQuestionsFromFile("descriptions.txt"));
    }

}
