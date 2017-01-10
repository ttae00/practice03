package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행 결과: ");
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print(">> ");
			
			String exp= scanner.nextLine();
			
			if(exp.equals("quit")){
				break;
			}
			
			String[] tokens= exp.split(" ");
			int first= Integer.parseInt(tokens[0]);
			int second= Integer.parseInt(tokens[2]);
			int result=0;
			
			switch(tokens[1]){
				case "+":{
					//add함수만들어서 인풋을 넣어 계산하게 한다
					Add add= new Add();
					add.setValue(first, second);
					result=add.calculate();
					System.out.println(">> "+ result);
					break;
				}
				case "-":{
					Sub sub= new Sub();
					sub.setValue(first, second);
					
					result=sub.calculate();
					System.out.println(">> "+ result);
					break;
				}
				case "*": {
					Mul m= new Mul();
					m.setValue(first, second);
					result=m.calculate();
					System.out.println(">> "+ result);
					break;
				}
				case "/": {
					Div d= new Div();
					d.setValue(first, second);
					result=d.calculate();
					System.out.println(">> "+ result);
					break;
				}
			}
		
		}
		
		scanner.close();
	}
}
