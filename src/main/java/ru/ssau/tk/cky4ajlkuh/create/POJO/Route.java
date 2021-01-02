package ru.ssau.tk.cky4ajlkuh.create.POJO;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

public class Route implements Iterable<Location> {
    List<Location> locations;

    public Route(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocationOfIndex(Location location, int index) {
        locations.add(index, location);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void removeLocation(int index) {
        locations.remove(index);
    }

    public void getFirstLocation() {
        locations.get(0);
    }

    public void getLastLocation() {
        locations.get((int) lastIndexOf(locations));
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator<>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < locations.size();
            }

            @Override
            public Location next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Location location = new Location();
                i++;
                return location;
            }
        };
    }
}
