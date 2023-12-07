package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.River;

@Service
public class RiverService {

    public UUID create(River river) {
	return Database.insert(river);
    }

    public River get(UUID identifier) {
	return Database.selectRiver(identifier);
    }

    public void replace(UUID identifier, River river) {
	River entity = Database.selectRiver(identifier);
	entity.setName(river.getName());
	entity.setLength(river.getLength());
	entity.setSource(river.getSource());
	entity.setMouth(river.getMouth());
	Database.update(entity);
    }

    public void delete(UUID identifier) {
	Database.deleteRiver(identifier);
    }

    public void updatePartially(UUID identifier, River river) {
	River entity = Database.selectRiver(identifier);
	entity.setLength(river.getLength());
	entity.setSource(river.getSource());
	entity.setMouth(river.getMouth());
	Database.update(entity);
    }
}
