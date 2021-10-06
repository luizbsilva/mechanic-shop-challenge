package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class People implements Serializable {

    @JsonProperty("name")
    public String nome;

    @JsonProperty("birth_year")
    public String anoNascimento;

    @JsonProperty("films")
    public List<String> filmes;

    @JsonProperty("gender")
    public String genero;

    @JsonProperty("hair_color")
    public String corCabelo;

    @JsonProperty("height")
    public String altura;

    @JsonProperty("homeworld")
    public String planetaNatal;

    @JsonProperty("mass")
    public String massa;

    @JsonProperty("skin_color")
    public String corDaPele;

    @JsonProperty("created")
    public String criacao;

    @JsonProperty("edited")
    public String editado;

    @JsonProperty("url")
    public String url;

    @JsonProperty("species")
    public List<String> speciesespeciesUrls;

    @JsonProperty("starships")
    public List<String> navesEstelares;

    @JsonProperty("vehicles")
    public List<String> veiculos;
}
