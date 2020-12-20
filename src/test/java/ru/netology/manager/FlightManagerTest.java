package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Flight;
import ru.netology.repository.FlightRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlightManagerTest {
    private FlightManager flightManager = new FlightManager();
    private FlightRepository repository = new FlightRepository();
    private Flight spb = new Flight(1, 1000, "LED", "MOW", 290);
    private Flight msk = new Flight(2, 1500, "MOW", "JOG", 180);
    private Flight msk2 = new Flight(2, 1600, "MOW", "JOG", 180);
    private Flight msk3 = new Flight(2, 1400, "MOW", "JOG", 180);
    private Flight nzg = new Flight(3, 1700, "JOG", "KUF", 220);
    private Flight smr = new Flight(4, 1100, "KUF", "NBC", 130);
    private Flight nch = new Flight(5, 2100, "NBC", "AER", 340);
    private Flight shi = new Flight(6, 2456, "AER", "MOW", 420);

    @Test
    public void shouldSearch() {
        flightManager.add(msk);
        flightManager.add(msk2);
        flightManager.add(msk3);
        flightManager.add(nch);
        flightManager.add(spb);
        Flight[] expected = new Flight[]{msk3,msk,msk2};
        Flight[] actual = flightManager.findAll("MOW","JOG");
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearch1() {
        flightManager.add(null);
        Flight[] expected = new Flight[]{};
        Flight[] actual = flightManager.findAll("","");
        assertArrayEquals(expected, actual);
    }
}