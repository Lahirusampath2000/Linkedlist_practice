public class linkedlist {

    node head;

    public linkedlist(){
        head = null;
    }

    public void insert(int data){
        node newNode=new node(data);

        if(head==null){
            head=newNode;
            return;
        }

        node current=head;
        while (head.next != null) {
            current=current.next;

        }
        current.next=newNode;


    }
}
