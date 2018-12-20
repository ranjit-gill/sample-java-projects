
public class StackUsingGenerics_C3<T extends Object> {
	 private int stackSize;
	    private T[] stackArr;
	    private int top;
	     
	    
	      //constructor to create stack with size
	   
	    @SuppressWarnings("unchecked")
	    public StackUsingGenerics_C3(int size) {
	        this.stackSize = size;
	        this.stackArr = (T[]) new Object[stackSize];
	        this.top = -1;
	    }
	 
	 
	     // This method adds new entry to the top of the stack
	      	    
	    
	    public void push(T entry){
	        if(this.isStackFull()){
	            System.out.println(("Stack is full. Increasing the capacity."));
	            this.increaseStackCapacity();
	        }
	        System.out.println("Adding: "+entry);
	        this.stackArr[++top] = entry;
	    }
	 
	    
	      //This method removes an entry from the top of the stack.
	   
	     
	    public T pop() throws Exception {
	        if(this.isStackEmpty()){
	            throw new Exception("Stack is empty. Can not remove element.");
	        }
	        T entry = this.stackArr[top--];
	        System.out.println("Removed entry: "+entry);
	        return entry;
	    }
	     
	   
	     // This method returns top of the stack  without removing it.
	     
	     
	    public T peek() {
	        return stackArr[top];
	    }
	 
	    private void increaseStackCapacity(){
	         
	        @SuppressWarnings("unchecked")
	        T[] newStack = (T[]) new Object[this.stackSize*2];
	        for(int i=0;i<stackSize;i++){
	            newStack[i] = this.stackArr[i];
	        }
	        this.stackArr = newStack;
	        this.stackSize = this.stackSize*2;
	    }
	     
	   
	     // This method returns true if the stack is empty
	     
	     
	    public boolean isStackEmpty() {
	        return (top == -1);
	    }
	 
	   
	     // This method returns true if the stack is full
	    
	    public boolean isStackFull() {
	        return (top == stackSize - 1);
	    }
	     
	    public static void main(String a[]){
	    	StackUsingGenerics_C3<String> stringStack = new StackUsingGenerics_C3<String>(2);
	        stringStack.push("self learning");
	        StackUsingGenerics_C3<Integer> integerStack = new StackUsingGenerics_C3<Integer>(2);
	        integerStack.push(10);
	    }
}
