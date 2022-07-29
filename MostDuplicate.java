package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaabbbb";
		int maxoccurence=0;
		char maxchar='0';
		char[] c=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				map.put(c[i], map.getOrDefault(c[i], 0)+1);
			}
			else {
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>maxoccurence) {
				maxoccurence=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		System.out.println("The most duplicate character in the string is "+maxchar+" having the most occurence of "+maxoccurence);

	}
}
