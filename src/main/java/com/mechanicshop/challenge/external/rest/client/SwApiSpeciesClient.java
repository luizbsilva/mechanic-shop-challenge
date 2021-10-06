package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Species;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swspecies.name}", url = "${feign.rest.swspecies.url}")
public interface SwApiSpeciesClient {

    @GetMapping(value = "/api/species")
    SWModelList<Species> getAllSpecies();

    @GetMapping(value = "/api/species/{code}")
    Species getSpecies(@PathVariable("code") Integer code);

}
