package BaseGame;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private final List<Station> allStations;
  private final List<Station> activeStations;

  public Game() {
    allStations = new ArrayList<>();
    activeStations = new ArrayList<>();
  }

  private void initializeStations(){
    allStations.add(new Station("South Kensington", 561, 656));
    allStations.add(new Station("Victoria", 652, 659));
    allStations.add(new Station("Paddington", 529, 418));
    allStations.add(new Station("King's Cross St. Pancras", 859, 408));
    allStations.add(new Station("Oxford Circus", 696, 519));
    allStations.add(new Station("Waterloo", 790, 712));
    allStations.add(new Station("London Bridge", 963, 673));
    allStations.add(new Station("Canary Wharf", 1257, 677));
    allStations.add(new Station("Liverpool Street", 1046, 447));
    allStations.add(new Station("Bank", 963, 572));
    allStations.add(new Station("North Acton", 303, 517));
    activeStations.addAll(allStations);
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.initializeStations();
  }

}
