package core.dto;

public class Airports {

    private String airport_code;
    private String airport_name;
    private String city;
    private String coordinates;
    private String timesone;

    public Airports() {
    }

    public String getAirport_code() {
        return airport_code;
    }

    public void setAirport_code(String airport_code) {
        this.airport_code = airport_code;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getTimesone() {
        return timesone;
    }

    public void setTimesone(String timesone) {
        this.timesone = timesone;
    }

    @Override
    public String toString() {
        return airport_code + " | " + airport_name + " | " +city + " | " + coordinates + " | " + timesone;
    }
}