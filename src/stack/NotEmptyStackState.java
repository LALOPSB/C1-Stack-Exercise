package stack;

public class NotEmptyStackState extends StackState{

	
	public Boolean canHandle(Stack stack) {
		return !stack.isEmpty();
	}

	@Override
	public Object popFor(Stack stack) {
		Object last = stack.getLast();
		stack.removeLast();
		return last;
	}

	@Override
	public Object topFor(Stack stack) {
		return stack.getLast();
	}
	
	public StackState toHandle(Stack stack){
		return super.toHandle(stack);
	}

}
