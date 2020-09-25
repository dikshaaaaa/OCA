package Day1;

import java.util.Set;

public class Program3 {
	public static void main(String[] args) {
		Set<String> strset= new HashSet<>();
		strset.add("java");
		strset.add("collection");
		strset.add("list");
		strset.add("string");
		Iterator iter= strset.iterator();
		
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
//HashSet cannot be resolved to a type
//Iterator cannot be resolved to a type