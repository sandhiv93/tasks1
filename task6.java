import java.util.Scanner;

public class task6
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days stayed: ");
        int noDays = in.nextInt();
        int amt = 0;
        if (noDays <= 3)
            amt = noDays * 350;
        else if (noDays <= 6)
            amt = 3 * 350 + ((noDays - 3) * 300);
        else if (noDays <= 9)
            amt = 3 * 350 + 3 * 300 + ((noDays - 6) * 275);
        else
            amt = 3 * 350 + 3 * 300 + 3 * 275 + ((noDays - 9) * 225);

        System.out.println("\t\tXYZ INTERNATIONAL HOTEL");
        System.out.println("NUMBER OF DAYS STAYED: " + noDays);
        System.out.println("AMOUNT TO BE PAID: " + amt);

    }
}