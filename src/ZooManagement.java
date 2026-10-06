public class ZooManagement {

    public static void main(String[] args) {

        Animal lion = new Animal();

        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

        Zoo myZoo = new Zoo();

        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");
        myZoo.setNbrCages(20);

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 8, true);
        Animal snake = new Animal("Reptile", "Kaa", 3, false);

        Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis", 20);

        System.out.println("Ajout du lion : "
                + myZoo1.addAnimal(lion1));

        System.out.println("Ajout de Dumbo : "
                + myZoo1.addAnimal(elephant));

        System.out.println("Ajout de Kaa : "
                + myZoo1.addAnimal(snake));

        System.out.println("\n--- Liste des animaux ---");
        myZoo1.displayAnimals();

        System.out.println("\n--- Recherche ---");

        int index = myZoo1.searchAnimal("Lion");
        System.out.println("Indice du Lion : " + index);

        int index2 = myZoo1.searchAnimal("Tigre");
        System.out.println("Indice du Tigre : " + index2);

        System.out.println("\n--- Test doublon ---");

        Animal lion2 = new Animal("Félidé", "Lion", 5, true);

        System.out.println("Ajout du deuxième Lion : "
                + myZoo1.addAnimal(lion2));

        System.out.println("\n--- Suppression ---");

        System.out.println("Suppression de Dumbo : "
                + myZoo1.removeAnimal(elephant));

        System.out.println("\n--- Animaux après suppression ---");
        myZoo1.displayAnimals();

        System.out.println("\n--- Vérification du zoo ---");

        System.out.println("Le zoo est plein : "
                + myZoo1.isZooFull());

        Zoo myZoo2 = new Zoo("Zoo Sousse", "Sousse", 20);

        Animal tiger = new Animal("Félidé", "Tigre", 4, true);
        Animal giraffe = new Animal("Giraffidae", "Girafe", 6, true);

        myZoo2.addAnimal(tiger);
        myZoo2.addAnimal(giraffe);

        System.out.println("\n--- Comparaison des zoos ---");

        Zoo biggerZoo = myZoo1.compareZoo(myZoo2);

        System.out.println("Zoo avec le plus d'animaux : "
                + biggerZoo.getName());
    }
}