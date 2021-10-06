package com.mechanicshop.challenge.entity.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Starship extends Vehicle implements Serializable {

    @JsonProperty("starship_class")
    public String classeNaveEstelar;

    @JsonProperty("hyperdrive_rating")
    public String avaliacaoHiperDrive;

    @JsonProperty("MGLT")
    public String mglt;

}
