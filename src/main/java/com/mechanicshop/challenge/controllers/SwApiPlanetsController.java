package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.People;
import com.mechanicshop.challenge.entity.swapi.Planet;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.service.SwApiService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/planets")
@AllArgsConstructor
public class SwApiPlanetsController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Planetas", notes = "Busca Todos os Planetas")
    @GetMapping("")
    public ResponseEntity<SWModelList<Planet>> getAll() {
        final SWModelList<Planet> response = this.swApiService.getAllPlanets();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Planeta", notes = "Busca Planeta por codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<Planet> getById(@PathVariable Integer codigo) {
        final Planet response = this.swApiService.getPlanetById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
