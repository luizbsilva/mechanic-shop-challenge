package com.mechanicshop.challenge.controllers;


import com.mechanicshop.challenge.entity.swapi.People;
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
@RequestMapping(value = "/peoples")
@AllArgsConstructor
public class SwApiPeopleController {

    @Autowired
    private SwApiService swApiService;


    @ApiOperation(value = "Buscar Pessoas", notes = "Busca Todos os Pessoas")
    @GetMapping("")
    public ResponseEntity<SWModelList<People>> getAll() {
        final SWModelList<People> response = this.swApiService.getAllPeoples();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ApiOperation(value = "Buscar Pessoa", notes = "Busca Pessoa por codigo")
    @GetMapping("/{codigo}")
    public ResponseEntity<People> getById(@PathVariable Integer codigo) {
        final People response = this.swApiService.getPeopleById(codigo);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
