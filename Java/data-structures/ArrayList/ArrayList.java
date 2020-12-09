public class ArrayList<T> {
    
    private Object[] array;
    private int capacity;
    private int size;
    private int head;

    public ArrayList()
    {
        size = 0;
        head = 0;
        capacity = 2;
        array = new Object[capacity];
    }

    public void add(T data)
    {
        if (size == capacity)
            grow();
        array[head] = data;
        head++;
        size++;
    }

    public T get(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        @SuppressWarnings("unchecked")
        final T t = (T) array[index];
        return t;
    }

    public T remove(int index)
    {
        if (index < 0 || index >= size)
            return null;
        T t = get(index);
        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i+1];
        }
        head--;
        size--;
        if (size < capacity/2)
            shrink();
        return t;
    }

    public int size()
    {
        return size;
    }

    private void grow()
    {
        Object[] array2 = new Object[capacity*2];
        for (int i = 0; i < capacity; i++)
        {
            array2[i] = array[i];
        }
        array = array2;
        capacity *= 2;
    }

    private void shrink()
    {
        Object[] array2 = new Object[capacity/2];
        for (int i = 0; i < capacity/2; i++)
        {
            array2[i] = array[i];
        }
        array = array2;
        capacity /= 2;
    }

    public void print()
    {
        System.out.print("[");
        for (int i = 0; i < size; i++)
        {
            if (i == size - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
}
