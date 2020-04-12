package Day1FormatterprimitiveDataType;

//기본 출력 매소드: printf(), println(), 제어문자
//printf()와 println() 차이: ln이 한줄 개행되어 출력된다.
public class MTest01 {
		//printf(String format, Object... args) ...-> 1more, 코드는 메소드 안에 작성한다
	public static void main(String[] args) {
		
		//1. 정수를 출력   %전체 자리수d   제어문자 \t \n \\ \r \b
		System.out.printf("%5d%5d%5d\n",100,200,300 ); //5칸 정수자리 확보 후 100을 출력
		System.out.println(100+"\t"+100+"\t"+100);
		
		//2. 실수를 출력 %f	%전체자리수.소수자리수f	%3.1f
		System.out.printf("%3.1f\n",97.85);
		
		//3. 한문자 %c		문자열%s
		System.out.printf("%5c%-10s\n",'a',"abc");
		System.out.println("오늘은\'기분\'이 좋다");
		System.out.println("오늘은\"기분\"이 좋다 용돈\\30000");
	
	}

}
