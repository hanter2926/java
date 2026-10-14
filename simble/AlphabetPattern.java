
public class AlphabetPattern {
    public static void main(String[] args) {

        String[] pattern = {
            "V   V  III  K  K  RRRR     A    M   M   PPPP    A    L",
            "V   V   I   K K   R   R   A A   MM MM   P   P  A A   L",
            "V   V   I   KK    RRRR   AAAAA  M M M   PPPP  AAAAA  L",
            " V V    I   K K   R R    A   A  M   M   P     A   A  L",
            "  V    III  K  K  R  RR  A   A  M   M   P     A   A  LLLLL"
        };

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length(); j++) {
                char ch = pattern[i].charAt(j);

                if (ch != ' ') {
                    System.out.print("▓ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
