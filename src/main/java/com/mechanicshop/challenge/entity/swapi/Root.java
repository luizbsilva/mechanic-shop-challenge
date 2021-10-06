package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Root implements Serializable {

    @JsonProperty("films")
    public String filmes;

    @JsonProperty("people")
    public String pessoas;

    @JsonProperty("planets")
    public String planetas;

    @JsonProperty("species")
    public String especies;

    @JsonProperty("starships")
    public String navesEstelares;

    @JsonProperty("vehicles")
    public String veiculos;
}
