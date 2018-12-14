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
    Node newEnd = new Node(null, currentEnd, value);
    currentEnd.setNext(newEnd);
    length++;
    return true;
  }

  public int size() {
    return length;
  }

  public String toString() {
    String result = "[ ";
    for (int i = 0; i < length; i++) {
      if (!i = length - 1) {
        result += 
      }
    }

  }

  private Node getNthNode() {

  }

  public Integer get(int index) {

  }

  public Integer set(int index, Integer value) {

  }

  public boolean contains(Integer value) {

  }

  public int indexOf(Integer value) {

  }

  public void add(int index, Integer value) {

  }

  public Integer remove(int index) {

  }

  public boolean remove(Integer value) {

  }


}
