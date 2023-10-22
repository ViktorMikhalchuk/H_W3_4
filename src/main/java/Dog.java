public class Dog extends Animal{
    private static int dogCount;
    public Dog(){
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance <= 500){
            System.out.println("Собака пробіг: " + distance + "m.");
        }
        else {
            System.out.println("Собака не може пробігти " + distance+ "m.");
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        if(distance <= 10){
            System.out.println("Собака проплив: " + distance + "m.");
        }
        else {
            System.out.println("Собака не може пропливти " + distance+ "m.");
        }
    }
}
