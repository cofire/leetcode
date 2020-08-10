package com.cofire.linkList;

/**
 * @Description
 * @ClassName linkList
 * @Author Ly
 * @date 2020.08.10 21:17
 */
public class LinkListInit {
    public static void main(String[] args) {
        Integer[] list = {1, 3, 5, 7, 9};
        ListNode<Integer> header = ListNode.init(list);
        header.print();
        String[] sList = {"a", "b", "c"};
        ListNode<String> header2 = ListNode.init(sList);
        header2.print();
        Student[] list2 = {new Student("q", "1"), new Student("w", "2"),};
        ListNode<String> header3 = ListNode.init(list2);
        header3.print();
    }
}
