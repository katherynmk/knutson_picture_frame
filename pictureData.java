/**
 * @author Katie Knutson 
 * @version 1.5
 * @since 11-28-2021
 * Data attributes, getters, setters, constructors, and toString function
 */
public class pictureData {

    private String description;
    private String date; 
    private String name;
    
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
        description = "";
        date = "";
        name = "";
    }
    public pictureData( String description, String date, String name) {
        this.description = description;
        this.date = date;
        this.name = name;
    }
    //to string method
    @Override
    public String toString() {
        return "pictureData [date=" + date + ", description=" + description + ", name=" + name + "]";
    }

 
    }
    

