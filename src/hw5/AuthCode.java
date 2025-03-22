package hw5;

public class AuthCode {
	static void genAuthCode() {
		String [] all = {"0","1","2","3","4","5","6","7","8","9",
				"a","b","c","d","e","f","g","h","i","j","k","l","m"
				,"n","o","q","r","s","t","u","v","w","x","y","z","p","A",
				"B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
				"Q","R","S","T","U","V","W","X","Y","Z"};
		
		String authcode = "";
		for(int i = 0; i < 8; i ++) {
			authcode += all[(int)(Math.random() * 63)];
		}
			System.out.println(authcode);
	}
	public static void main(String[] args) {
		genAuthCode();
	}
}
