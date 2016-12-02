package mystack;

/**
 *
 * @author Ivoline-Clarisse
 */
public class MyStack {
    private int MAX;
    protected int[] stackArray;
    protected int index;
    
    //Constructor that will be used to create an object of the class i.e a new stack
    public MyStack(int size){    
        this.MAX = size;
        this.stackArray = new int[MAX];
        this.index = -1;
    }
    
    //Method to return an empty stack
    public static MyStack create(int size){
        MyStack stack = new MyStack(size);
        stack.MAX = size;
        stack.index = -1;
        stack.stackArray =  new int[stack.MAX];
        return stack;
    }
    
    //Method to add element at the index of a stack
    public void push(int elem ){
        if(!isFull())
            this.stackArray[++index] = elem;
        else
            throw new IllegalArgumentException("Stack is full, cannot push");   
    }
    
    //Method to remove the element at the index 
    public int pop (){
       if(!isEmpty())
            return this.stackArray[index--];
       else
           throw new IllegalArgumentException("Stack is empty, cannot pop");
    }
    
    //Method to return the element at the index of the stack
    public int top(){
        if(!isEmpty()){
            System.out.println("Top is "+stackArray[MAX - 1]);
            return this.stackArray[index];
        }
        else
             throw new IllegalArgumentException("Stack is empty, cannot get top element");
    }    
    
    //Method to remove all elements from the stack
    public void empty(){
        if(!isEmpty())
            this.index = -1;
            //stackArray = null;
         else
             throw new IllegalArgumentException("Stack is empty, cannot empty an empty stack");
    }
    
    //Method to check if stack is empty
    public boolean isEmpty(){
        if(index == -1)
            return true;
        else
            return false;
    }
    
     //Method to check if stack is empty
    public boolean isFull(){
         if(index == MAX-1)
            return true;
        else
            return false;
    }  
    
    //Method to update
    public int[] update(){
        return stackArray;
    }
    
}
