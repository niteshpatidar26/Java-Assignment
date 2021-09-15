import java.util.Scanner;

public class CheckStarToEndString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String inpuString = sc.nextLine();
        int lastIndex = inpuString.length()-1;
        sc.close();
        if((inpuString.charAt(0) == 'A' || inpuString.charAt(0) == 'a') &&  (inpuString.charAt(lastIndex) == 'T' || inpuString.charAt(lastIndex) == 't'))
        
            System.out.println("String starts with 'A' and ends with 'T'");

        else

            System.out.println("String does not starts with 'A' and ends with 'T'");
        
    }

}
