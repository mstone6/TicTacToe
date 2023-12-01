package Week8;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleQueue<T> implements QueueInterface<T>, Iterable<T> {

    private LinkedList<T> items = new LinkedList<>();

    @Override
    public void enqueue(T item) {
        items.addLast(item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

