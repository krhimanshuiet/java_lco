public class LinkedList
{
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            next=null;
        }
    }
    Node head,ptr;
    void createList(int val)
    {
        Node node=new Node(val);
        if(head==null)
            ptr=head=node;
        else
        {
            ptr.next = node;
            ptr = node;
        }
    }
    void print()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.println(ptr.val);
            ptr=ptr.next;
        }
    }
    void add()
    {
        ptr=head;
        int sum=0;
        while(ptr!=null)
        {
            sum = sum * 10 + ptr.val;
            ptr = ptr.next;
        }
        sum=sum+1;
        //System.out.println(sum);
        ptr=head;
        while(sum>10)
        {
            int d=sum%10;
            ptr.val=d;
            ptr=ptr.next;
            sum=sum/10;
        }
        ptr.val=10;
        int temp;
        temp=head.val;
        head.val=ptr.val;
        ptr.val=temp;
    }
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.createList(9);
        l.createList(9);
        l.createList(9);

        l.add();
        l.print();
    }
}
