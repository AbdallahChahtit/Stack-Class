import java.util.Scanner;

public class TestStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }
        
        System.out.println(stack);
        System.out.println("peek: " + stack.peek());
        System.out.println(stack.getSize() + " strings are: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        stack.push("ABC1");
        stack.push("ABC2");
        stack.push("ABC3");
        System.out.println(stack);
        System.out.println("peek: " + stack.peek());
        System.out.println(stack.getSize() + " strings are: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}

// MyStack.java: Implementing a stack using inheritance
class MyStack extends java.util.ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }
// methods

  private String name;
  
   public Object pop() {
          if (isEmpty()) {
              return null;
          }
          return remove(size() - 1);
      }
      
      public String getName() {
          return name;
      }
      
      public void setName(String name) {
          this.name = name;
      }
      
      public Object peek() {
          if (isEmpty()) {
              return null;
          }
          return get(size() - 1);
      }
      
      public Object push(Object x) {
          add(x);
          return x;
      }

    @Override
    public String toString() {
        return "MyStack{}";
    }
}


