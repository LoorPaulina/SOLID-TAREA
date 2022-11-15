package isp_solucion;

public interface AvlTree extends ITree<K, E>{

	public AvlTree<K, E> insertRec(AvlNode<K,E> node, K key, E elem);
	
	public AvlNode<K,E> balanceLeft(AvlNode<K,E> node);
	
	public AvlNode<K,E> balanceRight(AvlNode<K,E> node);
	
	public AvlNode<K,E> balanceLeftLeft(AvlNode<K,E> node);
	
	public AvlNode<K,E> balanceLeftRight(AvlNode<K,E> node);
	
	public AvlNode<K,E> balanceRightLeft(AvlNode<K,E> node);
	
	public AvlNode<K,E> balanceRightRight(AvlNode<K,E> node);
}
