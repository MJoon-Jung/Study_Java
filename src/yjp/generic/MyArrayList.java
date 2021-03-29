package yjp.generic;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {
	Object[] array;
	private int capacity = 10;
	private int size = 0;

	public MyArrayList() {
		array = new Object[capacity];
	}
	public int size() {
		return size;
	}
	public void add(T value) {
		if(isPull()) {
			increase();
		}
		array[size++] = value;
	}
	public void add(int index, T value) {
		Object[]tmpArray = new Object [size + 1];
		for(int i = 0; i < index; i++) {
			tmpArray[i] = array[i];
		}
		tmpArray[index] = value;
		for(int i = index+1; i < tmpArray.length; i++) {
			tmpArray[i] = array[i-1];
		}
		array = tmpArray;
		size++;
	}
	public void remove(T value) {
		int idx = -1;
		for(int i = 0; i < size; i++) {
			if(array[i] == value) {
				idx = i;
				break;
			}
		}
		if(idx < size && idx >= 0) {
			Object[]tmpArray = new Object [size-1];
			int size2 = 0;
			for(int i = 0; i < array.length; i++) {
				if(idx != i) {
					tmpArray[size2++] = array[i];
				}
			}
			array = tmpArray;
			size--;
		}
	}
	public void remove(int idx) {
		if(idx < size && idx >= 0) {
			Object[]tmpArray = new Object [size-1];
			int size2 = 0;
			for(int i = 0; i < array.length; i++) {
				if(idx != i) {
					tmpArray[size2++] = array[i];
				}
			}
			array = tmpArray;
			size--;
		}
	}
	public boolean isPull() {
		if(size >= capacity) {
			return true;
		}
		return false;
	}
	public void increase() {
		int increasedCapacity = (int) (capacity * 1.5);
		Object[]tmpArray = new Object [increasedCapacity];
		System.arraycopy(array, 0, tmpArray, 0, size);
		array = tmpArray;
		capacity = increasedCapacity;
//		T[]tmpArray = Arrays.copyOf(array, size);
//		array = (T[]) new Object [increasedCapacity];
//		for(int i = 0; i < size; i++) {
//			array[i] = tmpArray[i];
//		}
	}
	public T get(int idx) {
		if(idx < size)
			return (T) array[idx];
		return null;
	}
}
