//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] number = {100, 521, -76, -12, 174};
        int biggest = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > biggest) {
                biggest = number[i];
                System.out.println(biggest);
            }
        }
        /* O(1)+O(n) */
    }
}