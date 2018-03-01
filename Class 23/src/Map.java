import java.util.*;

class MapNode<K, V> {
	K key;
	V value;
	MapNode<K, V> next;

	MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

public class Map<K, V> {
	int size;
	int bucketSize;
	ArrayList<MapNode<K, V>> bucketList;

	public Map() {
		bucketSize = 11;
		bucketList = new ArrayList<>();
		for (int i = 0; i < bucketSize; i++) {
			bucketList.add(null);
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private int getIndex(K key) {
		int code = key.hashCode();
		int compr = code % 11;
		if (compr < 0) {
			compr += bucketSize;
		}
		return compr;
	}

	public void adde(K key, V value) {
		MapNode<K, V> newNode = new MapNode(key, value);
		MapNode<K, V> head = bucketList.get(getIndex(key));
		MapNode<K,V> temp=head;
		while(temp!=null){
			if(temp.key.equals(key)){
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		newNode.next = head;
		bucketList.set(getIndex(key), newNode);
		size++;
		if (1.0 * size / bucketSize > 0.7) {
         rehash();
	}
	}

	public V get(K key) {
		Integer index = getIndex(key);
		if (index != null) {
			MapNode<K, V> temp = bucketList.get(index);
			while (temp != null) {
				if (temp.key.equals(key)) {
					return temp.value;
				}
				temp = temp.next;
			}
		}
		return null;
	}

	public void remove(K key) {
		Integer index = getIndex(key);
		if (index != null) {
			MapNode<K, V> temp = bucketList.get(index);
			MapNode<K, V> prev = null;
			while (temp != null) {
				if (temp.key.equals(key)) {
					size--;
					if (prev == null) {
						bucketList.set(index, temp.next);
					} else {
						prev=temp;
						prev.next = temp.next;
					}
				}
				temp = temp.next;
			}
		}

	}

	public void rehash() {
ArrayList<MapNode<K,V>> temp=bucketList;
bucketList =new ArrayList<>();
for(int i=0;i<bucketSize*2;i++){
	bucketList.add(null);
}
for(MapNode<K,V> head:temp){
	while(head!=null){
		adde(head.key,head.value);
		head=head.next;
	}
}

	}
}
