import java.util.*;
public class Main {
    public static void main(String[] args) {
        //create stack
        Stack<String> stackOfCards = new Stack<>();
        
        //push item in stack
        stackOfCards.push("jay");
        stackOfCards.push("veeru");
        stackOfCards.push("luv");
        stackOfCards.push("kush");
        
        //print Satck
        System.out.println("Stack =>" +stackOfCards);
        System.out.println();
        
        //pop out stack
        String topCard=stackOfCards.pop(); // remove top card. if empty - throw emptyexception Logger.error
        System.out.println("Stack.pop() =>" +topCard);
        System.out.println("Stack =>" +stackOfCards);
        System.out.println();
        
        //peek first stackOfCards
        String cardAtTop=stackOfCards.peek();
        System.out.println("stack.peek() =>" +cardAtTop);
        System.out.println("Current Stack => " +stackOfCards);
        
        //check stack is empty
        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());
        System.out.println();
        
        // Find the size of Stack
        System.out.println("Size of Stack : " + stackOfCards.size());
        System.out.println();
        
        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
        int position = stackOfCards.search("veeru");
        if(position != -1) {
            System.out.println("Found the element \"veeru\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }
    }
  }