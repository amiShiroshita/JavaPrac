package java013;
//参照渡し
public class Usage02 {
	
	Usage02(){
	StringBuilder str = new StringBuilder();
	str.append("good morning!");
	//method1にstrを引き渡す
	method1(str);
	System.out.println("コンストラクタ内でのstr=" + str.toString());
}
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Usage02 usage = new Usage02();
	}

	/**
	 * @param str
	 */
	
	void method1(StringBuilder str) {
		System.out.println("method1内で、渡された直後のstr=" + str.toString());
		str.setLength(0);
		str.append("good evening.");
		
		System.out.println("method1内で、書き換えたstr=" + str.toString());
	}
}

