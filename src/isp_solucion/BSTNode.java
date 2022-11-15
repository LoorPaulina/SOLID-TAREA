package isp_solucion;

public interface BSTNode extends INode<K,E>{

	public K getKey();
	public E getElement();
	public INode<K, E> getParent();
	public boolean hasLeftChild();
	public boolean hasRightChild();
	public boolean isInternal();
	public boolean isExternal();
	public INode<K, E> getRoot();
	public boolean isRoot();
	public int getSize();
	public int getHeight();
	public int getDepth();
	public IList<INode<K, E>> getChildren();
	public IList<E> getPreorder();
}

