package data_structure.src.list.LinkedList;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2016/11/24.
 * tip:
 *
 */
public class MyLinkedList<E>
        implements List<E>,Serializable,Cloneable{

    private static int size = 0;
    Node<E> head = null;

//  Node<E> last;


    public MyLinkedList() {

    }
    public MyLinkedList(Collection<? extends E> c) {
        this();
        addAll(c);
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {

    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        checkOutOfBound(index);
        for(int i=0;;i++){
            head = head.next;
            if(i == index){
                return head.item;
            }
        }
    }
    protected void checkOutOfBound(int index){
        if (index > size || index > 0){
            throw new IndexOutOfBoundsException("越界");
        }
    }
    @Override
    public E set(int index, E element) {
        checkOutOfBound(index);
        for(int i=0;;i++){
            head = head.next;
            if(i == index){
                return head.item;
            }
        }
    }

    @Override
    public void add(int index, E element) { //index is'not userful ,for LinkedList
        addIsNull(index, element);
        for (int i = 0;head.next!=null;i++){
            head = head.next;
        }
        new Node(element,head,null);
        size++;
    }


    public void addIsNull(int index, E element) {//index is'not userful ,for LinkedList
        if (head == null){
//            Node<E> next = new Node(null,);
            head = new Node<E>(element,head,null);
        }
    }

    @Override
    public E remove(int index) {
        checkOutOfBound(index);
        for(int i =0;;i++){
            head = head.next;
            if (i == index) {
                head.next = head.next.next;
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }


    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
