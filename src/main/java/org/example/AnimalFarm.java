package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.example.Animal.*;

public class AnimalFarm {
    //Виды и имена животных
    private List<String> farmAnimals;

    //Короткое решение
    /*
    public Map<Animal, Integer> countedAnimals() {
        Map<Animal, Integer> animalMap = new HashMap<>();

        for (String farmAnimal : farmAnimals) {
            Animal animal;
            try {
                animal = Animal.valueOf(farmAnimal.split(" ")[0].toUpperCase());
                Integer currentNumber = animalMap.get(animal);
                animalMap.put(animal, currentNumber == null ? 1 : currentNumber + 1);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return animalMap;
    }
    */


    public AnimalFarm(List<String> animalFarm) {
        this.farmAnimals = animalFarm;
    }

    //Подсчет вида животных - вывод:
    //key - "typeAnimal"
    //value - "countAnimal"
    public HashMap<Animal, Integer> countedAnimals() {
        HashMap<Animal, Integer> countedAnimal = new HashMap<>();
        for (String farmAnimal : farmAnimals) {
            String[] tempFarmAnimal = farmAnimal.split(" ");
            try {
                switch (tempFarmAnimal[0]) {
                    case ("DOG"):
                        if (!countedAnimal.containsKey(DOG)) {
                            countedAnimal.put(DOG, 1);
                        } else {
                            Integer countAnimal = countedAnimal.get(DOG) + 1;
                            countedAnimal.put(DOG, countAnimal);
                        }
                        break;
                    case ("CAT"):
                        if (!countedAnimal.containsKey(CAT)) {
                            countedAnimal.put(CAT, 1);
                        } else {
                            Integer countAnimal = countedAnimal.get(CAT) + 1;
                            countedAnimal.put(CAT, countAnimal);
                        }
                        break;
                    case ("HORSE"):
                        if (!countedAnimal.containsKey(HORSE)) {
                            countedAnimal.put(HORSE, 1);
                        } else {
                            Integer countAnimal = countedAnimal.get(HORSE) + 1;
                            countedAnimal.put(HORSE, countAnimal);
                        }
                        break;
                    case ("COW"):
                        if (!countedAnimal.containsKey(COW)) {
                            countedAnimal.put(COW, 1);
                        } else {
                            Integer countAnimal = countedAnimal.get(COW) + 1;
                            countedAnimal.put(COW, countAnimal);
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return countedAnimal;
    }

    //Метод вывода уникальных имен животных

    public HashSet<String> uniqueNames() {
        HashSet<String> uniqueNames = new HashSet<>();
        for (String animalsName : farmAnimals
        ) {
            try {
                String animalName = animalsName.split(" ")[1];
                if (!animalName.isEmpty()) {
                    uniqueNames.add(animalName);
                }
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimals);
            }

        }
        return uniqueNames;
    }

    //Решение из курса
    /*
    public Set<String> uniqueNames() {
        Set<String> uniqueNames = new HashSet<>();

        for (String farmAnimal : farmAnimals) {
            String name;
            try {
                name = farmAnimal.split(" ")[1];
                uniqueNames.add(name);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return uniqueNames;
    }*/


    //Добавление типа животного и имени
    public void addAnimalFarm(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " + name);
    }

    //Добавление типа животного, имя животного - N
    public void addAnimalFarm(Animal animal) {
        farmAnimals.add(animal.name() + " N");
    }

    //Добавление имени животного, тип животного - NOT_DEFINED
    public void addAnimalFarm(String name) {
        farmAnimals.add(NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String farmAnimal : farmAnimals
        ) {
            String printFarmAnimal = farmAnimal.replace(" ", ":");
            sb.append(printFarmAnimal).append("\n");
        }
        return sb.toString();
    }

}



