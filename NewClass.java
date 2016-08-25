/**
 * Berce, Ma. Ruth N.
 * ACT 2
 */
package dsa.berce;

public class NewClass {
    public static void main(String[] args){
    DSABerce queue = new DSABerce(10);
    
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.enqueue(7);
    queue.enqueue(8);
    queue.enqueue(9);
    queue.enqueue(10);
    
    queue.showQueue();
    System.out.println();
    System.out.println("PeekRear: "+queue.peekRear());
    System.out.println("PeekFront: "+queue.peekFront());
    System.out.println();
    queue.enqueue(11);
    System.out.println();
    queue.dequeue();
    System.out.println();
    queue.showQueue();
    queue.enqueue(15);
    System.out.println();
    queue.showQueue();
    
}
}
