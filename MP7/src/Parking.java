import java.util.Scanner;

public class Parking {
		private String carNumber;
		private double inTime;
		private double outTime;
		
		public Parking() {
			
		}
		
		public Parking(final String setCarNumber, final double setInTime,
				final double setOutTime, final double setMoneyPaid) {
			this.inTime = setInTime;
			this.outTime = setOutTime;
			this.carNumber = setCarNumber;
		}
		
		public double getInTime() {
			return inTime;
		}
		
		public void setInTime(double newInTime) {
			this.inTime = newInTime;
		}
		
		public double getOutTime() {
			return outTime;
		}
		
		public void setOutTime(double newOutTime) {
			this.outTime = newOutTime;
		}
		
		public String getCarNumber() {
			return carNumber;
		}
		
		public void setCarNumber(String newCarNumber) {
			this.carNumber = newCarNumber;
		}
		
		public double moneyPaid() {
			double parkingTime = this.getOutTime() - this.getInTime();
			if (parkingTime <= 0.25) {
				return 0;
			} else if (parkingTime > 0.25 && parkingTime <= 2) {
				return 2.5 * parkingTime;
			} else {
				return 5 * (parkingTime - 2) + 5;
			}
		}
		
		public static void main(String[] args) {
			Scanner myScan = new Scanner(System.in);
			Parking car = new Parking();
			System.out.println("Please enter your carNumber: ");
			car.carNumber = myScan.nextLine();
			System.out.println("Please enter inTime of this car: ");
			car.inTime = myScan.nextDouble();
			System.out.println("Please enter outTime of this car: ");
			car.outTime = myScan.nextDouble();
			System.out.println("Your money need to pay is: " + car.moneyPaid() +
					"Enjoy yourself!");
		}
	}