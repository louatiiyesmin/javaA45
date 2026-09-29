public class Zoo {

    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;


    int animalCount = 0;

    public Zoo() {
    }


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public boolean addAnimal(Animal animal) {

        if (animalCount >= animals.length) {
            return false;
        }

        if (searchAnimal(animal.name) != -1) {
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;

        return true;
    }


    public void displayAnimals() {

        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(String name) {

        for (int i = 0; i < animalCount; i++) {

            if (animals[i].name.equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal.name);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;

        animalCount--;

        return true;
    }


    public boolean isZooFull() {

        return animalCount >= animals.length;
    }


    public Zoo compareZoo(Zoo zoo) {

        if (this.animalCount > zoo.animalCount) {
            return this;
        }

        return zoo;
    }


    public void displayZoo() {
        System.out.println("Zoo : " + name
                + ", Ville : " + city
                + ", Cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name
                + ", Ville=" + city
                + ", Cages=" + nbrCages + "]";
    }
}