package com.mechanicshop.challenge.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class SwApiModel {

    @JsonProperty("title")
    private String titulo;

    @JsonProperty("episode_id")
    private Integer codigoEpisodio;

    @JsonProperty("opening_crawl")
    private String textoAbertura;

    @JsonProperty("director")
    private String diretor;

    @JsonProperty("producer")
    private String produtor;

    @JsonProperty("release_date")
    private LocalDate dataLancamento;

    @JsonProperty("characters")
    private List<String> personagens;

    @JsonProperty("planets")
    private List<String> planetas;

    @JsonProperty("starships")
    private List<String> navesEstelares;

    @JsonProperty("vehicles")
    private List<String> veiculos;

    @JsonProperty("species")
    private List<String> especies;

    @JsonProperty("created")
    private LocalDateTime dataCriacao;

    @JsonProperty("edited")
    private LocalDateTime dataAlteracao;

    @JsonProperty("url")
    private String url;

}
