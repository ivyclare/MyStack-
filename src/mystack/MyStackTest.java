/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author Ivoline-Clarisse
 */
public class MyStackTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        MyStack stack = new MyStack(6);
                        
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        
        stack.top();
        System.out.println("The element at the index of the array is "+stack.top());
        if(stack.isFull()){
            System.out.println("The stack is full");
        }       
                
        while(!stack.isEmpty()){
            int value = stack.pop();
            System.out.println(value);
        }
        
        System.out.println("Removing all elements from the stack");
        stack.push(2);
        stack.empty();
        if(stack.isEmpty()){
            System.out.println("The stack has been emptied");
        }
        
    }
}
