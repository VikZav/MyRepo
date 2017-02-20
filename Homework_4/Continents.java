
public class Continents {
	public enum Cont {
		AFRICA, ASIA, EUROPE, AUSTRALIA, NORTHAMERICA
	}
	
	
	Cont continent;
	
	public Cont getCountry (String cName) {
		switch (cName){	
		case "Nigeria": case "Kenya": case "Egypt":  {
		continent=Cont.AFRICA;
		break; 
		}
		case "China": case "Japan": case "Thailand": case "SouthKorea": {
		continent=Cont.ASIA;
		break;
		} 
		case "Ukraine": case "Poland": case "Romania": {
		continent=Cont.EUROPE;
		break;
		}
		case "Australia": {
		continent=Cont.AUSTRALIA;
		break;
		}
		case "Canada": case "USA": {
		continent=Cont.NORTHAMERICA;
		break;
		}
		default:
			System.out.println("Not a valid country");
		}
		return continent;
	}
	
	
	
	
	public static void main(String[] args) {
		Continents qwerty = new Continents ();
		System.out.print("Ukraine is a "+ qwerty.getCountry("Ukraine"));
		
		
	}
	
	
	
	
	
	
}
