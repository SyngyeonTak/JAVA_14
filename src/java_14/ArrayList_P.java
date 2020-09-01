package java_14;

import java.util.ArrayList;

public class ArrayList_P {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<8;i++){
			list.add((i + 1) * 10);
			
		}
		System.out.println(list);list.add(90);
		System.out.println(list);
		int index = list.indexOf(10);
		
		if(index!=-1){
			list.add(index + 1, 15);
		}else{
			list.add(0, 15);
		}
		System.out.println(list);
		
		list.set(list.indexOf(60),600);
		
		System.out.println(list);
		
		list.remove(1);System.out.println(list);
		
	}
}

