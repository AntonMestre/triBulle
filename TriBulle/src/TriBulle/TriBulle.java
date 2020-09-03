package TriBulle;

public class TriBulle {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		int[] tabEntier= {17,12,89,15,85,96,104,1,6,24};
		int taille= tabEntier.length-1;
		int nbrTransition;
		
		for(int i=1; i < tabEntier.length;i++) {
			
			for(int j=0;j <= taille-i;j++) {
				
				
				if(tabEntier[j] >= tabEntier[j+1]) {
					
					//echange
					nbrTransition = tabEntier[j+1];
					tabEntier[j+1]=tabEntier[j];
					tabEntier[j]=nbrTransition;
					
				}
				
			}
			
		}
	}
	
}
