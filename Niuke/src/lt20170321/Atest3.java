package lt20170321;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Atest3 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        try {
            T = Integer.parseInt(br.readLine());
            //char[] re = new char[T];
            for(int t = 0; t < T; t++){
                String str = br.readLine();
                System.out.println(getFirst(str));
            }
           
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

	}

	public static Character getFirst(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		Character rs = null;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				rs = entry.getKey();
				break;
			}

		}
		return rs;

	}
}
