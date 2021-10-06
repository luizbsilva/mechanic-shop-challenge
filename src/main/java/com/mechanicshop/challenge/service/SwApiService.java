package com.mechanicshop.challenge.service;

import com.mechanicshop.challenge.entity.swapi.*;
import com.mechanicshop.challenge.external.rest.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwApiService {

    @Autowired
    private SwApiFIlmsClient swApiFIlmsClient;

    @Autowired
    private SwApiPeopleClient swApiPeopleClient;

    @Autowired
    private SwApiPlanetsClient swApiPlanetsClient;

    @Autowired
    private SwApiSpeciesClient swApiSpeciesClient;

    @Autowired
    private SwApiStartshipsClient swApiStartshipsClient;

    @Autowired
    private SwApiVehiclesClient swApiVehiclesClient;

    public SWModelList<Film> getAllFilms() {
        return swApiFIlmsClient.getAllFilms();
    }

    public Film getFilmById(Integer code) {
        return swApiFIlmsClient.getFilm(code);
    }

    public SWModelList<People> getAllPeoples() {
        return swApiPeopleClient.getAllPepole();
    }

    public People getPeopleById(Integer code) {
        return swApiPeopleClient.getPeople(code);
    }

    public SWModelList<Planet> getAllPlanets() {
        return swApiPlanetsClient.getAllPlanets();
    }

    public Planet getPlanetById(Integer code) {
        return swApiPlanetsClient.getPlanet(code);
    }

    public SWModelList<Species> getAllSpecies() {
        return swApiSpeciesClient.getAllSpecies();
    }

    public Species getSpeciesById(Integer code) {
        return swApiSpeciesClient.getSpecies(code);
    }

    public SWModelList<Starship> getAllStarship() {
        return swApiStartshipsClient.getAllStarship();
    }

    public Starship getStarshipById(Integer code) {
        return swApiStartshipsClient.getStarship(code);
    }

    public SWModelList<Vehicle> getAllVehicle() {
        return swApiVehiclesClient.getAllVehicle();
    }

    public Vehicle getVehicleById(Integer code) {
        return swApiVehiclesClient.getVehicle(code);
    }
}
