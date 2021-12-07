/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * With a loadImagesFromPictureData function that returns an ArrayList<BufferedImage>.
 * This function loads the images identified by the filename of each
 * PictureData object into memory so that you can display them
 */
import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;


public class pictureLoader {
    public static ArrayList<BufferedImage> loadImagesFromPictureData(ArrayList<pictureData> pictureData ) {
        ArrayList<BufferedImage> loadedpictures = new ArrayList<BufferedImage>();
        BufferedImage picture = null;
        for(int i = 0; i < pictureData.size(); i++){ 
       try{ 
           picture = ImageIO.read(new File(pictureData.get(i).getName()));
           loadedpictures.add(picture);

        }
      catch(Exception ex){
        return null;
      }
    }
      return loadedpictures;
    }
     }

