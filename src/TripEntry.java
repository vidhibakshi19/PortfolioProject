/*
 * TripEntry Class.
 */

public class TripEntry {
    private String description;
    private String location;
    private String date;

    public TripEntry(String description, String location, String date) {
        this.description = description;
        this.location = location;
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Description: " + this.description + "; Location: "
                + this.location + "; Date: " + this.date;
    }
}