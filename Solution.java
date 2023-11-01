import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> ans = new ArrayList<String>();

    // If there is only one Node in the linked list
    if (head.next == null) {
      ans.add(head.val);
    }

    // Loops while there is another element in the linked list
    while (head.next != null) {
      ans.add(head.val);
      head = head.next;

      // If this is the last element, add the value to the list
      if (head.next == null) {
        ans.add(head.val);
      }

    } // while

    System.out.println(ans);

    // Returnt the list
    return ans;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a);
    Solution.linkedListValues(b);
    Solution.linkedListValues(c);
    Solution.linkedListValues(d);
    // -> [ "a", "b", "c", "d" ]
  }
}
