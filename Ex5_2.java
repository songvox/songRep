package List;

public class Ex5_2 {


	public Ex5_2() {
	
	int[] score = {10,20,30,40,50};
	
	int sum =0;
	int aver = 0;
	
		for(int i = 0; i<score.length; i++) {
			
			sum  = sum + score[i];
			
		aver= sum / score.length;
			
		}
	
			System.out.println("ÃÑÇÕÀº "+ sum);
			System.out.println("Æò±ÕÀº"+ aver);
	
	}
	
	public static void main(String args[]) {

		
		 new Ex5_2();
	
	}
	
}
