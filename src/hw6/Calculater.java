package hw6;


public class Calculater {

	public  void powerXY(int x ,int y) throws CalException{
		int sum;
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒意義");

		}
		else if (y < 0) {
			throw new CalException("y為負值,而導致x的y次方結果不為整數");
		} 
		else {
			sum = (int)Math.pow(x, y);
			System.out.println(x + "的" + y + "次方為" +  sum);
		}
		
	}
	
}
