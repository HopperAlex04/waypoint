package com.waypoint;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class ProjectConfigLoader {

    private final ObjectMapper objectMapper;

    public ProjectConfigLoader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<PortfolioProperties> load() {
        try {
            InputStream inputStream = new ClassPathResource(
                "projects.json"
            ).getInputStream();

            return objectMapper.readValue(
                inputStream,
                new TypeReference<List<PortfolioProperties>>() {}
            );
        } catch (Exception e) {
            throw new RuntimeException("Failed to load projects.json", e);
        }
    }
}
