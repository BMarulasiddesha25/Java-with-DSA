import java.util.Scanner;

class test5 {
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        SLL ob=new SLL();
        ob.insert(10);
        ob.insert(20);
        ob.insert(30);
        ob.insert(40);
        ob.dis();
        System.out.println("enter the deletion value");
        int f=ch.nextInt();
        ob.deletion(f);

    }
}
class SLL
{
    Node5 head;
    Node5 tail;
    SLL()
    {
        head=null;
        tail=null;
    }
    public void insert(int data)
    {
        Node5 hello=new Node5(data);
        if (head==null)
        {
            head=hello;
            tail=hello;
        }
        else
        {
            tail.next=hello;
            tail=hello;
        }

    }
    public void dis()
    {
        Node5 n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    public void deletion(int val)
    {
        if(val==head.data)
        {
            head=head.next;
        }
        else {
            Node5 n=head;
            while (n.next!=null&&n.next.data!=val)
            {
                n=n.next;
            }
            n.next=n.next.next;

        }
        System.out.println();
        dis();

    }
}
class Node5
{
    int data;
    Node5 next;
    Node5(int data)
    {
        this.data=data;
    }
}