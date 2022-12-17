package jojuskills;
import java.util.HashMap;

public class CountryMap1 {
	public static void main(String[] args) {
			CountryMap countryMap = new CountryMap();

			countryMap.saveCountryCapital("India", "Delhi");
		  	countryMap.saveCountryCapital("Japan", "Tokyo");
			countryMap.saveCountryCapital("USA", "Washington, D.C.");
			
			System.out.println(countryMap.getCapital("India"));
			System.out.println(countryMap.getCountry("Tokyo"));
			System.out.println(countryMap.getCapital("Bhutan"));
			System.out.println(countryMap.toArrayList());
			
			HashMap<String, String> M2 = countryMap.swapKyeValue();
			System.out.println(M2);
		}

	}/*Delhi
Japan
null
[USA, Japan, India]
{Delhi=India, Washington, D.C.=USA, Tokyo=Japan}
*/