package jojuskills;

public class Country1 {
	public static void main(String[] args) {
		Country countries = new Country();
			countries.saveCountryNames("India");
			countries.saveCountryNames("USA");
			countries.saveCountryNames("Bangladesh");
			countries.saveCountryNames("China");
			countries.saveCountryNames("Russia");
			countries.saveCountryNames("Japan");

			System.out.println("India: " + countries.retrieveCountry("India"));
			System.out.println("Pakistan: " + countries.retrieveCountry("Pakistan"));		
		}

	}/*India: India
Pakistan: null
*/