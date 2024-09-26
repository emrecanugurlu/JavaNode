public class Main {
    public static void main(String[] args) {

     NodeList<Integer> list = new NodeList<>();
//
//     list.addNodeNext(1);
     list.addNodeNext(2);
     list.addNodeNext(3);
     list.addNodeNext(4);
     list.addNodePrev(5);
     list.addNodePrev(5);
     list.deleteNextNode();
     list.writeNode();

    }
}