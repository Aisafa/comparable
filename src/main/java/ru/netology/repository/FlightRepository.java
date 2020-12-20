package ru.netology.repository;

import ru.netology.domain.Flight;

public class FlightRepository {
    private Flight[] flying = new Flight[0];
    private Object NotFoundException;

    public void add(Flight fly) {
        int length = flying.length + 1;
        Flight[] tmp = new Flight[length];
        System.arraycopy(flying, 0, tmp, 0, flying.length);
        int lstIndex = tmp.length - 1;
        tmp[lstIndex] = fly;
        flying = tmp;
    }

    public Flight[] findAll() {
        return flying;
    }

    public void removeById(int id) {
        int length = flying.length - 1;
        Flight[] tmp = new Flight[length];
        int index = 0;
        for (Flight fly : flying) {
            if (fly.getId() != id) {
                tmp[index] = fly;
                index++;
            }
        }
        flying = tmp;

    }

}

