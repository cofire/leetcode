package com.cofire.linkList;

/**
 * @Description
 * @ClassName ListNode
 * @Author Ly
 * @date 2020.08.10 21:18
 */
public class ListNode<T> {
    T value;
    ListNode next;

    ListNode() {

    }

    ListNode(T value) {
        this.value = value;
    }

    ListNode(T value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static <T> ListNode init(T[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        ListNode<T> next = new ListNode<>(null);
        ListNode<T> header = next;
        for (int i = 0; i < list.length; i++) {
            ListNode<T> node = new ListNode<>(list[i]);
            next.next = node;
            next = node;
        }
        return header.next;
    }

    public void print() {
        System.out.println("-----------begin-----------");
        System.out.printf(value == null ? "[null]" : value.toString());
        ListNode next = this.next;
        while (next != null) {
            System.out.printf("->");
            System.out.printf(next.value == null ? "[null]" : next.value.toString());
            next = next.next;
        }
        System.out.println("\n-----------end-------------");
    }
}
