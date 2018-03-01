package l24;

public interface CompareInterface<T> {

	// returns 0 if equal, -1 if first is higher, 1 otherwise
	public int compare(T second);
}
