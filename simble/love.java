
public class Love {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && j % 3 != 0) ||
                    (i == 1 && j % 3 == 0) ||
                    (i - j == 2) ||
                    (i + j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 45; j++) {

                if (j >= 0 && j <= 4) {
                    if (i == 0 || i == 6 || j == 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                else if (j >= 5 && j <= 8) {
                    System.out.print(" ");
                }

                else if (j >= 9 && j <= 13) {
                    if (j == 9 || i == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                else if (j >= 14 && j <= 17) {
                    System.out.print(" ");
                }

                else if (j >= 18 && j <= 22) {
                    if (((i == 0 || i == 6) && j > 18 && j < 22) ||
                        ((j == 18 || j == 22) && i > 0 && i < 6)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                else if (j >= 23 && j <= 26) {
                    System.out.print(" ");
                }

                else if (j >= 27 && j <= 31) {
                    if ((j == 27 || j == 31) && i < 4 ||
                        (i == 4 && (j == 28 || j == 30)) ||
                        (i == 5 && j == 29)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                else if (j >= 32 && j <= 35) {
                    System.out.print(" ");
                }

                else if (j >= 36 && j <= 40) {
                    if (j == 36 || i == 0 || i == 3 || i == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                
                else if (j >= 41 && j <= 44) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 19; j++) {

                // Y
                if (j <= 4) {
                    if ((i < 3 && (j == 0 || j == 4)) ||
                        (i == 3 && j == 2) ||
                        (i > 3 && j == 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                
                else if (j >= 5 && j <= 7) {
                    System.out.print(" ");
                }

                // O
                else if (j >= 8 && j <= 12) {
                    if (((i == 0 || i == 6) && j > 8 && j < 12) ||
                        ((j == 8 || j == 12) && i > 0 && i < 6)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                
                else if (j >= 13 && j <= 15) {
                    System.out.print(" ");
                }

                
                else if (j >= 16 && j <= 18) {
                    if (j == 16 || j == 18 || i == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
