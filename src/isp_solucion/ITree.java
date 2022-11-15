package isp_solucion;

public interface ITree<K extends Comparable<K>, E> {

	public INode<K,E> getRoot() ;

	public void insert(K key, E elem);
}
