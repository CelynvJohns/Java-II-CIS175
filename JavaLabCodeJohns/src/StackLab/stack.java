/**
 *  Name : JavaLabCodeJohns
 *  Created: 09/11/2023
 *  Course: CIS 152 - Data Structure
 *  Version: 1.0
 *  OS: Windows 11
 *  IDE: eclipse
 *  Copyright : This is my own original work
 *  based on specifications issued by our instructor
 *  Description : A java lab that shows off unit tests and excptions.
 *  			Input: N/A
 *  			Output: all tests passed?
 *  Academic Honesty: I attest that this is my original work.
 *  I have not used unauthorized source code, either modified or
 *  unmodified. I have not given other fellow student(s) access
 *  to my program.
 *  
 */

package StackLab;

public class stack {
	// Members
	private int top;  
	private int maxSize; 
	private String stackItems[]; 
	
	public stack() {
		this.maxSize = 5; 
		this.top = -1; 
		this.stackItems = new String[maxSize];
	}
	
	/**
	 * @param maxSize - sets maximum size of the stack 
	 */
	public stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1; 
		this.stackItems = new String[maxSize];
	}
	
	/**
	 * @return
	 */
	public boolean isFull() {
		return top == maxSize -1;
	}
	
	/**
	 * @return
	 */
	public boolean isEmpty() {
		// TODO 
		return top == -1;  // Possibly you will remove this line, this is for running Unit Tests before writing code

	}
   
   /**
	 * @return
	 */
	public int size() {	 
		return top+1;  // Possibly you will remove this line, this is for running Unit Tests before writing code

	}
	
	/**
	 * @return
	 * @throws StackEmptyException 
	 */
	public String peek() throws StackEmptyException{
		if (! this.isEmpty()) 
			return stackItems[top];
		throw new StackEmptyException(); 
	}
	
	/**
	 * 
	 * @param item
	 * @throws StackFullException
	 */
	public void push(String item) throws StackFullException {
	    if (!isFull()) {
	        top++;
	        stackItems[top] = item;
	    } else {
	        throw new StackFullException();
	    }
	}

	
	/**
	 * @return
	 * @throws StackFullException 
	 */
	public String pop() throws StackEmptyException {
	    if (isEmpty()) {
	        throw new StackEmptyException();
	    }
	    String item = stackItems[top];
	    top--;
	    return item;
	}
	
	
	/**
	 * 
	 * @return
	 * @throws StackEmptyException
	 */
	public String printStackUp() throws StackEmptyException {
	    if (isEmpty()) {
	        throw new StackEmptyException();
	    }

	    StringBuilder stackString = new StringBuilder();
	    for (int i = 0; i <= top; i++) {
	        stackString.append(stackItems[i]);
	        stackString.append("\n"); // Add "\n" after each item
	    }
	    return stackString.toString();
	}








}
