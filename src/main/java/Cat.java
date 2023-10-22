public class Cat extends Animal{
    private static int catCount;
    public Cat(){
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance <= 200){
            System.out.println("Кіт пробіг: " + distance + "m.");
        }
        else {
            System.out.println("Кіт не може пробігти: " + distance + "m.");
        }
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Кіт не вміє плавати!");
    }
}
