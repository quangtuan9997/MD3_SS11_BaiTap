package bai3;

public class Queue {
   public Node front;
   public   Node rear;
    public static class Node{
      public    int data;
       public Node link;
        public Node(int data) {
            this.data = data;
            this.link=null;
        }

    }

    public Queue() {
    }

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
