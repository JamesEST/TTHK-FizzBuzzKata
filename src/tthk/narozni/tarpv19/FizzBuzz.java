package tthk.narozni.tarpv19;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(of(i));
        }
    }
    public static String of(int i) {
        if(i == 0) return "0";
        if(i % 5 == 0 && i % 3 == 0) return "FizzBuzz";
        if(i % 3 == 0) return "Fizz";
        if(i % 5 == 0) return "Buzz";
        return String.valueOf(i);
    }
}
