package stack;

import java.util.ArrayList;

public abstract class StackState {

	public StackState toHandle(Stack stack){
		ArrayList<StackState> states = new ArrayList<StackState>(){{
			add(new EmptyStackState());
			add(new NotEmptyStackState());
		}};
		return states.stream().filter(x -> x.canHandle(stack)).findFirst().get();
	}
	
	public abstract Object popFor(Stack stack);
	public abstract Object topFor(Stack stack);
	public abstract Boolean canHandle(Stack stack);

}
