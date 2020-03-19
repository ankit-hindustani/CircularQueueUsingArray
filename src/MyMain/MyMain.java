package MyMain;
import queue.*;
/* @author Ankit Singh
GLA university mathura (u.p)
 */

public class MyMain {
    public static void main(String[] args) {
        CircularQueueUsingArray obj=new CircularQueueUsingArray(5);
       obj.enqueue(3);
        obj.enqueue(4);
       obj.enqueue(2);
        obj.enqueue(31);
       obj.enqueue(43);
       obj.enqueue(23);
     obj.enqueue(9);
  obj.enqueue(54);
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        obj.enqueue(11);
        obj.enqueue(44);
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

    }
}
