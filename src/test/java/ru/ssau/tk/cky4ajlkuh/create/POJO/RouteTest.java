package ru.ssau.tk.cky4ajlkuh.create.POJO;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {
    List<Location> locations;
    private Route route;

    @Test
    public void testGetLocations() {
        Location location = new Location();
        Location location1 = new Location();
        location.setName("Samara");
        location1.setName("Kazan");
        route.addLocation(location);
        route.addLocation(location1);
        for (int i = 0; i < 2; i++) {
            assertEquals(route.getLocations().get(i), locations.get(i));
        }
    }

    @Test
    public void testAddLocationOfIndex() {

    }

    @Test
    public void testAddLocation() {

    }

    @Test
    public void testRemoveLocation() {

    }
}