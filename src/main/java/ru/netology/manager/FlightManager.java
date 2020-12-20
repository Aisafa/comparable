package ru.netology.manager;

import ru.netology.domain.Flight;
import ru.netology.repository.FlightRepository;

public class FlightManager extends Flight {
    FlightRepository repository = new FlightRepository();

    public FlightRepository getRepository() {
        return repository;
    }

    public void add(Flight fly) {
        repository.add(fly);
    }

    public Flight[] findAll(String from, String to) {
        Flight[] result = new Flight[0];
        for (Flight flying : repository.findAll()) {
            if (matches(flying, from, to)) {
                Flight[] tmp = new Flight[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = flying;
                result = tmp;
            }
        }
        return result;

            }

    public boolean matches(Flight flying, String from, String to) {
        if (flying != null) {
            if (flying.getFrom().contains(from))
                return true;
            return flying.getTo().contains(to);
        }
        return false;
    }


}
