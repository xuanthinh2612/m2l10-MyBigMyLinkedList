public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("hocsinh1");
        myLinkedList.addLast("hocsinh2");
        myLinkedList.addLast("hocsinh3");
        myLinkedList.addFirst("hocsinh0");
        myLinkedList.add(3,"hocsinh2.2");
        myLinkedList.showAll();
        myLinkedList.remove("hocsinh0");
        myLinkedList.remove(0);
        System.out.println(myLinkedList.contains("hocsinh2.2"));
        System.out.println(myLinkedList.indexOf("hocsinh0"));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

        System.out.println("size: " +myLinkedList.size());
        myLinkedList.showAll();
    }
}
