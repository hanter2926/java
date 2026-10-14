
public class FractalPattern {
    public static void main(String[] args) {

        String name = "VIKRAM PAL";

        int height = 7;
        int width = 5;

        String[][] letters = {
            {"10001","10001","10001","10001","01010","01010","00100"}, 
            {"11111","00100","00100","00100","00100","00100","11111"}, 
            {"10001","10010","10100","11000","10100","10010","10001"}, 
            {"11110","10001","10001","11110","10100","10010","10001"}, 
            {"01110","10001","10001","11111","10001","10001","10001"}, 
            {"10001","11011","10101","10101","10001","10001","10001"}, 
            {"11111","10000","10000","11110","10000","10000","10000"}, 
            {"11111","00001","00001","00110","00001","00001","11111"}, 
        };

        char[] chars = {'V','I','K','R','A','M','P','L'};

        System.out.println("--- VIKRAM PAL ---");

        for (int i = 0; i < height; i++) {
            for (int k = 0; k < name.length(); k++) {
                char ch = name.charAt(k);

                if (ch == ' ') {
                    System.out.print("   ");
                    continue;
                }

                int index = 0;
                for (int x = 0; x < chars.length; x++) {
                    if (chars[x] == ch) {
                        index = x;
                        break;
                    }
                }

                for (int j = 0; j < width; j++) {
                    if (letters[index][i].charAt(j) == '1') {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

