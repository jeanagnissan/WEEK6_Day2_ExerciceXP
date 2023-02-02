package Exercice4;

public class Exercice4 {

	public Exercice4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// fix the code
//        byte numOne = 104;
//        byte numTwo = 110;
//        System.out.print("Sum: " + numOne);
//        System.out.print("Sum: " + numTwo);
//
//        byte sumOfTwoNumbers;
//        sumOfTwoNumbers = (byte)(numOne + numTwo);
//        System.out.print("Sum: " + sumOfTwoNumbers);
        
        byte numOne = 104;
        byte numTwo = 110;
        int sumOfTwoNumbers;
        sumOfTwoNumbers = (numOne & 0xff) + (numTwo & 0xff);
        byte sum = (byte) sumOfTwoNumbers;
        System.out.print("Sum: " + (sum & 0xff));
	}

}
