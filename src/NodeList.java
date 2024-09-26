public class NodeList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void addNodeNext(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        }else{
            tail.setNext(new Node<>(data,null,tail));
            tail = tail.getNext();
        }
    }

    public void addNodePrev(T data) {
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

    public void deletePrevNode(){
        if (head == null) {
            System.out.println("Node is empty");
        }else{
            if (head.getNext() != null) {
                head.getNext().setPrev(null);
                head = head.getNext();
            }else{
                head = null;
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
