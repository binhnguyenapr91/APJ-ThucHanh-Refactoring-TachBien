public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean idDevisionToThree = number % 3 == 0;
        boolean isDevisionToFive = number % 5 == 0;
        if(idDevisionToThree && isDevisionToFive)
            return "FizzBuzz";

        if(idDevisionToThree)
            return "Fizz";

        if(isDevisionToFive)
            return "Buzz";

        return number + "";
    }
}
