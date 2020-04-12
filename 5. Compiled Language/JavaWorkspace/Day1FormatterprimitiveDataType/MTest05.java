package Day1FormatterprimitiveDataType;

//재대입(덮어쓰기) char(2byte) -> '  '
public class MTest05 {

	public static void main(String[] args) {
		
		char ch=65; //65(아스키 코드 상 65번)
		System.out.println("ch="+ch);
		
		
		char r =(char) (ch +1); //(char) int+int 결과 값을 바꿔서 char로 바꿔라   , 산술연산자를 만나면 기본자료형으로
		System.out.println("r="+r);

		
		System.out.println("ch="+ch);
		
		ch =100;
		System.out.println("ch="+ch); //그 전의 내용에 더해지는 것이 아니라 덮어 지는 것
		
		ch='\uffff';
		System.out.println("ch="+ch); //유니코드 
		
		ch='\uffff';
		System.out.println("ch="+(int)ch); //문자를 숫자로 찍어 주세요->int 붙이기
		
		System.out.println((char)97); //숫자를 문자로 찍어 주세요 ->char 붙이기
	}

}