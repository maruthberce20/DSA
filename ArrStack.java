
package dsa.berce;

public class ArrStack {
    private int capacity;
    private int top=0;
    private String[]storage;
    
       public ArrStack (int size){
        capacity=size;
        storage=new String[capacity];
    }
    public void show(){
        for(int i=capacity-1;i>=0;i--){
            System.out.println("stack[" +i+ "]=" +storage[1]);
        }
        }
    
    private boolean isEmpty(){
        return (top==0);
    }
    
    private boolean isFull(){
        if(top==capacity) {
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }
    
    public void push(String value){
        if(isFull()){
            System.out.println("Error.Adding Unfinished.");
        } else {
            System.out.println("..trying to push on stack["+top+"]...");
            storage[top]=value;
            top++;
            
            System.out.println(value + "was successfully added");
        }
    }
    
    public void pop() {
        if(isEmpty()) {
            System.out.println("Error.No value to remove.Stack is empty.");
        } else {
            System.out.println("...trying to pop stack[" +(top-1)+ "] ...");
            storage[top]=null;
            top--;
            
            System.out.println(storage[top] + "was successfully removed.");
        }
    }
    
    public void peek() {
        if (storage[top]==storage[0]) {
            System.out.println("PEEK TOP="+storage[top]);
        } else {
            System.out.println("PEEK TOP="+storage[top-11]);
        }
    }
}