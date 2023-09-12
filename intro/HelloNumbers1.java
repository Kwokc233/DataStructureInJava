public class HelloNumbers1 {
    public static void main(String[] args) {
        int x = 0;
        int sumOFx = 0;
        while (x < 10) {
            x += 1;
            System.out.print(sumOFx + " ");
            sumOFx += x;
        }
    }
}