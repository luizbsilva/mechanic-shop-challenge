package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.Planet;
import com.mechanicshop.challenge.entity.swapi.SWModelList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swplanets.name}", url = "${feign.rest.swplanets.url}")
public interface SwApiPlanetsClient {

    @GetMapping(value = "/api/planets")
    SWModelList<Planet> getAllPlanets();

    @GetMapping(value = "/api/planets/{code}")
    Planet getPlanet(@PathVariable("code") Integer code);

}
