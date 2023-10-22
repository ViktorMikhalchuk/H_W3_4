public class Aplication {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.run(633);
        animal1.swim(34);
        animal2.run(100);
        animal2.swim(130);

        System.out.println("Кількість собак " + Dog.getDogCount());
        System.out.println("Кількість котів " + Cat.getCatCount());
    }
}
