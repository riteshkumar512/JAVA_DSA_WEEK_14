package Lecture_23;

public class Stack {
    private int[]arr;
    private int idx=-1;

    public Stack(){
//        arr=new int[5];
        this(5);

    }

    public Stack(int n){
        arr=new int [n];
    }

    //    TC->O(1)
    public boolean isEmpty(){
        return idx==-1;
    }
    //    TC->O(1)
    public boolean isFull(){
        return size()==arr.length;
    }
    //    TC->O(1)
    public int size(){
        return idx+1;
    }
    //    TC->O(1)
    public void push(int item) throws Exception{
        if (isFull()){
            throw new Exception("Stcak Full hai!");
        }
        arr[++idx]=item;
    }

    //    TC->O(1)
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack Empty Hai!");
        }
        int val=arr[idx--];
        return val;
    }
    //    TC->O(1)
    public int peek(){
        int val=arr[idx];
        return val;
    }
    public void display(){
        for (int i = 0; i <= idx ; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }



}
