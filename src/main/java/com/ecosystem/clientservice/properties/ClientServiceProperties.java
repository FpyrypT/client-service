package com.ecosystem.clientservice.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "myapp")
public class ClientServiceProperties {
    private int port;
}
