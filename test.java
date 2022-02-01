
public class test {

    public static void main(String[] args) {
        System.out.println("Now the program will start");
        printFirstName();
        printLastName();
        addNames();
        System.out.println("The total sum we get after passing the value is :" + totalName(4, 4));
    }

    public static void printFirstName() {
        System.out.println("This is my first method try \n");
    }

    public static void printLastName() {
        System.out.println("This is my second try to method");
    }

    public static void addNames() {
        int kailash = 7;
        int Dhakal = 6;

        int sum = kailash + Dhakal;
        System.out.println("The sum of the numbers of laters is: " + sum);
    }

    public static int totalName(int a, int b) {
        int totalSum = a + b;
        return totalSum;
    }
}