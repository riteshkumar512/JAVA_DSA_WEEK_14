package Lecture_23;

public class Queue {
    private int[] arr;
    private int front=0;
    private int size=0;

    public Queue() {
        this(5);
    }
    public Queue(int n) {
        arr=new int[n];
    }
    //    TC->O(1)
    public boolean isEmpty(){
        return size==0;
    }
    //    TC->O(1)
    public boolean isFull(){
        return size==arr.length;
    }
    //    TC->O(1)
    public int size(){
        return size;
    }
    //    TC->O(1)
    public void enqueue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue full Hai!");
        }
//            int idx = front + size;
        int idx = (front + size)%arr.length; //for circular Queue
            arr[idx] = item;
            size++;
        }
    //    TC->O(1)
    public int dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue Full Hai!");
        }
        int val=arr[front];
//        front++;
        front=(front+1)&arr.length; //for circular Queue
        size--;
        return val;
    }
    public int getFront()throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int val=arr[front];
        return val;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }

}
