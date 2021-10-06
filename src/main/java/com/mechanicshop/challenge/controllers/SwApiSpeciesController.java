package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.Planet;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Species;
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
@RequestMapping(value = "/species")
@AllArgsConstructor
public class SwApiSpeciesController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Especies", notes = "Busca Todos os Especimes")
    @GetMapping("")
    public ResponseEntity<SWModelList<Species>> getAll() {
        final SWModelList<Species> response = this.swApiService.getAllSpecies();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Especie", notes = "Busca Especie por codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<Species> getById(@PathVariable Integer codigo) {
        final Species response = this.swApiService.getSpeciesById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
