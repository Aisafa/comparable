package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Flight;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTest {
    private FlightRepository repository = new FlightRepository();
    private Flight spb = new Flight(1, 1000, "LED", "MOW", 290);
    private Flight msk = new Flight(2, 1500, "MOW", "JOG", 180);
    private Flight nzg = new Flight(3, 1700, "JOG", "KUF", 220);
    private Flight smr = new Flight(4, 1100, "KUF", "NBC", 130);
    private Flight nch = new Flight(5, 2100, "NBC", "AER", 340);
    private Flight shi = new Flight(6, 2456, "AER", "MOW", 420);

    @Test
    public void shouldSaveItems() {
        repository.add(spb);
        repository.add(smr);
        Flight[] expected = new Flight[]{spb, smr};
        Flight[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        repository.add(msk);
        repository.add(nzg);
        Flight[] expected = new Flight[]{msk, nzg};
        Flight[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        int idToRemove = 2;
        repository.add(nzg);
        repository.add(msk);
        repository.add(nch);
        repository.removeById(idToRemove);
        Flight[] expected = new Flight[]{nzg, nch};
        Flight[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

}