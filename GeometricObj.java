import java.util.Date;

public class GeometricObj {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;


    public GeometricObj() {
        dateCreated = new java.util.Date();
    }

    public GeometricObj(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

    }




}
