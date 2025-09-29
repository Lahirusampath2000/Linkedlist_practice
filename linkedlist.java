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
        while (current.next != null) {
            current=current.next;

        }
        current.next=newNode;


    }

    public void display(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

}
