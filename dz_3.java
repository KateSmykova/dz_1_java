import java.util.Random;

public class dz_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(0,2001);
        System.out.println(i);
        int n = String.valueOf(Integer.toBinaryString(rnd.nextInt())).length();
        System.out.println(n);
        int[] m1 = new int [Short.MAX_VALUE];
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if(n==0);
            System.out.println(String.valueOf(m1[j]));
        }
    }
}
