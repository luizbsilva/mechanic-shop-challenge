package com.mechanicshop.challenge.external.rest.client;

import com.mechanicshop.challenge.entity.swapi.SWModelList;
import com.mechanicshop.challenge.entity.swapi.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.rest.swsvehicles.name}", url = "${feign.rest.swsvehicles.url}")
public interface SwApiVehiclesClient {

    @GetMapping(value = "/api/vehicles")
    SWModelList<Vehicle> getAllVehicle();

    @GetMapping(value = "/api/vehicles/{code}")
    Vehicle getVehicle(@PathVariable("code") Integer code);

}
