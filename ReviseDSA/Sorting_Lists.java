import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStringLength implements Comparator<String>{

	@Override
	public int compare(String string1, String string2) {
		
		int stringLength1 = string1.length();
		int stringLength2 = string2.length();
		
		if(stringLength1 > stringLength2) {
			return 1;
		}
		else if(stringLength1 < stringLength2) {
			return -1;
		}
		
		return 0;
	
	}
}

class SortInReverseAlphabeticalOrder implements Comparator<String>{

	@Override
	public int compare(String string1, String string2) {
		
		return -string1.compareTo(string2);
	
	}
}

public class Sorting_Lists {

	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<String>();
		
		colors.add("green");
		colors.add("purple");
		colors.add("grey");
		colors.add("black");
		colors.add("white");
		colors.add("red");
		
		// Collections.sort(colors, new SortStringLength());
		Collections.sort(colors, new SortInReverseAlphabeticalOrder());
		
		for(String color: colors) {
			System.out.println(color);
		}
	
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(59);
		values.add(2);
		values.add(5);
		values.add(9);
		values.add(21);
		
		Collections.sort(values, new Comparator<Integer>() {

			public int compare(Integer value1, Integer value2) {	
				return -value1.compareTo(value2);
			}	
		});
		for (Integer value: values) {
			System.out.println(value);
		}
	
	}

}
