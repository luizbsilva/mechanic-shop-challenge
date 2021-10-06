package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Vehicle implements Serializable {

    @JsonProperty("name")
    public String nome;

    @JsonProperty("model")
    public String modelo;

    @JsonProperty("vehicle_class")
    public String classeVeicular;

    @JsonProperty("manufacturer")
    public String fabricante;

    @JsonProperty("cost_in_credits")
    public String custoEmCreditos;

    @JsonProperty("length")
    public String tamanho;

    @JsonProperty("crew")
    public String tripulacao;

    @JsonProperty("passengers")
    public String passegeiros;

    @JsonProperty("max_atmosphering_speed")
    public String velocidadeAtimosfericaMaxima;

    @JsonProperty("cargo_capacity")
    public String capacidadeDeCarga;

    @JsonProperty("consumables")
    public String consumo;

    @JsonProperty("created")
    public String criado;

    @JsonProperty("edited")
    public String editado;

    @JsonProperty("url")
    public String url;

    @JsonProperty("pilots")
    public List<String> pilotos;

    @JsonProperty("films")
    public List<String> filmes;
}
