package BaseGame;

import java.util.ArrayList;
import java.util.List;

public class Line {

  private final List<Station> stations;
  private final String name;
  private int tier;
  private final List<Train> trains;

  public Line(String name) {
    this.name = name;
    stations = new ArrayList<>();
    trains = new ArrayList<>();
  }

  public List<Station> getStations() {
    return stations;
  }

  public String getName() {
    return name;
  }

  public int getTier() {
    return tier;
  }

  public List<Train> getTrains() {
    return trains;
  }
}
