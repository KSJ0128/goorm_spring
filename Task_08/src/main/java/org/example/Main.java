package org.example;

import org.example.LinkedList.*;
import org.example.Queue.*;
import org.example.Stack.Stack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("LinkedList 테스트\n");
        LinkedList<Integer> list = new LinkedList<Integer>();
        int idx = 0;

        System.out.println("*데이터 추가*");

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Iterator iter = list.iterator(); iter.hasNext(); ++idx) {
            Object var4 = iter.next();
            System.out.println(idx + " 번째 데이터 : " + var4);
        }

        System.out.println("\n*데이터 리턴*");
        System.out.println("2 번째 데이터 : " + list.get(2));
        System.out.println("\n*데이터 삭제 후*");
        list.delete(2);
        System.out.println("2 번째 데이터 : " + list.get(2));

        System.out.println("\nQueue 테스트");
        Queue<Integer> queue = new Queue<Integer>();
        System.out.println("*데이터 추가 전*");
        System.out.println("Queue Empty : " + queue.empty());

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("\n*데이터 추가 후*");
        System.out.println("맨 앞 데이터 : " + queue.front());

        System.out.println("\n*데이터 삭제 중*");
        while(!queue.empty()) {
            System.out.println("삭제 데이터 : " + queue.front());
            queue.pop();
        }

        System.out.println("\n*데이터 삭제 후*");
        System.out.println("Queue Empty : " + queue.empty());

        System.out.println("\n*비어있는 큐 삭제시*");
        queue.pop();

        System.out.println("\nStack 테스트");
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("*데이터 추가 전*");
        System.out.println("Stack Empty : " + stack.empty());

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println("\n*데이터 추가 후*");
        System.out.println("맨 앞 데이터 : " + stack.top());

        System.out.println("\n*데이터 삭제 중*");
        while(!stack.empty()) {
            System.out.println("삭제 데이터 : " + stack.top());
            stack.pop();
        }

        System.out.println("\n*데이터 삭제 후*");
        System.out.println("Stack Empty : " + stack.empty());

        System.out.println("\n*비어있는 스택 삭제시*");
        stack.pop();
    }
}