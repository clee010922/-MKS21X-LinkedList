public class MyLinkedList{

  Node start;
  Node end;
  int length;

  public MyLinkedList(){
    start = new Node();
    end = new Node();
    length = 0;
  }

  public boolean add(Integer value) {
    Node currentEnd = end;
    Node newEnd = new Node(value, null, currentEnd);
    currentEnd.setNext(newEnd);
    length++;
    return true;
  }

  public int size() {
    return length;
  }

  public String toString() {
    String result = "{";
    Node i = start;
    while(i != end) {
      result += i.getData() + ", ";
      i = i.next();
    }
    result += i.getData() + "}";
    return result;
  }

  private Node getNthNode(int index) {
    Node result = start;
    for (int i = 0; i < index; i++) {
      result = result.next();
    }
    return result;
  }

  public Integer get(int index) {
    if (index < 0 || index >= length)
      throw new IndexOutOfBoundsException();
    return getNthNode(index).getData();
  }

  public Integer set(int index, Integer value) {
    if (index < 0 || index >= length)
      throw new IndexOutOfBoundsException();
    Node temp = getNthNode(index);
    Integer oldData = temp.getData();
    temp.setData(value);
    return oldData;
  }

  public boolean contains(Integer value) {
    boolean temp = false;
    Node current = start;
    for (int i = 0; i < length; i++) {
      if (current.getData() == value)
        temp = true;
      current = current.next();
    }
    return temp;
  }

  public int indexOf(Integer value) {
    int temp = -1;
    Node current = start;
    for (int i = 0; i < length; i++) {
      if (current.getData() == value)
        temp = i;
      current = current.next();
    }
    return temp;
  }

  public void add(int index, Integer value) {
    if (index < 0 || index >= length)
      throw new IndexOutOfBoundsException();
    Node n = new Node(value, null, null);
    if (index == 0) {
      n.setPrev(start);
      n.setNext(end);
      start.setNext(n);
      end.setPrev(n);
      length++;
    }
    else {
      Node next = getNthNode(index);
      Node prev = getNthNode(index - 1);
      n.setPrev(prev);
      n.setNext(next);
      prev.setNext(n);
      next.setPrev(n);
      length++;
    }
  }

  public Integer remove(int index) {
    if (index < 0 || index >= length)
      throw new IndexOutOfBoundsException();
    Node n = getNthNode(index);
    Node prev, next;
    Integer oldData = n.getData();
    if (index == 0) {
      next = n.next();
      next.setPrev(null);
      start = next;
      length--;
    }
    if (index == length-1) {
      prev = n.prev();
      prev.setNext(null);
      end = prev;
      length--;
    }
    else {
      prev = getNthNode(index-1);
      next = getNthNode(index+1);
      prev.setNext(next);
      next.setPrev(prev);
      length--;
    }
    return oldData;
  }

  public boolean remove(Integer value) {
    if (contains(value)) {
      remove(indexOf(value));
      return true;
    }
    return false;
  }

}
