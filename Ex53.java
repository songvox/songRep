package List;

public class Ex53 {

	
	
	public Ex53() {
		
		int[] num = {33,55,43,200,100,15};
		
		int min = num[0]; //33
		int max = num[0]; //33
		
	for(int i =1; i<num.length; i++) {
		
		
		if(num[i]<min) {
			
			min=num[i];
			
		}else if(num[i] > max) {
			
			max = num[i];
			
		}
	
		System.out.println("최소값은  :" + min);
		
		System.out.println("최대값은 : " + max);
	
		}
		
	
	
	}
	
	public static void main(String args[]) {
		
		
		new Ex53();
		
	}
}
