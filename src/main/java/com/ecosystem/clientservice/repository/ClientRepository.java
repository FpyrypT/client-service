package com.ecosystem.clientservice.repository;

import com.ecosystem.clientservice.model.Client;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    private final List<Client> repository;

    public ClientRepository() {
        repository = Arrays.asList(
                new Client(1L, "one", "Ivan", "Ivanov"),
                new Client(2L, "two", "Petr", "Petrov"),
                new Client(3L, "three", "Sidr", "Sidorov"),
                new Client(4L, "four", "Habib", "Habibov")
                );
    }

    public List<Client> findAll() {
        return repository;
    }

    public Optional<Client> findById(Long id) {
        return Optional.of(repository.get(id.intValue()));
    }
}
