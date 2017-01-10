package prob02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods goods= new Goods();
		Goods[] goodsArray= new Goods[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("실행 결과: ");
		
		for(int i=0; i<goodsArray.length; i++){
			
			goods.name=sc.next();
			goods.price= sc.nextInt();
			goods.count= sc.nextInt();
			
		}
		
		for(Goods v:goodsArray){
			
			v =new Goods();
			v = goods;
			System.out.println(v.name+ "(가격:" + v.price + "원)이 " + v.count+ "개 입고 되었습니다.");
		}
		
		
		
	}
}
