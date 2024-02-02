package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Charmander", 5, "Fire", 4);
        Pokemon pokemon2 = new Pokemon("Pikachu", 10, "Electric", 25);
        Pokemon pokemon3 = new Pokemon("Pichu", 8, "Electric", 172);
        Pokemon pokemon4 = new Pokemon("Squirtle", 7, "Water", 7);

        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);

//        List<Pokemon> electricTypes = new ArrayList<>();
//
//        // Goal: Create a list with just the electric pokemon, from pokemonList:
//        for(Pokemon pokemon: pokemonList) {
//            if(pokemon.getType().equalsIgnoreCase("electric")) {
//                electricTypes.add(pokemon);
//            }
//        }

        // Filter out any non-electric pokemon using streams:
        // First step is take our list and convert it to a stream of data:
        // In order to use lambdas, must set our language level to 8 or higher
        List<Pokemon> electricTypes = pokemonList.stream()
                // Once we convert our list to a stream, we can introduce an intermediate operation (filter, sorting, mapping)
                // When we filter, we just want to provide some boolean expression which indicates what we want to keep
                .filter(pokemon -> pokemon.getType().equalsIgnoreCase("electric"))
                // Terminal Operation: After we perform some operation we do something with the results (in this case, we just collect
                // to a list:
                .collect(Collectors.toList());

        System.out.println(electricTypes);

        List<Pokemon> fireTypes = pokemonList.stream().filter(p -> p.getType().equalsIgnoreCase("fire")).collect(Collectors.toList());
        System.out.println(fireTypes);

        // General structure of a streams:
        // collection.stream().intermediate(lambda).terminal(lambda)
        // intermediate can be filter, sort, map
        // terminal can be collect, forEach, reduce






    }
}
