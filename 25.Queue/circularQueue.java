public class circularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;//change for circular queue
    Queue(int n){
        arr = new int [n];
        size = n;
        rear = -1;
        front = -1;//change for circular queue
    }
    public static boolean isEmpty(){
        return rear == -1
         && front == -1;//change for circular queue
    }

    public static boolean isFull(){//change for circular queue
        return (rear + 1) % size == front;
    }
    //add
    public static void add(int add){
        if(isFull()){//change for circular queue
            System.out.println("Queue is full");
            return;
        }
        //add first element
        if(front == -1){//change for circular queue
            front = 0;
        }
        rear = rear + 1;
        arr[rear] = add;
    }

    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];//change for circular queue
        //delete last element
        if(rear == front){//change for circular queue
            rear = front = -1;
        } else {
            front = (front + 1) % size;//change for circular queue
        }
        
        return result; 

    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];//change for circular queue
    }
}
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}



    

