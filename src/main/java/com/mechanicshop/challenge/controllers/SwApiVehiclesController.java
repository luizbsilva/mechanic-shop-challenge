package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Starship;
import com.mechanicshop.challenge.entity.swapi.Vehicle;
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
@RequestMapping(value = "/vehicles")
@AllArgsConstructor
public class SwApiVehiclesController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Veiculos", notes = "Busca Todos os veiculos")
    @GetMapping("")
    public ResponseEntity<SWModelList<Vehicle>> getAll() {
        final SWModelList<Vehicle> response = this.swApiService.getAllVehicle();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Veiculo", notes = "Busca veliculopor codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<Vehicle> getById(@PathVariable Integer codigo) {
        final Vehicle response = this.swApiService.getVehicleById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
