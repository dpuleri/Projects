import java.util.Arrays;
public class ValidateCreditNum {
    public static Boolean validateCreditNum(int... num) {
        int lastNum = num[num.length - 1];
        int[] check = Arrays.copyOf(num, num.length - 1);
        int[] check2 = new int[check.length];
        for (int i = 0, j = check.length - 1; i < check.length; i++, j--) {
            check2[j] = check[i];
        }
        for (int i = 0; i < check2.length; i += 2) {
            check2[i] = check2[i] * 2;
            check2[i] = (check2[i] > 9) ? check2[i] - 9 : check2[i];
        }
        int sum = 0;
        for(double i: check2) {
            sum += i;
        }
        return (((sum + lastNum) % 10) == 0) ? true : false;
    }
    public static void main(String[] args) {
        String numbers = ""; // init
        //If block below make it flexible to take numbers in different ways
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                numbers += args[i];
            }
        } else if (args.length < 1) {
            System.out.println("Please enter a card number!");
            System.exit(0);
        } else {
            numbers = args[0];
        }
        int[] num = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            num[i] = Character.getNumericValue(numbers.charAt(i));
        }  
        Boolean ans = validateCreditNum(num);
        if (ans) {
            System.out.println("Valid!");
        } else {
            System.out.println("Not valid...");
        }
    }
}