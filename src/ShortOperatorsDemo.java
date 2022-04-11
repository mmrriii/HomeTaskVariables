public class ShortOperatorsDemo {
    public static void main(String[] args) {
        int x;
        int y;
        x = 1;
        y = x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 1;
        y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 10;
        y = 20;
        y += x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 10;
        y = 20;
        y /= x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 11;
        y = 20;
        y %= x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 10;
        y = 20;
        y *= x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}
