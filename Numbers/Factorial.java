public class Factorial {
//Do something less than 20 please because long is stored in 64bit.
    public static void main(String[] args) {
        long out = factorial(Integer.parseInt(args[0]));
        System.out.println(out);
    }
    public static long factorial(int in) {
        if (in == 0) {
            return 1;
        } else {
            return (in * factorial(in - 1));
        }
    }
}