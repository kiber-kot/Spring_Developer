package ru.stroev.springcourse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currenty{

    @Getter
    @Setter
    private long timestamp;

    @Getter
    @Setter
    private String base;

    @Getter
    @Setter
    private Map<String, Double> rates;


}
