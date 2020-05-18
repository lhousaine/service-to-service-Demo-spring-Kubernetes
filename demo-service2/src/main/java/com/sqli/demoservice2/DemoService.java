package com.sqli.demoservice2;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    private final RestTemplate restTemplate;

    @Value("${demo.url}")
    private String url;

    public DemoService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    public String helloFromDemo() {
        URI uri = URI.create(url);
        return this.restTemplate.getForObject(uri, String.class)+"from Demo-service";
    }
}
