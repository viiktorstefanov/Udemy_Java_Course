//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double initialValue = 20.00;
        double secondValue = 80.00;
        double result = (initialValue + secondValue) * 100;
        System.out.println(result);
        double reminder = result % 40.00;
        System.out.println(reminder);
        boolean isNotReminder = (reminder == 0 ) ? true : false;
        System.out.println(isNotReminder);

        if ( !isNotReminder) {
            System.out.println("Got some reminder");
        }

    }

}