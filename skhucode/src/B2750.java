

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2750 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; ++i) {
			String line = br.readLine();
			list.add(line);
		}
		
		Collections.sort(list);
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
