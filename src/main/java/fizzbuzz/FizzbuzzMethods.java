package fizzbuzz;
import java.util.stream.IntStream;

public class FizzbuzzMethods {

    public void classicFizzBuzz(int from, int to){
        for(int i = from; i <= to; i++){
            conditionsNumbers(i);
        }
    }

    public void streamFizzBuzz(int from, int to){
        IntStream.range(from, to)
                .forEach(this::conditionsNumbers);
    }

    private void conditionsNumbers(int i) {
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println(i + " " + "- FizzBuzz");
        } else if(i % 3 == 0){
            System.out.println(i + " " + "- Fizz");
        } else if(i % 5 == 0){
            System.out.println(i + " " + "- Buzz");
        }
    }
}


