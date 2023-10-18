package ch14.sec02.verify.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {

	public static void main(String[] args) throws IOException {
		String filePath = "src/ch14/sec02/verify/exam/AddLineNumberExample.java";
		
		// filePath 경로의 파일을 연결한다.
		FileReader fr = new FileReader(filePath);
		
		// a
		BufferedReader br = new BufferedReader(fr);
		
		char[] chars = new char[1024];
		int lineNumber = 0;
		// 소스 코드의 줄 수 만큼 반복해야 한다.
		// 반복되는 횟수가 정해지지 않을 경우 while
		// readLine() / Reader.readLine() : \r or \n을 만날 때까지 내용을 읽어온다.
		String lineString;
		while(true) {
			if((lineString=br.readLine())==null) break;
			System.out.println((lineNumber++) + ":" + lineString);
		}
		System.out.println("깃허브에 올려보자!");
		br.close();
		fr.close();
	}
}
