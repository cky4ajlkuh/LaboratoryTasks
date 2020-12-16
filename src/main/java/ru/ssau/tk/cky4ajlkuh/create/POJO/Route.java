package ru.ssau.tk.cky4ajlkuh.create.POJO;

import java.util.List;

public class Route {

    List<Location> locations;

    public Route(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }
    public void addLocationOfIndex(Location location, int index){
        locations.add(index,location);
    }
    public void addLocation(Location location){
        locations.add(location);
    }
    public void removeLocation(int index){
        locations.remove(index);
    }

}
