package com.perkinl.stack;

/**
 *
 * 栈是一种线性数据结构，是数组的子集（后进先出）
 * @param <E>
 */
public interface Stack<E> {

    //栈中的数量长度
    int getSize();
    //判断栈是否为空
    boolean isEmpty();
    //入栈
    void push(E e);
    //出栈
    E pop();
    //查看栈顶元素
    E peek();
}
