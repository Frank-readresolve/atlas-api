package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Continent;

@Service
public class ContinentService {

    public UUID create(Continent continent) {
	return Database.insert(continent);
    }

    public Continent get(UUID identifier) {
	return Database.selectContinent(identifier);
    }

    public void replace(UUID identifier, Continent continent) {
	Continent entity = Database.selectContinent(identifier);
	entity.setName(continent.getName());
	entity.setArea(continent.getArea());
	Database.update(entity);
    }

    public void delete(UUID identifier) {
	Database.deleteContinent(identifier);
    }

    public void updatePartially(UUID identifier, Continent continent) {
	Continent entity = Database.selectContinent(identifier);
	entity.setArea(continent.getArea());
	Database.update(entity);
    }
}
