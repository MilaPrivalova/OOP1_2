public class Main {
    public static void main(String[] args) {
        Person masha = new Person("Мама");
        Person petya = new Person("Папа");

        Wardrobe doorW = new Wardrobe();

        doorW.getDoor(masha);
        doorW.getDoor(petya);

    }
}