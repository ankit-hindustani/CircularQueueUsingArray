package queue;

public class CircularQueueUsingArray {
    private int queueSize;
    private int[] queue;
    int front;
    int rear;
    int size;
    int max;
    public CircularQueueUsingArray(int queueSize){
        queue=new int[queueSize];
        this.max=queueSize;
        front=-1;
        rear=-1;
        size=0;
    }

    public void enqueue(int element){
        if((rear+1)%max==front){   //checking queue is full or not
            System.out.println("queue is full/overflow");
        return;
        //if this condition is matched don't check another conditon, therefore return apply.
        }
        else if(front==-1 && rear==-1) { //checking queue is empty or not
            rear=0;
            front=0;

        }
        else if(rear==max-1 && front!= 0){ //checking for one element in queue @last index
            rear=0;
        }
        else{
            rear=(rear+1)%max;  //finding next position for insert a value
        }
        queue[rear]=element;
        size++;

    }



    public int dequeue(){
        int response=0;
        if(isEmpty()){
            System.out.println("queue is empty/underflow");
        }
        //if only one element present at the first index.
        else if(rear==front){
            response=queue[front];
            rear=front=-1;
        }
        //if front pointer at end of queue or @last index.
        else if(front==max-1){
            response=queue[front];
            front=0;
        }
        //if front pointer at anywhere except first & last index.
        else{
            response=queue[front];
            front++;
        }
        return response;
    }



    public int peek(){
        int response=0;
        if(isEmpty()){
            System.out.print("queue is empty ");
        }
        else{
            response=queue[front];
        }
        return response;
    }



    public boolean isEmpty(){
        boolean response=false;
        if(front==-1 && rear==-1){
            response=true;
        }
        return response;
    }
}
