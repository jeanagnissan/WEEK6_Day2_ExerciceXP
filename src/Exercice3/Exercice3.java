package Exercice3;

public class Exercice3 {

	private byte age = 10;
	private short height = 30000;
	private int distanceBetweenTwoSatellites = 1000000000;
	private long distanceBetweenTwoGalaxy = 10000000000L;
	private float rateOfInterest =   6/5f;
	private double rateOfHike = 456/123d;
	private char capitalA  = 'A';
	private boolean  isPossible =  true;
	
	
	public Exercice3() {
		super();
	}


	public static void main(String[] args) {
		
		Exercice3 exercice = new Exercice3();
		 // print byte variable with the next statement
        System.out.println("Age is: " + exercice.age);

        // print short variable with the next statement
        System.out.println("Height is: " + exercice.height);

        // print int variable with the next statement
        System.out.println("Distance between two satellites is: " + exercice.distanceBetweenTwoSatellites);

        // print long variable with the next statement
        System.out.println("Distance between two galaxies is: " + exercice.distanceBetweenTwoGalaxy);

        // print float variable with the next statement
        System.out.println("Rate of interest is: " + exercice.rateOfInterest);

        // print decimel variable with the next statement
        System.out.println("Rate of hike is: " + exercice.rateOfHike);

        // print char variable with the next statement
        System.out.println("CapitalA: " + exercice.capitalA);

        // print boolean variable with the next statement
        System.out.println("isPossible: " + exercice.isPossible);

	}

}
