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
    // display all value

    public void display(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    //display specific index value
    public void printspecificvalue(int index){
        node current=head;
        int count=0;
        if(index<0){
            System.out.println("Invalid index");
            return;
        }
        while(current!=null){
            if(count==index){
                System.out.println("Node at postion "+ index+" is "+current.data);
                return;
            }
            current=current.next;
            count++;
        }
        System.out.println("index out of range");
    }

    public void delete(int value){
        //if list empty
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        //if value is in head
        if(head.data==value){

            head=head.next;
            System.out.println("deleted head value "+value);
            return;
        }
        node current=head;
        while(current.next!=null && current.next.data!=value){
            current=current.next;

        }
        if(current.next==null){
            System.out.println("value not found");
        }
        else{
            current.next=current.next.next;
            System.out.println("deleted value "+value);
        }
    }

}
