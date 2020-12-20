package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.FlightRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    //   private FlightRepository repository = new FlightRepository();
    private Flight spb = new Flight(1, 1000, "LED", "MOW", 290);
    private Flight msk = new Flight(2, 1500, "MOW", "JOG", 180);
    private Flight nzg = new Flight(3, 1700, "JOG", "KUF", 220);
    private Flight smr = new Flight(4, 1100, "KUF", "NBC", 130);
    private Flight nch = new Flight(5, 2100, "NBC", "AER", 340);
    private Flight shi = new Flight(6, 2456, "AER", "MOW", 420);

    @Test
    public void shouldSortByCost() {
        Flight[] expected = new Flight[]{msk, nzg, shi};
        Flight[] actual = new Flight[]{nzg, shi, msk };
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}