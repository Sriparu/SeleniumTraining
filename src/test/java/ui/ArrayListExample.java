package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;
@Test
public class ArrayListExample {

	@Test(priority = 1, enabled = true)
	public void ArrayList() {

		// Add item to ArrayList
		ArrayList<Comparable> al = new ArrayList<>();
		al.add(10);
		al.add("Paru");
		al.add(true);
		al.add("Nithya");
		System.out.println(al.size());
		System.out.println(al);

		// Remove the items from ArrayList
		al.remove(0);

		// Fetch the values
		try {
			al.get(2);// IndexOutofBoundsException
			System.out.println(al.get(2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are accessing index value which is not available");

		}

//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}

		for (Object obj : al) {
			System.out.println(obj);
		}

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Test(priority = 2)
	public void genericsArrayList() {

		// Generics ArrayList
		ArrayList<String> stringArray = new ArrayList<String>();
		stringArray.add("2704 COASTAL RANGE WAY");
		stringArray.add("This is my Home");
		System.out.println(stringArray.get(0));
	}
	
	@Test(priority=3)
	public void hashSetDemo() {
		HashSet<Integer> hsetdemo = new HashSet<Integer>();
		hsetdemo.add(10);
		hsetdemo.add(20);
		hsetdemo.add(30);
		hsetdemo.add(10);
		hsetdemo.add(20);
		hsetdemo.remove(20);
		System.out.println(hsetdemo);
		
		Iterator itr = hsetdemo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Integer intdemo:hsetdemo) {
			System.out.println(intdemo);			
		}		
	}

	public void hashMapDemo() {
		HashMap<String,String> hMapdemo = new HashMap<String,String>();
        hMapdemo.put("QA,", "http://qa.com");
        hMapdemo.put("UAT,", "http://uat.com");
        hMapdemo.put("preprod,", "http://prepod.com");
        hMapdemo.put("PROD,", "http://pod.com");
        
        hMapdemo.remove("preprod");
        System.out.println(hMapdemo);	
		
	}
}
