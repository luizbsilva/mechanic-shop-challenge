package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Planet implements Serializable {

    @JsonProperty("name")
    public String nome;

    @JsonProperty("diameter")
    public String diametro;

    @JsonProperty("gravity")
    public String gravidade;

    @JsonProperty("population")
    public String poppulacao;

    @JsonProperty("climate")
    public String clima;

    @JsonProperty("terrain")
    public String chao;

    @JsonProperty("created")
    public String criacao;

    @JsonProperty("edited")
    public String editado;

    @JsonProperty("url")
    public String url;

    @JsonProperty("rotation_period")
    public String peridodoRotacao;

    @JsonProperty("orbital_period")
    public String periodoOrbital;

    @JsonProperty("surface_water")
    public String aguaSuperficie;

    @JsonProperty("residents")
    public List<String> residentes;

    @JsonProperty("films")
    public List<String> fimes;
}
