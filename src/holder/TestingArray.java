package holder;

import acm.program.*;

public class TestingArray extends ConsoleProgram {

	public void run() {
		expandableArray myList = new expandableArray();
		myList.set(14, "Bob");
		myList.set(21, "Sally");
		
		
		String value = (String) myList.get(14); // Note the cast
		if (value != null) {
		println("Got value: " + value);
		}
	}
	
	
}
