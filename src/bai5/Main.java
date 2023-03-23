package bai5;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String newSt="";
        System.out.println("nhap vao chuoi ki tu:");
        String st=scanner.nextLine();
        Stack<String> stack=new Stack<>();
        for (int i=0;i<st.length();i++){
            stack.push(st.charAt(i)+"");
        }
        while (!stack.isEmpty()){
           newSt+= stack.pop();
        }
        if (newSt.equalsIgnoreCase(st)){
            System.out.println("chuoi "+st+" la chuoi Pla");
        }else {
            System.out.println("chuoi "+st+" ko la chuoi Pla");
        }
    }
}
