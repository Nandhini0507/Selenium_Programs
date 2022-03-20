package automationFramework;


import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> names=new HashSet <String> ();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.add("ddd");
		names.add("ccc");
		for(String output:names) {
			System.out.println(output);
		}


	}

}
