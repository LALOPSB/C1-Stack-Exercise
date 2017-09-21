package stack;

public class EmptyStackState extends StackState{

	@Override
	public Boolean canHandle(Stack stack) {
		return stack.isEmpty();
	}

	@Override
	public Object popFor(Stack stack) {
		 return stack.emptyStackException();
	}

	@Override
	public Object topFor(Stack stack) {
		return stack.emptyStackException();
	}
	
	public StackState toHandle(Stack stack){
		return super.toHandle(stack);
	}

}
