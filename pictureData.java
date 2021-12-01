/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * Data attributes, getters, setters, constructors, and toString function
 */
public class pictureData {
    private double length;
    private double width;
    private String description;
    private String date; 
    private String name;
    
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //do not really need a default constructor
    public pictureData(){
        length = 0;
        width = 0;
        description = "";
        date = "";
        name = "";
    }
    public pictureData(double length, double width, String description, String date, String name) {
        this.length = length;
        this.width = width;
        this.description = description;
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return "pictureData [date=" + date + ", description=" + description + ", length=" + length + ", name=" + name
                + ", width=" + width + "]";
    }
    
}
