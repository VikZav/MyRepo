package Birds_task;

public class Main {

	public static void main(String[] args) {
		
		Bird Birds [] = {
			new Eagle (),
			new Swallow (),
			new Kiwi (),
			new Penguin(),				
		};

	
	  for (int i=0; i<Birds.length; i++) {
		  if (Birds[i].fly()==true) {System.out.println(Birds[i].toString()+" - this bird can fly, has "+Birds[i].ATTR1+","+FlyingBird.ATTR3+", "+Birds[i].ATTR2);}		  
	      if (Birds[i].fly()==false) {System.out.println(Birds[i].toString()+" - this bird cannot fly, has "+Birds[i].ATTR1+","+NonFlyingBird.ATTR4+", "+Birds[i].ATTR2);}		  
	  
	  
	  }   
	  
	
	
	
	
	}

}
