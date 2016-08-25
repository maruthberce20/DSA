/**
 * Berce, Ma. Ruth N.
 * ACT 2
 */
package dsa.berce;

public class DSABerce {

    private int capacity; 
    private int[] queue;
    private int nums;
  
  public DSABerce(int size){
    capacity = size;
    queue = new int[capacity];
  }
  
  public void showQueue(){
      int z;
      for(z = 0; z < capacity; z++){
          System.out.printf("Queue[%d] = %d\n" , z , queue[z]);
      }
  }
  
  public boolean isFull(){
      if(nums == capacity){
          System.out.println("QUEUE is FULL");
          return true;
      } else{
      return false;
    }
  }
  
  public boolean isEmpty(){
      if(nums==0){
          System.out.println("QUEUE is EMPTY");
          return true;
      } else{
      return false;
      }
  }
  
  public boolean enqueue(int num){
     System.out.println("Trying to enqueue "+num+"...");
     if(! isFull()){
         queue[nums]=num;
         nums++;
         return true;
     }else{
         System.out.println("Failed to enque "+num);
         return false;
     }
  }
  
  public void dequeue(){
      System.out.print("Dequeueing...");
      if(! isEmpty()){
          int num=queue[0];
          System.out.println("Removed "+num);
          rearrangeQueue();
      }else{
          System.out.println("Failed to dequeue");
      }

  }
  
  private void rearrangeQueue(){
      System.out.println("Rearranging Queue");
      int[] temp = new int[nums];
      int a;
      for(a=0;a<(nums - 1);a++){
          temp[a]=queue[a + 1];
      }
      nums--;
      for(a=0; a< capacity;a++){
          if(a<=nums){
              queue[a]=temp[a];
          }else{
              queue[a]=0;
          }
      }
  }
  
  public int peekFront(){
    return queue[0];
  }
  
  public int peekRear(){
    return queue[nums-1];
  }
} //end class ArrayQueue


   
