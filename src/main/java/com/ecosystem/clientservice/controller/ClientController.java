package com.ecosystem.clientservice.controller;

import com.ecosystem.clientservice.model.Client;
import com.ecosystem.clientservice.properties.ClientServiceProperties;
import com.ecosystem.clientservice.repository.ClientRepository;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;
    private final ClientServiceProperties clientServiceProperties;
    private final EurekaClient eurekaClient;

    @GetMapping("/")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    @GetMapping("/props")
    public Integer getPort() {
        return clientServiceProperties.getPort();
    }

    @GetMapping("/eureka")
    public String getEureka(){
        return eurekaClient.getApplication("client-service").getName();
    }
}
