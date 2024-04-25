public class Main {
    public static void main(String[] args) {
        System.out.println("test123");
        for (int a = 0; a < 18; a += 3) {
            int mod = a % 2;
            
            if (mod == 0) {
                System.out.println(a + " ");
            }
        }

        System.out.println("---------------------");

        int total = 0;
        for (int g = -4; g < 13; g++) {
          int div = g / 3;
          total = total + div;
        }
        System.out.println(total);
    }
}