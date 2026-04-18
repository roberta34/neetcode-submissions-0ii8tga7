
class DynamicArray {
private:
    int* darray;
    int size;
    int capacity;
public:
    
    DynamicArray(int capacity) {
        this->capacity = capacity;
        this->size = 0;
        this->darray = new int[capacity];
    }

    int get(int i) {
        return darray[i];
    }

    void set(int i, int n) {
        darray[i] = n;
    }

    void pushback(int n) {
        if(size == capacity)
        {
            resize();
        }
        darray[size++] = n;
    }

    int popback() {
        if(size == 0)
            return -1;
        return darray[--size];
    }

    void resize() {
        capacity = capacity*2;
        int *newArr = new int[capacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = darray[i];
        }
        delete[] darray;
        darray = newArr;
    }

    int getSize() {
        return size;
    }

    int getCapacity() {
        return capacity;
    }
};
