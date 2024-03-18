package lab11.labs.prob2;
import java.util.*;

public class GroupUtil {
	// Fixed code
	public static <T> Group<T> copy(Group<T> group) {
		List<T> elements = new ArrayList<>(group.getElements()); // Create a copy of the elements list
		return new Group<>(group.getSpecialElement(), elements); // Create a new group with the copied elements
	}

	// Helper method to capture wildcard type
	public static Group<?> copyWildcard(Group<?> group) {
		return copyHelper(group);
	}

	// Private helper method with bounded type parameter
	private static <T> Group<T> copyHelper(Group<T> group) {
		return copy(group); // This calls the generic copy method
	}

	// Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println("Original group:");
		System.out.println(group);

		Group<?> copiedGroup = GroupUtil.copyWildcard(group);
		System.out.println("Copied group:");
		System.out.println(copiedGroup);
	}
}
