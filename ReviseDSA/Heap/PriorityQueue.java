class PriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity + 1]; // Index 0 is not used for simplicity
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Priority Queue is full. Cannot enqueue element.");
            return;
        }

        size++;
        int index = size;
        heap[index] = value;

        while (index > 1 && heap[index] < heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Priority Queue is empty. Cannot dequeue element.");
            return -1;
        }

        int min = heap[1];
        heap[1] = heap[size];
        size--;
        heapify(1);

        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);

        if (leftChild <= size && heap[leftChild] < heap[smallest])
            smallest = leftChild;

        if (rightChild <= size && heap[rightChild] < heap[smallest])
            smallest = rightChild;

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return index * 2;
    }

    private int rightChild(int index) {
        return index * 2 + 1;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}

class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.enqueue(5);
        pq.enqueue(8);
        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(10);

        System.out.println("Priority Queue:");
        while (!pq.isEmpty()) {
            int min = pq.dequeue();
            System.out.println(min);
        }
    }
}
