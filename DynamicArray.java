public class DynamicArray<T>  {
    int Capacity;
    T[] myArray;
    int size;



    public DynamicArray() {
        int Capacity =2;
        myArray = (T[] )new Object[Capacity];
        int size= 0;


    }
    public T remove() {
        if (size == 0) {
            return null;
        }

        T last = (T) myArray[size - 1];
        myArray[size - 1] = null;
        size--;

        return last;
    }

    public void add(T item) {
        if (size == myArray.length) {
            Capacity = myArray.length * 2;
            T[] newArray =(T[]) new Object[Capacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = myArray[i];
            }

            myArray = newArray;
        }

        myArray[size] = item;
        size++;
    }}
