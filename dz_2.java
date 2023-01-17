import java.util.Random;

public class dz_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(0,2001);
        System.out.println(i);
        int n = String.valueOf(Integer.toBinaryString(rnd.nextInt())).length();
        System.out.println(n);
}
}