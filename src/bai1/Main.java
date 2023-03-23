package bai1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        stack.push(4);
        stack.push(7);
        stack.push(3);
        stack.push(7);
        stack.push(7);
        stack.push(9);
        System.out.println("mang truoc khi dao nguoc:"+stack);
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        String newStr="";
        System.out.println("mang sau khi dao nguoc:"+newStack);
        Stack<String> wStack = new Stack<>();
       Scanner  scanner=new Scanner(System.in);
        System.out.println("nhap vao chuoi ki tu");
       String str=scanner.nextLine();
        System.out.print("chuoi truoc khi nhap:"+str+"\n");
       for (int i=0; i <str.length();i++){
           wStack.push(str.charAt(i)+"");
       }
       while (!wStack.isEmpty()){
           newStr+=wStack.pop();
       }
        System.out.print("choi sau khi dao nguoc:"+newStr);
    }
}

