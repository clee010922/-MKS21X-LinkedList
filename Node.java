public class Node {

  Node next, prev;
  Integer data;

  public Node(Node nextNode, Node prevNode, Integer dataInteger) {
    next = nextNode;
    prev = prevNode;
    data = dataInteger;
  }

  public Node() {
    data = null;
  }

  public Node next() {
    return next;
  }

  public Node prev() {
    return prev;
  }

  public void setNext(Node other) {
    next = other;
  }

  public void setPrev(Node other) {
    prev = other;
  }

  public String toString() {
    return "" + data;
  }


}
