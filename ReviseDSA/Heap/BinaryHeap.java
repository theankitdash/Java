public class BinaryHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public BinaryHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert element.");
            return;
        }

        heap[size] = value;
        size++;

        if (size > 1)
            heapifyUp(size - 1);
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        if (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}

class BinaryHeapDemo {
    public static void main(String[] args) {
        BinaryHeap minHeap = new BinaryHeap(10);
        BinaryHeap maxHeap = new BinaryHeap(10);

        // Insertion in min-heap
        minHeap.insert(4);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(3);

        System.out.println("Min-Heap:");
        minHeap.printHeap();

        // Insertion in max-heap
        maxHeap.insert(7);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(9);
        maxHeap.insert(10);

        System.out.println("Max-Heap:");
        maxHeap.printHeap();
    }
}
