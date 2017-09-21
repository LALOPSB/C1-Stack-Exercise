/*
 * Developed by 10Pines SRL
 * License: 
 * This work is licensed under the 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, 
 * California, 94041, USA.
 *  
 */
package stack;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> content = new ArrayList<Object>();
	private StackState state = new EmptyStackState();
	public static final String STACK_EMPTY_DESCRIPTION = "Stack is Empty";
	
	public Stack(){
	}

	public void push (Object objeto)
	{
		content.add(objeto);
	}
	
	public Object pop()
	{
		return  state.toHandle(this).popFor(this);
	}
	
	public Object top()
	{
		return state.toHandle(this).topFor(this);
	}

	public Boolean isEmpty()
	{
		return content.size()==0;
	}

	public Integer size()
	{
		return content.size();
	}
	
	Object emptyStackException()
	{
		throw new RuntimeException (STACK_EMPTY_DESCRIPTION);
	}

	public Object getLast() {
		return content.get(content.size()-1);
	}

	public void removeLast() {
		content.remove(content.size()-1);
	}
	
}
