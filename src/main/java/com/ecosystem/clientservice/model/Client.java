package com.ecosystem.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
}
