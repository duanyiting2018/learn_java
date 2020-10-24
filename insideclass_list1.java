package duanyiting;

class Node1<E>
{
    private E data;
    private Node1<E> next;

    public E getData() {
        return data;
    }

    public Node1<E> getNext() {
        return next;
    }

    public void setNext(Node1<E> next) {
        this.next = next;
    }
    public Node1(E data)
    {
        this.data=data;
    }
}
public class insideclass_list1 {
    public static void main(String[] args) {
        Node1<String> n1=new Node1<String>("火车头");
        Node1<String> n2=new Node1<String>("车厢一");
        Node1<String> n3=new Node1<String>("车厢二");
        Node1<String> n4=new Node1<String>("车厢三");
        Node1<String> n5=new Node1<String>("车厢四");
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        printNode(n1);
    }
    public static void printNode(Node1<?> node)
    {
        if (node!=null)
        {
            System.out.println(node.getData()+" ");
            printNode(node.getNext());
        }
    }
}
