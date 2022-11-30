
class OTP_Generatar
{
	public static void main (String[] args)
	{
		System.out.println(generateOTP());
		}
		private static int generateOTP(){
			
			
			int otp = (int)(Math.random() * 10000);// 0 to 100 and if we want 4,6,8 OTP number, we can change the math random number (1000000,10000000,20000,200000..etc)
			return otp;
	}//automaticaly otp will be changed.
 }
