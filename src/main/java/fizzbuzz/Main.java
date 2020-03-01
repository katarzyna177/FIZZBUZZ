package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        FizzbuzzMethods fizzbuzzMethods = new FizzbuzzMethods();
        fizzbuzzMethods.classicFizzBuzz(0, 20);
        fizzbuzzMethods.streamFizzBuzz(0, 20);
    }
}
