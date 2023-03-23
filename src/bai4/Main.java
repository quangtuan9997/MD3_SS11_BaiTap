package bai4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        String nhiPhan="";
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap sao so: ");
        int n=scanner.nextInt();
        while (n!=0){
            if (n%2==0){
                stack.push(0);
                n=n/2;

            }else {
            stack.push(1);
            n=n/2;}

        }
        while (!stack.isEmpty()){
            nhiPhan+=stack.pop();
        }
        System.out.println(nhiPhan);
    }
}
