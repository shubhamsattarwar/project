package pattern;

public class starpattern {

	public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		
	for(int j=4;j>=i;i--) {
		
		if(j>i) {
			System.out.println(" ");
		}else 
			{
				System.out.println(" *");}
		}System.out.println();
	}
	}
	}
