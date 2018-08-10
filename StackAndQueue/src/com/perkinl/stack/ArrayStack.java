package com.perkinl.stack;

public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    //传入一个容积
    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    //查看栈中一共有多少个元素
    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    //查看静态数组中有多少元素
    public int getCapacity(){
        return array.getCapacity();
    }

    //入栈
    @Override
    public void push(E e){
        array.addLast(e);
    }

    //出栈
    @Override
    public E pop(){
        return array.removeLast();
    }

    //查看栈顶元素
    @Override
    public E peek(){
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
