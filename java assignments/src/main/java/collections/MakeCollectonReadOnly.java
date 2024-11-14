package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

public class MakeCollectonReadOnly {

	public static void main(String[] args) {
		//A read-only Collection means a Collection where we cannot perform modifications like add, remove or set. We can only read from the Collection by using get method or by using Iterator

		//This kind of Collection is good for a certain requirement where parameters are final and cannot be changed.


		// In Java, we can use Collections.unModifiableList() method to create read-only List , Collections.unmodifiableSet() for creating read-only Set like read-only HashSet and similarly creating a read-only Map in Java, as shown in below example. Any modification in the read-only List will result in java.lang.UnSupportedOperationException.
		
		List<String> stuff = Arrays.asList(new String[] { "a", "b" });
		
		List<String> li=new ArrayList<>(stuff);
		
		li=Collections.unmodifiableList(li);
		
		
		Map<Integer, String> map=new HashMap<>();
		map=Collections.unmodifiableMap(map);
		
		Set<String>sett=new HashSet<String>(stuff);
		
		sett=Collections.unmodifiableSet(sett);
		
		System.out.println("Collections are read-only now.");
		
		
		
		
		
		
	}

}
