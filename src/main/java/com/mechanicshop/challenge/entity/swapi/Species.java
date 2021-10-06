package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Species implements Serializable {

    @JsonProperty("name")
    public String nome;

    @JsonProperty("classification")
    public String classificacao;

    @JsonProperty("designation")
    public String desiginacao;

    @JsonProperty("average_height")
    public String alturaMedia;

    @JsonProperty("average_lifespan")
    public String idadeMedia;

    @JsonProperty("eye_colors")
    public String corDosOlhos;

    @JsonProperty("hair_colors")
    public String corCabelos;

    @JsonProperty("skin_colors")
    public String corPela;

    @JsonProperty("homeworld")
    public String planetaNatal;


    @JsonProperty("language")
    public String idioma;

    @JsonProperty("created")
    public String criado;

    @JsonProperty("edited")
    public String editado;

    @JsonProperty("url")
    public String url;

    @JsonProperty("people")
    public List<String> pessoas;

    @JsonProperty("films")
    public List<String> filmes;
}
