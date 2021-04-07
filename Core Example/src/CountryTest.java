import java.util.Scanner;

public class CountryTest {

	public static void main(String[] args) {
		
		// Admin Section

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many country u have?");
		int countrysize = scanner.nextInt();

		Country[] countries = new Country[countrysize];

		for (int i = 0; i < countrysize; i++) {
			System.out.println("Enter the country name");
			String cname = scanner.next();
			Country c1 = new Country();
			c1.setName(cname);

			System.out.println("How many state u have?");
			int statesize = scanner.nextInt();
			State[] states = new State[statesize];

			for (int j = 0; j < statesize; j++) {

				State s1 = new State();
				System.out.println("Enter name of State");
				String statename = scanner.next();
				s1.setName(statename);
				System.out.println("Enter CM name of State");
				String cmname = scanner.next();
				s1.setCm(cmname);

				states[j] = s1;

			}

			c1.setStates(states);
			countries[i] = c1;
		}

//View Section

		for (int i = 0; i < countries.length; i++) {
			Country cc = countries[i];
			System.out.println(cc.getName());
			State[] sts = cc.getStates();
			for (int j = 0; j < sts.length; j++) {
				State s = sts[j];
				System.out.println(s.getName() + "\t" + s.getCm());
			}
			
		}

	}

}
