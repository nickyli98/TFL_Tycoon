package BaseGame;

import java.util.ArrayList;
import java.util.List;

public class Station {

  private final List<Line> stations;
  private final String name;
  private int tier;
  private int people;

  public Station(String name){
    this.name = name;
    stations = new ArrayList<>();
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

}
