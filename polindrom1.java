public class PalindromTest{
	public static void main(String[]args){
		int n=781,r;
		int reverse=0;int temp=n;
		while(n>0){
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println(reverse);
		if(temp==reverse)
		{
			System.out.println("palindrom");
			
		}
		else{
			System.out.println("not");
		}
	}
}//141