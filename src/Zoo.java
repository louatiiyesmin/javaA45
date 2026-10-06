public class Zoo {

    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private int nbrCages;

    private int animalCount = 0;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }


    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            return false;
        }

        if (searchAnimal(animal.getName()) != -1) {
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
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal.getName());

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