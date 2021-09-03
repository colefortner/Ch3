package conditionals;

public class SwitchStatements {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int dayNum = input.nextInt();

        String day;
        switch (dayNum){
            case 0:
                day = "Sunday";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day = "Blah, its a workday";
//                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Int does not correspond to a day of the week";
        }
        System.out.println(day);
    }
}
