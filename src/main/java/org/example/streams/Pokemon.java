package org.example.streams;

import java.util.Objects;

public class Pokemon {
    private String species;
    private int level;
    private String type;
    private int pokedexNo;


    public Pokemon(String species, int level, String type, int pokedexNo) {
        this.species = species;
        this.level = level;
        this.type = type;
        this.pokedexNo = pokedexNo;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPokedexNo() {
        return pokedexNo;
    }

    public void setPokedexNo(int pokedexNo) {
        this.pokedexNo = pokedexNo;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "species='" + species + '\'' +
                ", level=" + level +
                ", type='" + type + '\'' +
                ", attack=" + pokedexNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return level == pokemon.level && pokedexNo == pokemon.pokedexNo && Objects.equals(species, pokemon.species) && Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, level, type, pokedexNo);
    }
}
