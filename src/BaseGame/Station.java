package BaseGame;

import java.util.ArrayList;
import java.util.List;

public class Station {

  private final List<Line> stations;
  private final String name;
  private int tier;
  private int people;
  private final int x;
  private final int y;

  public Station(String name, int x, int y){
    this.name = name;
    stations = new ArrayList<>();
    this.x = x;
    this.y = y;
  }

  public List<Line> getStations(){
    return stations;
  }

  public String getName(){
    return name;
  }

  public int getTier(){
    return tier;
  }

  public int getPeople(){
    return people;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
