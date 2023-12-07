package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Capital;

@Service
public class CapitalService {

    public UUID create(Capital capital) {
	return Database.insert(capital);
    }

    public Capital get(UUID identifier) {
	return Database.selectCapital(identifier);
    }

    public void replace(UUID identifier, Capital capital) {
	Capital entity = Database.selectCapital(identifier);
	entity.setName(capital.getName());
	entity.setPopulation(capital.getPopulation());
	entity.setArea(capital.getArea());
	Database.update(entity);
    }

    public void delete(UUID identifier) {
	Database.deleteCapital(identifier);
    }

    public void updatePartially(UUID identifier, Capital capital) {
	Capital entity = Database.selectCapital(identifier);
	entity.setPopulation(capital.getPopulation());
	entity.setArea(capital.getArea());
	Database.update(entity);
    }
}
