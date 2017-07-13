/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandpoptest;

/**
 *
 * @author makasssi
 */
public class StackAndPopTest {

    int [] stc = new int[10];
    int tos_index;
    
    public StackAndPopTest(){
    
    // set the top of the stack
    tos_index = -1;// This mean the stack is empty.
    }
    
    // This is how we push items into the stack
    public void push(int item){
    
        if (tos_index == 9) 
            System.out.println("Stack is full");
        else stc[++tos_index]= item;
    }
    
    // this pop an item from the stack.
    public int pop(){
    if (tos_index<0) {
        System.out.println("Stack underFlow");
            return 0;}
    else 
        return stc[tos_index--];
    }
    
    
    public static void main(String[] args) {
        //Let's create 2 instances of the stack
        StackAndPopTest s1 = new StackAndPopTest();
        StackAndPopTest s2 = new StackAndPopTest();
        
        // let's full the stacks diffenerently
        for(int i = 0; i< 10; i++) s1.push(i);
        for(int i = 0; i< 20; i++) s2.push(i);
        
        //Let,s pop this numbers off the stacks
      //  for(int i = 0; i< 10; i++) System.out.println(s1.pop());
        for(int i = 0; i< 10; i++) System.out.println(s2.pop());
        
    }
    
}
