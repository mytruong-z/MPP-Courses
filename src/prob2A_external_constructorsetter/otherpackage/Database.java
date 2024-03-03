package lesson2.labsolns.prob2A_external_constructorsetter.otherpackage;

import java.util.*;


public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();
	static {
		h.put("1", new DataRecord("1", "Bob", "A"));
		h.put("2", new DataRecord("2", "Alan", "B"));
		h.put("3", new DataRecord("3", "Dave", "A"));
		h.put("4", new DataRecord("4", "Perry", "C"));
	}
}
