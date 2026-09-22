public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("lionn", "liouna", 5, true);
        Animal chat =  new Animal ("chat", "manouch", 4, true);
        Zoo myZoo = new Zoo("my Zoo", "tunis", 20);
        myZoo.displayZoo();
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(chat);

    }
}

