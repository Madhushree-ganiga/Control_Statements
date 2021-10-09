import java.util.Scanner;
class CheckMonths{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  month number : ");
        int month = scanner.nextInt();

        if(month == 1) {

            System.out.println("Jan");

        } else if(month == 2) {

            System.out.println("feb");

        } else if(month == 3) {

            System.out.println("march");

        } else if(month == 4) {

            System.out.println("April");

        } else if(month == 5) {

            System.out.println("may");

        } else if(month == 6) {

            System.out.println("Jun");

        } else if(month == 7) {

            System.out.println("July");

        } 
		else if(month == 8) {

            System.out.println("Aug");

        } 
		else if(month == 9) {

            System.out.println("Sept");

        } 
		else if(month == 10) {

            System.out.println("Oct");

        } 
		else if(month == 11) {

            System.out.println("Nov");

        } 
		else if(month == 12) {

            System.out.println("Dec");

        } 
		else {

            System.out.println("Please enter valid number between 1-12.");
        }
    }
}

