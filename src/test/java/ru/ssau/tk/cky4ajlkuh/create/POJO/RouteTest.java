package ru.ssau.tk.cky4ajlkuh.create.POJO;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {

    @Test
    public void testGetLocations() {
        List<Location> locations = new ArrayList<>();
        Route route;
        Location location = new Location();
        Location location1 = new Location();
        location.setName("Samara");
        location1.setName("Kazan");
        locations.add(location);
        locations.add(location1);
        route = new Route(locations);

        assertEquals(route.getLocations(), locations);

        location.setId(10);
        location1.setId(20);
        locations.add(location);
        locations.add(location1);
        Route route1 = new Route(locations);

        assertEquals(route1.getLocations(), locations);

        location.setLatitude(30);
        location.setLongitude(23);
        location1.setLongitude(90);
        location1.setLatitude(9);
        locations.add(location);
        locations.add(location1);
        Route route2 = new Route(locations);

        assertEquals(route2.getLocations(), locations);
    }

    @Test
    public void testAddLocationOfIndex() {
        List<Location> locations = new ArrayList<>();
        Route route;
        Location location = new Location();
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        route = new Route(locations);

        route.addLocationOfIndex(location, 0);
        route.addLocationOfIndex(location3, 1);
        route.addLocationOfIndex(location1, 2);
        route.addLocationOfIndex(location2, 3);

        List<Location> locations2 = new ArrayList<>();

        locations2.add(location);
        locations2.add(location3);
        locations2.add(location1);
        locations2.add(location2);

        assertEquals(route.getLocations(), locations2);

    }

    @Test
    public void testAddLocation() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route(locations);
        Location location = new Location();

        locations.add(location);
        route.addLocation(location);

        assertEquals(route.getLocations(), locations);

        location.setName("Samara");
        locations.add(location);
        route.addLocation(location);

        assertEquals(route.getLocations(), locations);

        location.setId(1000);
        locations.add(location);
        route.addLocation(location);

        assertEquals(route.getLocations(), locations);

    }

    @Test
    public void testRemoveLocation() {
        List<Location> locations = new ArrayList<>();
        Route route;
        route = new Route(locations);

        Location location = new Location();
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();

        route.addLocation(location);
        route.addLocation(location1);
        route.addLocation(location2);
        route.addLocation(location3);

        locations.add(location);
        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        locations.remove(3);
        route.removeLocation(3);
        assertEquals(route.getLocations(), locations);

        locations.remove(2);
        route.removeLocation(2);
        assertEquals(route.getLocations(), locations);

        locations.remove(1);
        route.removeLocation(1);
        assertEquals(route.getLocations(), locations);

    }
}