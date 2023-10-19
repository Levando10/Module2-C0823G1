package ss9.bai_tap.Implement_array_list;

import java.util.Arrays;

public class MyArrayList<E> {

  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];
  private Object newElement[];

  public MyArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
  }


  public MyArrayList(int cap) {
    elements = new Object[cap];
  }


  private void sizeCapacity() {
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements, newSize);
  }

  public void addStudent(E e) {
    if (size == elements.length) {
      sizeCapacity();
    }
    elements[size] = e;
    size++;
  }

  public void add(int index, E e) {
    if (size == elements.length) {
      sizeCapacity();
    }
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    } else {

      for (int i = size - 1; i >= index; i--) {
        elements[i + 1] = elements[i];
      }
      elements[index] = e;
      size++;

    }

  }

  public void addFirst(E e) {
    size++;

    for (int i = 0; i < elements.length - 1; i++) {
      E temp = (E) elements[i];
      elements[i] = e;
      e = temp;

    }
  }

  public void addLast(E e) {
    size++;
    elements[size - 1] = e;
  }

  private void checkIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException
          ("index " + index + " out of bounds");
    }
  }

  public E remove(int index) {
    checkIndex(index);

    E e = (E) elements[index];

    for (int j = index; j < size - 1; j++) {
      elements[j] = elements[j + 1];
    }

    elements[size - 1] = null;

    size--;
    return e;
  }

  public boolean contains(E e) {
    for (int i = 0; i < elements.length; i++) {
      if (e == elements[i]) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(E e) {
    for (int i = 0; i < elements.length; i++) {
      if (e == elements[i]) {
        return i;
      }
    }
    return -1;
  }

  public MyArrayList<E> clone() {
    MyArrayList<E> newList = new MyArrayList<>();
    newList.elements = Arrays.copyOf(this.elements, this.size);
    newList.size = this.size;
    return newList;
  }


  public void clear() {
    elements = (E[]) new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  public int size() {
    return this.size;
  }

  public E get(int i) {
    if (i >= size || i < 0) {
      throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
    }
    return (E) elements[i];
  }

}
