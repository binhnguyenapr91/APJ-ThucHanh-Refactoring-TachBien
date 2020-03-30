public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean devisionByThree = number % 3 == 0;
        boolean devisionByFive = number % 5 == 0;
        if(devisionByThree && devisionByFive)
            return "FizzBuzz";

        if(devisionByThree)
            return "Fizz";

        if(devisionByFive)
            return "Buzz";

        return number + "";
    }
}
