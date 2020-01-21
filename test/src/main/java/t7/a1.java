package t7;

public class a1 {

    public int reverse(int x) {
        int a = 0;
        while (x != 0){
            int pop = x % 10;
            if (a > Integer.MAX_VALUE / 10 || (a == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (a < Integer.MIN_VALUE / 10 || (a == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            a = a * 10 + pop;
            x = x / 10;
        }
        return a;
    }

    public static void main(String[] args){
        a1 a = new a1();
        System.out.println(a.reverse(120));
    }

}
