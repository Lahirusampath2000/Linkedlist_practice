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

}
