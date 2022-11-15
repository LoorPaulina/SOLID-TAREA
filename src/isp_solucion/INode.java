package isp_solucion;

public interface INode<K extends Comparable<K>, E> {
	public INode<K, E> getLeftChild();
	public INode<K, E> getRightChild();

}

