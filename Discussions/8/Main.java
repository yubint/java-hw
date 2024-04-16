import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // GPS coordinates in DMS format
        ArrayList<String> gps= new ArrayList<>(Arrays.asList(
            "32 deg 55' 18.60\" N, 96 deg 43' 43.80\" W",
            "32 deg 55' 18.60\" N, 96 deg 43' 43.80\" W",
            "32 deg 55' 18.60\" N, 96 deg 43' 43.80\" W",
            "32 deg 55' 19.20\" N, 96 deg 43' 44.40\" W",
            "32 deg 55' 19.20\" N, 96 deg 43' 44.40\" W",
            "32 deg 55' 19.20\" N, 96 deg 43' 44.40\" W",
            "32 deg 55' 19.80\" N, 96 deg 43' 46.80\" W",
            "32 deg 55' 19.80\" N, 96 deg 43' 46.80\" W"
        ));

        // Convert each coordinate to GE format and print the result
        for (String coordinate : gps) {
            System.out.println(convertDMSToGE(coordinate));
        }
    }

    // Convert a coordinate from DMS to Google Earth format
    public static String convertDMSToGE(String dms) {
        // Split the latitude and longitude
        String[] parts = dms.split(", ");

        // Convert each part to decimal format
        String latitude = convertCoordinateToDecimal(parts[0]);
        String longitude = convertCoordinateToDecimal(parts[1]);

        // Return the coordinates in the order of longitude, latitude, and altitude where altitude is always 0
        return longitude + "," + latitude + ",0";
    }

    // Convert a single coordinate (latitude or longitude) from DMS to Google Earth (Decimal) format
    public static String convertCoordinateToDecimal(String coordinate) {

        // splitting the degree, minutes and seconds
        String[] parts = coordinate.split(" ");
        double degrees = Double.parseDouble(parts[0].split(" ")[0]);
        double minutes = Double.parseDouble(parts[2].split("'")[0]);
        double seconds = Double.parseDouble(parts[3].split("\"")[0]);
        String direction = parts[4];

        // Converting to decimal 
        double decimalDegrees = degrees + minutes / 60 + seconds / 3600;

        // Accounting for direction
        if (direction.equals("S") || direction.equals("W")) {
            decimalDegrees *= -1;
        }

        // Format the result to six decimal places and return it
        return String.format("%.6f", decimalDegrees);
    }
}