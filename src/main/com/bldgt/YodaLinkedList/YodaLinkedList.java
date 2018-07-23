package main.com.bldgt.YodaLinkedList;
import java.util.ArrayList;

public class YodaLinkedList<T>
{
    ArrayList<YodaLinkedListNode<T>> nodes;

    public YodaLinkedList()
    {
        nodes = new ArrayList<YodaLinkedListNode<T>>();
    }

    public YodaLinkedList(int initialCapacity)
    {
        nodes = new ArrayList<YodaLinkedListNode<T>>(initialCapacity);
    }

    // todo unstub
    public YodaLinkedList add(YodaLinkedListNode node)
    {
        // stub
        return this;
    }

    // todo unstub
    public YodaLinkedList addToHead(YodaLinkedListNode node)
    {
        // stub
        return this;
    }

    // todo - add addToTail(), addAtPosition(), addAfter(), addBefore(),
    // todo - remove(), removeFromPosition(), etc, etc, etc...
}
