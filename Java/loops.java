public class loops {
    public static void main(String[] args) {

        int num = 10;

        // IF - ELSE IF - ELSE
        if (num > 10) {
            System.out.println("Number is greater than 10");
        } 
        else if (num == 10) {
            System.out.println("Number is equal to 10");
        } 
        else {
            System.out.println("Number is less than 10");
        }

        // FOR LOOP
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip 3
            }
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            if (i == 4) {
                break; // stop loop at 4
            }
            System.out.println(i);
            i++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 3);
    }
}