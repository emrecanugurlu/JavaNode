public class NodeList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addNodeNext(T data) {
        size++;
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        }else{
            tail.setNext(new Node<>(data,null,tail));
            tail = tail.getNext();
        }
    }

    public void addNodePrev(T data) {
        size++;
        if (head == null) {
            head = new Node<>(data, null, null);
            tail = head;
        } else {
            Node<T> node = new Node<>(data, head, null);
            this.head.setPrev(node);
            this.head = node;
        }
    }

    public void deleteNextNode(){
        if (head == null) {
            System.out.println("Node is empty");
        }else{
            if (tail.getPrev() != null) {
                tail.getPrev().setNext(null);
            }else {
                tail = null;
            }
        }
    }


    public void writeNode(){
        if (head == null) {
            System.out.println("Node is empty");
        }else{
            if (head.getNext() == null) {
                System.out.println(head.getData());
            }else{
                while (head.getNext() != null) {
                    System.out.println(head.getData());
                    head = head.getNext();
                }
                System.out.println(head.getData());
            }
        }

    }

}
