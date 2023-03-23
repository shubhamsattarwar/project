package pattern;

public class palindrome {

	public static void main(String[] args) {
	int i=121;
	int temp=i;
	int rev=0,remainder;
	
	while(temp!=0);
	{ remainder =temp%10;
	rev=rev*10+remainder;
	temp=temp/10;
	}
	if (i==rev) {
		System.out.println(i+"is palindrome number");
	}
	else
	{	System.out.println(i+"is not palindrome number");
	}
	

	}

}
