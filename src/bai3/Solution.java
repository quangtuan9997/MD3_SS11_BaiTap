package bai3;

public class Solution extends Queue {
    public void enQueue(int data){
        Node node= new Node(data);
        if(front==null&& rear==null){
            front=node;
            rear=node;
        }else {
            rear.link=node;
            rear=node;
        }
    }
    public void dequeue(){
        int data= front.data;
        if (front==rear){
            front=rear=null;
        }
        front=front.link;
    }
    public void displayQueue(){
        Node node=front;
        while (node!=null){
            System.out.println(node.data+"");
            node=node.link;
        }
    }
    public boolean isFull(){
        return true;
    }
    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    @Override
    public String toString() {
        return "Solution{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
