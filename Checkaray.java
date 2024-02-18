public class Checkaray {
    public static void main(String[] args) {
        int[] number = {-111, 521, -76, 2, 174};
        String True = "True";
        String False = "False";
        for (int i = 0; i < number.length; i++) {
            String numStr = Integer.toString(number[i]);
            if (numStr.contains("0") || numStr.contains("-1")) {
                System.out.println(True);
                break;
            }
            else {
                System.out.println(False);
                break;
            }
            /* O(1)+O(n) */
        }
    }
}
