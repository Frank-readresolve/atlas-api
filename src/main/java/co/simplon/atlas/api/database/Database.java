package co.simplon.atlas.api.database;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import co.simplon.atlas.api.entities.Capital;
import co.simplon.atlas.api.entities.Continent;
import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.entities.River;

public class Database {

    private final static Map<UUID, Country> COUNTRIES = new HashMap<>();
    private final static Map<UUID, Continent> CONTINENTS = new HashMap<>();
    private final static Map<UUID, Capital> CAPITALS = new HashMap<>();
    private final static Map<UUID, River> RIVERS = new HashMap<>();

    public static UUID insert(Country country) {
	UUID identifier = UUID.randomUUID();
	country.setIdentifier(identifier);
	COUNTRIES.put(identifier, country);
	return identifier;
    }

    public static Country selectCountry(UUID identifier) {
	return COUNTRIES.get(identifier);
    }

    public static void update(Country country) {
	COUNTRIES.put(country.getIdentifier(), country);
    }

    public static void deleteCountry(UUID identifier) {
	COUNTRIES.remove(identifier);
    }

    public static UUID insert(Continent continent) {
	UUID identifier = UUID.randomUUID();
	continent.setIdentifier(identifier);
	CONTINENTS.put(identifier, continent);
	return identifier;
    }

    public static Continent selectContinent(UUID identifier) {
	return CONTINENTS.get(identifier);
    }

    public static void update(Continent continent) {
	CONTINENTS.put(continent.getIdentifier(), continent);
    }

    public static void deleteContinent(UUID identifier) {
	CONTINENTS.remove(identifier);
    }

    public static UUID insert(Capital capital) {
	UUID identifier = UUID.randomUUID();
	capital.setIdentifier(identifier);
	CAPITALS.put(identifier, capital);
	return identifier;
    }

    public static Capital selectCapital(UUID identifier) {
	return CAPITALS.get(identifier);
    }

    public static void update(Capital capital) {
	CAPITALS.put(capital.getIdentifier(), capital);
    }

    public static void deleteCapital(UUID identifier) {
	CAPITALS.remove(identifier);
    }

    public static UUID insert(River river) {
	UUID identifier = UUID.randomUUID();
	river.setIdentifier(identifier);
	RIVERS.put(identifier, river);
	return identifier;
    }

    public static River selectRiver(UUID identifier) {
	return RIVERS.get(identifier);
    }

    public static void update(River river) {
	RIVERS.put(river.getIdentifier(), river);
    }

    public static void deleteRiver(UUID identifier) {
	RIVERS.remove(identifier);
    }
}
