public class heapify {
    private int[] heap;
    private int size;
    private int capacity;

    public heapify(int capacity) {
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

    public void minHeapify(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild] < heap[smallest])
            smallest = leftChild;

        if (rightChild < size && heap[rightChild] < heap[smallest])
            smallest = rightChild;

        if (smallest != index) {
            swap(index, smallest);
            minHeapify(smallest);
        }
    }

    public void maxHeapify(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild] > heap[largest])
            largest = leftChild;

        if (rightChild < size && heap[rightChild] > heap[largest])
            largest = rightChild;

        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract minimum element.");
            return -1;
        }

        int minElement = heap[0];
        heap[0] = heap[size - 1];
        size--;
        minHeapify(0);

        return minElement;
    }

    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract maximum element.");
            return -1;
        }

        int maxElement = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeapify(0);

        return maxElement;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        if (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}

class BinaryHeapDemo {
    public static void main(String[] args) {
        heapify minHeap = new heapify(10);
        heapify maxHeap = new heapify(10);

        // Insertion in min-heap
        minHeap.insert(4);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(3);

        System.out.println("Min-Heap:");
        minHeap.printHeap();

        // Min-heapify
        minHeap.minHeapify(0);
        System.out.println("After Min-Heapify:");
        minHeap.printHeap();

        // Extract min element
        int minElement = minHeap.extractMin();
        System.out.println("Extracted Min Element: " + minElement);
        System.out.println("Heap after extracting Min Element:");
        minHeap.printHeap();

        System.out.println();

        // Insertion in max-heap
        maxHeap.insert(7);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(9);
        maxHeap.insert(10);

        System.out.println("Max-Heap:");
        maxHeap.printHeap();

        // Max-heapify
        maxHeap.maxHeapify(0);
        System.out.println("After Max-Heapify:");
        maxHeap.printHeap();

        // Extract max element
        int maxElement = maxHeap.extractMax();
        System.out.println("Extracted Max Element: " + maxElement);
        System.out.println("Heap after extracting Max Element:");
        maxHeap.printHeap();
    }
}
