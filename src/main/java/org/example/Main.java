package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = List.of("DOG Жучка","DOG Жучка","DOG Жучка","DOG Жучка","DOG Жучка","DOG Жучка", "COW МУЧКА"
                , "COW МУЧКА", "COW МУЧКА", "COW МУЧКА", "COW МУЧКА", "COW  ");
        AnimalFarm animalFarm = new AnimalFarm(animals);
        animalFarm.addAnimalFarm("Пирожочек");
        System.out.println(animalFarm.toString());
    }
}