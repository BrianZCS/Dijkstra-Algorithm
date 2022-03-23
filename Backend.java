// --== CS400 File Header Information ==--
// Name: Zhi Zheng
// Email: zzheng94@wisc.edu
// Team: KD blue
// Role: Backend Developer
// TA: Keren
// Lecturer: Gary
// Notes to Grader: <optional extra notes>
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.zip.DataFormatException;
import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * This class provides necessary methods for frontend to implement
 * 
 * @author Zhi Zheng
 *
 */
public class Backend {

  private FlightDataReader reader;
  // three maps to help find smallest cost/time/distance
  private CS400Graph<String> costMap;
  private CS400Graph<String> timeMap;
  private CS400Graph<String> distanceMap;


  /**
   * One-argument constructor for the Backend. Takes in a Reader with a csv file with flights
   * information as a parameter and stores the flights info into the map
   * 
   * @param fileReader The csv file with the list of flights
   * @throws FileNotFoundException exception thrown in the dataReader
   * @throws IOException           exception thrown in the dataReader
   * @throws DataFormatException   exception thrown in the dataReader
   */
  public Backend(Reader fileReader) throws FileNotFoundException, IOException, DataFormatException {
    reader = new FlightDataReader(fileReader);
    costMap = reader.getCostMap();
    timeMap = reader.getTimeMap();
    distanceMap = reader.getDistanceMap();
  }

  /**
   * Search for the lowest Cost from departure location to destination
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return the lowest cost of the flights
   */
  public int searchLowestCost(String departure, String destination) {
    return costMap.getPathCost(departure, destination);
  }

  /**
   * get the path which has the lowest cost
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return The path of all airports between departure (included) and destination (included)
   */
  public List<String> getLowestCostPath(String departure, String destination) {
    return costMap.shortestPath(departure, destination);
    // Because it returns a list, the frontend can use .get method to get access to all the airports
    // if he want to print out something like airport1 > airport2 > airport3
  }

  /**
   * Search for the Shortest time from departure location to destination
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return the shortest time of the flights
   */
  public int searchShortestTime(String departure, String destination) {
    return timeMap.getPathCost(departure, destination);
  }

  /**
   * get the path which has the shortest time
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return The path of all airports between departure (included) and destination (included)
   */
  public List<String> getShortestTimePath(String departure, String destination) {
    return timeMap.shortestPath(departure, destination);
    // Because it returns a list, the frontend can use .get method to get access to all the airports
    // if he want to print out something like airport1 > airport2 > airport3
  }

  /**
   * Search for the Shortest distance from departure location to destination
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return the shortest distance of the flights
   */
  public int searchShortestDistance(String departure, String destination) {
    return distanceMap.getPathCost(departure, destination);
  }

  /**
   * get the path which has the shortest distance
   * 
   * @param departure   The departure airport
   * @param destination the destination airport
   * @return The path of all airports between departure (included) and destination (included)
   */
  public List<String> getShortestDistancePath(String departure, String destination) {
    return distanceMap.shortestPath(departure, destination);
    // Because it returns a list, the frontend can use .get method to get access to all the airports
    // if he want to print out something like airport1 > airport2 > airport3
  }

  /**
   * Get the number of stops in the path
   * 
   * @param path The path of all airports between departure (included) and destination (included).
   *             Can be got using above method.
   * @return number of stops in the path
   */
  public int getNumberOfStops(List<String> path) {
    return path.size() - 2;
    // This must take the path argument, so frontend needs to use backend.getShortestDistancePath
    // (or other backend method) to get path firstly.
  }

  /**
   * Get all airports in the data base
   * 
   * @return A list of all airports in the data base
   */
  public List<String> getAllAirports() {
    Enumeration<String> enumeration = costMap.vertices.keys();
    List<String> airports = new ArrayList<>();
    while (enumeration.hasMoreElements()) {
      String key = enumeration.nextElement();
      airports.add(key);
    }
    return airports;
    // Because this return a list, frontend can use.size() method to get the number of possible
    // airports if needed
  }

  /**
   * Get the possible destination from departure.
   * 
   * @param departure the departure airport
   * @return all destinations which have the airline with the departure place.
   */
  public List<String> getDestination(String departure) {
    return costMap.getTarget(departure);
    // Because this return a list, frontend can use.size() method to get the number of possible
    // destination if needed
  }

  /**
   * Get the number of all airlines in the database.
   * 
   * @return the number of airlines in the database
   */
  public int getNumberOfTotalAirlines() {
    return costMap.getEdgeCount();
  }

}
