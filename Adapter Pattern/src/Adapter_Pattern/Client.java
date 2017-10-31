package Adapter_Pattern;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		DataOperation dataoperation1 = new CipherAdapter();	
		DataOperation dataoperation2 = new CaesarAdapter();	
		
		System.out.println("请输入明文：");
		Scanner in=new Scanner(System.in);	
		String IN = in.nextLine();
		
		dataoperation1.setPassword(IN);
		dataoperation2.setPassword(IN);
		
		String PS1 = dataoperation1.GetPassword();
		String ES1 = dataoperation1.DoEncrypt(9, PS1);
		
		String PS2 = dataoperation2.GetPassword();
		String ES2 = dataoperation2.DoEncrypt(9, PS2);
		
		System.out.println("明文为：" +  PS1 );
		System.out.println("Cipher算法生成的密文为：" +  ES1 );
		System.out.println("Caesar算法生成的密文为：" +  ES2 );

	}

}
