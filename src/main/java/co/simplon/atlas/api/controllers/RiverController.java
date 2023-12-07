package co.simplon.atlas.api.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.atlas.api.entities.River;
import co.simplon.atlas.api.services.RiverService;

@RestController
@RequestMapping("/rivers")
class RiverController {

    private final RiverService service;

    RiverController(RiverService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody River river) {
	return service.create(river);
    }

    @GetMapping("/{id}")
    River get(@PathVariable("id") UUID identifier) {
	return service.get(identifier);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void replace(@PathVariable("id") UUID identifier, @RequestBody River river) {
	service.replace(identifier, river);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") UUID identifier) {
	service.delete(identifier);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void updatePartially(@PathVariable("id") UUID identifier, @RequestBody River river) {
	service.updatePartially(identifier, river);
    }
}
