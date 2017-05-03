package passByValueTest;

public class PassByValue1 {

	/*public static void main(String[] args) {
		String temp = "Vinay";
		print(temp);
		//If Java is pass by reference then it should have thrown NullPointerException as reference is set to Null.
		System.err.println("Main Temp Val : "+temp);*/
		 static int x;
		    StringBuffer sb = new StringBuffer();
		    static StringBuffer sb2 = new StringBuffer();
		    public PassByValue1() {
		        method();
		        method2();
		    }
		    public void method(){
		        x += 3;
		        sb.append(x);
		    }
		    public void method2(){
		        x += 3;
		        sb2.append(x);
		    }
		    public static void main(String[] args){
		    	PassByValue1 mc = new PassByValue1();
		    	PassByValue1 mc2 = new PassByValue1();
		    	PassByValue1 mc3 = new PassByValue1();
		        System.out.println(mc2.sb + "-" + mc2.sb2);
		    }
	/*}*/

	/*private static void print(String temp) {
		temp = null;
		System.err.println("Copy Temp Val : " +temp);
	}
*/
}
