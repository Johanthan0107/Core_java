class Revers_no{
	
public static void main(String args[]){
	
int num=7971, reverse = 0;

while(num !=0)
{
int i=num%10;
reverse = reverse*10+i;
num/=10;
}

System.out.println("Reverse: " +reverse);
}

}

