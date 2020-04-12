package Day1FormatterprimitiveDataType;

public class MTest06 {
// 유니코드 확인 하는 Tip: MSoffice Word(기호-M)나 hwp(ctrl+F10)에서 문자표 열면 확인 가능
	public static void main(String[] args) {
	
		char ch='\uB300';
		System.out.println(ch);
		
		char ch01='\uD55C';
		System.out.println(ch01);
		
		char ch02 ='\uBBFC';
				System.out.println(ch02);
				
		char ch03 ='\uAD6D';
				System.out.println(ch03);
		
				int ch04='\uD55C';
				System.out.println(ch04);
	}

}
