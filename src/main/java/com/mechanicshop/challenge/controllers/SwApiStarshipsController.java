package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Species;
import com.mechanicshop.challenge.entity.swapi.Starship;
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
@RequestMapping(value = "/star-ship")
@AllArgsConstructor
public class SwApiStarshipsController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Naves Estelares", notes = "Busca Todos as Naves Estelares")
    @GetMapping("")
    public ResponseEntity<SWModelList<Starship>> getAll() {
        final SWModelList<Starship> response = this.swApiService.getAllStarship();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Nave Estelar", notes = "Busca Nave Estelar por codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<Starship> getById(@PathVariable Integer codigo) {
        final Starship response = this.swApiService.getStarshipById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
