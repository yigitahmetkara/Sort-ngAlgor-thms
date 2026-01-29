
public class Stack {

	static final int MAX = 1000;
	static int top;
	static int a[] = new int[MAX];

	boolean isEmpty() {
		return top < 0;
	}

	void stack() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= MAX - 1) {
			System.out.println(" Stack overflow ");
			return false;
		} else {
			a[top++] = x;
			System.out.println(" Stack pushed into stack ");
			return true;
		}

	}

	int pop() {
		if (top < 0) {
			System.out.println(" Stack underflow ");
			return 0;
		} else {
			int x = a[top--];
			return x;

		}
	}

	int peek() {
		if (top < 0) {
			System.out.println(" Stack underflow ");
			return 0;
		} else {

			int x = a[top];

			return x;
		}

	}

	static void print() {
		for (int i = top; i > -1; i--) {
			System.out.println(" " + a[i]);
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Popped from stack: " + s.pop());

		System.out.println(" Top element is : " + s.peek());
		System.out.println(" Elements present in stack: ");
		s.print();
	}

}
