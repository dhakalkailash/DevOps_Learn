public class lesson2 {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 7;

        int totalNumberAfterAdd = totalNumber(thirdNumber);

        System.out.println("The total number after adding is : " + totalNumberAfterAdd);

        System.out.println("The sum to given number to itself is : \n" + totalNumber(firstNumber));

        System.out.println("The multiple of Given two numbers is : " + multipleNumber(secondNumber, thirdNumber));

        System.out.println("The given First and Second Numbers is equal: "
                + equalNumber(firstNumber, secondNumber));

    }

    public static int totalNumber(int a) {
        int answer = a + a;
        return answer;

    }

    public static int multipleNumber(int a, int b) {
        int multNumber = a * b;
        return multNumber;
    }

    public static boolean equalNumber(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber)
            return true;
        else
            return false;

    }

}
