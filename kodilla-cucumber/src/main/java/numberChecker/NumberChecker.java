package numberChecker;

public class NumberChecker {
    public String checkIfNumber(int number) {
        if (number == 3 ) {
            return "Fizz";
        } if (number == 5 ) {
            return "Buzz";
        }
        if (number ==5 && number== 3) {
            return "FizzBuzz";
        }
        return "None";
    }
}

