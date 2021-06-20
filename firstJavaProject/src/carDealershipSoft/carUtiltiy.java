package carDealershipSoft;

public class carUtiltiy {
	
	
	
	public double getApr(int creditScore) {
		
     double apr=0;
		
		if(creditScore>750) {
			
			apr = 1; 
		}
		
		if(creditScore<750 && creditScore>=700 ) {
			
			apr = 2; 
		}
		
      if(creditScore<700 && creditScore>=650 ) {
			
			apr = 3; 
		}
		
      if(creditScore<650 && creditScore>=600 ) {
			
			apr = 4; 
		}
      
		
	return apr; 	
	
	
	}

}
