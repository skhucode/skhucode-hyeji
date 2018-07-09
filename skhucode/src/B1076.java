

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B1076 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> table = new HashMap<>();
		
		table.put("black", "0");
		table.put("brown", "1");
		table.put("red", "2");
		table.put("orange", "3");
		table.put("yellow", "4");
		table.put("green", "5");
		table.put("blue", "6");
		table.put("violet", "7");
		table.put("grey", "8");
		table.put("white", "9");
		
		String[] s = new String[3];
		for(int i = 0; i < 3; ++i) {
			s[i] = br.readLine();
		}
		
		int value = Integer.parseInt(table.get(s[0]) + table.get(s[1]));
		int multi = (int)Math.pow(10, Integer.parseInt(table.get(s[2]))); // 제곱함수 Math.pow(밑, 지수)
		
		System.out.println(value * multi);
	}

}
