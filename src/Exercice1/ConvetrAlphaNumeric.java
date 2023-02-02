package Exercice1;

public class ConvetrAlphaNumeric {

	public ConvetrAlphaNumeric() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int note = 69;

		if (note >= 0 && note <= 59) {
			System.out.println("F");
		} else if (note >= 60 && note <= 69) {
			System.out.println("D");
		} else if (note >= 70 && note <= 76) {
			System.out.println("C");
		} else if (note >= 77 && note <= 79) {
			System.out.println("C+");
		} else if (note >= 80 && note <= 82) {
			System.out.println("B-");
		} else if (note >= 83 && note <= 86) {
			System.out.println("B");
		} else if (note >= 87 && note <= 89) {
			System.out.println("B+");
		} else if (note >= 90 && note <= 92) {
			System.out.println("A-");
		} else if (note >= 93 && note <= 100) {
			System.out.println("A");
		}  else {
			System.out.println("Cette note n'est pas prise en compte");
		}

	}

}
