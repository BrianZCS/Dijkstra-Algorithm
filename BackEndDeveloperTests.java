// --== CS400 File Header Information ==--
// Name: Zhi Zheng
// Email: zzheng94@wisc.edu
// Team: KD blue
// Role: Backend Developer
// TA: Keren
// Lecturer: Gary
// Notes to Grader: <optional extra notes>
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.DataFormatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class implements Junit-5 test for backend.
 * 
 * @author Zhi Zheng
 *
 */
class BackEndDeveloperTests {

  private Backend backend;

  /**
   * The method initializes backend and reads file for each test method
   * 
   * @throws IOException         exception thrown in the dataReader
   * @throws DataFormatException exception thrown in the dataReader
   */
  @BeforeEach
  void setup() throws IOException, DataFormatException {
    File f = new File("./Flights.csv");
    try {
      FileReader r = new FileReader(f);
      backend = new Backend(r);
    } catch (FileNotFoundException fnfe) {
      fnfe.printStackTrace();
    }
  }

  /**
   * This method tests the smallest cost/time/distance method in Dijkstra algorithm and tests the
   * implementation in the backend method
   */
  @Test
  void testSearchEdgeWeight() {
    // make up data to test for the Dijkstra algorithm implemented in the backend.
    CS400Graph<String> graph = new CS400Graph<>();
    graph.insertVertex("A");
    graph.insertVertex("B");
    graph.insertVertex("C");
    graph.insertVertex("D");
    graph.insertVertex("E");
    graph.insertEdge("A", "B", 2);
    graph.insertEdge("A", "D", 4);
    graph.insertEdge("A", "E", 1);
    graph.insertEdge("B", "C", 5);
    graph.insertEdge("C", "A", 3);
    graph.insertEdge("D", "B", 3);
    graph.insertEdge("D", "C", 7);
    graph.insertEdge("D", "E", 1);
    graph.insertEdge("E", "C", 8);
    assertTrue(graph.getPathCost("C", "E") == 4);
    assertTrue(graph.getPathCost("A", "C") == 7);
    assertTrue(graph.getPathCost("D", "A") == 10);
    // check for real data in the database
    // check three methods which implements the Dijkstra algorithm to find the weight of the edge
    // 1. Lowest Cost 2. Shortest Distance 3. Shortest Time
    assertTrue(backend.searchLowestCost("MEX", "ORD") == 208);
    assertTrue(backend.searchShortestDistance("MEX", "ORD") == 1690);
    assertTrue(backend.searchShortestTime("MEX", "ORD") == 255);
  }

  /**
   * This method tests the shortest path algorithm in Dijkstra algorithm and tests the
   * implementation in the backend method
   */
  @Test
  void testGetPath() {
    // make up data to test for the Dijkstra algorithm implemented in the backend
    CS400Graph<String> graph = new CS400Graph<>();
    graph.insertVertex("A");
    graph.insertVertex("B");
    graph.insertVertex("C");
    graph.insertVertex("D");
    graph.insertVertex("E");
    graph.insertEdge("A", "B", 2);
    graph.insertEdge("A", "D", 4);
    graph.insertEdge("A", "E", 1);
    graph.insertEdge("B", "C", 5);
    graph.insertEdge("C", "A", 3);
    graph.insertEdge("D", "B", 3);
    graph.insertEdge("D", "C", 7);
    graph.insertEdge("D", "E", 1);
    graph.insertEdge("E", "C", 8);
    assertTrue(graph.shortestPath("C", "E").toString().equals("[C, A, E]"));
    assertTrue(graph.shortestPath("A", "C").toString().equals("[A, B, C]"));
    assertTrue(graph.shortestPath("D", "A").toString().equals("[D, C, A]"));
    // check for real data in the database
    // check three methods which implements the Dijkstra algorithm to find path
    // 1. Lowest Cost 2. Shortest Distance 3. Shortest Time
    assertTrue(backend.getLowestCostPath("MEX", "ORD").toString().equals("[MEX, JFK, ORD]"));
    assertTrue(backend.getShortestDistancePath("MEX", "ORD").toString().equals("[MEX, ORD]"));
    assertTrue(backend.getShortestTimePath("JFK", "ORD").toString().equals("[JFK, ORD]"));
  }

  /**
   * This method tests the get all airports method and get Destination method in the backend
   */
  @Test
  void testGetAllAirports() {
    // test all airports are included in the graph
    assertTrue(backend.getAllAirports().size() == 13);
    assertTrue(backend.getAllAirports().toString()
        .equals("[LAX, SEA, SFO, DEN, JFK, YYZ, YUL, CUN, ATL, DFW, ORD, YVR, MEX]"));
    // test destination can be found by inputing the departure
    assertTrue(backend.getDestination("YYZ").toString().equals("[YVR, YUL, ATL, ORD]"));
    assertTrue(backend.getDestination("MEX").toString()
        .equals("[CUN, ATL, LAX, ORD, DFW, DEN, JFK, SFO, SEA]"));
  }

}
