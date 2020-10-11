package holder;

public class expandableArray {
	/**
	* Creates a new expandable array with no elements.
	*/
	Object[] expand = new Object[0];
	public expandableArray() {

	}
	/**
	* Sets the element at the given index position to the specified.
	* value. If the internal array is not large enough to contain that
	* element, the implementation expands the array to make room.
	*/
	public void set(int index, Object value) {
		Object[] expanding = new Object[index];
		expanding[index-1] = value;
		for(int i =0; i < expand.length; i++) {
			expanding[i] = expand[i];
		}
		expand = expanding;
	}
	/**
	* Returns the element at the specified index position, or null if
	* no such element exists. Note that this method never throws an
	* out-of-bounds exception; if the index is outside the bounds of
	* the array, the return value is simply null.
	*/
	public Object get(int index) {
		if(expand[index-1]!=null) {
			return expand[index-1];
		}
		return null;

	}
}
