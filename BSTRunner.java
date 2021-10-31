/**
 * @author Steven Taylor
 * @version 10/11/2020
 * @class CSCI 333
 * @assignment HW6 BST
 * @description BST Runner, creates BSTNode objects inserts them into the BinarySearchTree object. Prints out the traversals,
 * Searches for five elements that exist and five that don't exist in the tree object. Delete five nodes from the tree object, print out
 * in order traversal and display the size of the tree. 
 * 
 */
public class BSTRunner {

	public static void main(String[] args) {
		// make 20 elements and insert into tree
		BinarySearchTree tree = new BinarySearchTree();
		BSTNode a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
		a = new BSTNode(20);
		b = new BSTNode(55);
		c = new BSTNode(33);
		d = new BSTNode(99);
		e = new BSTNode(100);
		f = new BSTNode(57);
		g = new BSTNode(12);
		h = new BSTNode(33);
		i = new BSTNode(22);
		j = new BSTNode(11);
		k = new BSTNode(66);
		l = new BSTNode(42);
		m = new BSTNode(32);
		n = new BSTNode(64);
		o = new BSTNode(16);
		p = new BSTNode(71);
		q = new BSTNode(90);
		r = new BSTNode(53);
		s = new BSTNode(5);
		t = new BSTNode(99);
		u = new BSTNode(148);
		v = new BSTNode(88);
		w = new BSTNode(12);
		x = new BSTNode(23);
		y = new BSTNode(78);
		z = new BSTNode(17);
		tree.pIns(a);
		tree.pIns(b);
		tree.pIns(c);
		tree.pIns(d);
		tree.pIns(e);
		tree.pIns(f);
		tree.pIns(g);
		tree.pIns(h);
		tree.pIns(i);
		tree.pIns(j);
		tree.pIns(k);
		tree.pIns(l);
		tree.pIns(m);
		tree.pIns(n);
		tree.pIns(o);
		tree.pIns(p);
		tree.pIns(q);
		tree.pIns(r);
		tree.pIns(s);
		tree.pIns(t);
		//pre post in and print size
		System.out.println("Pre order");
		tree.printPreOrder();
		System.out.println("end pre order");
		System.out.println("In order");
		tree.printInOrder();
		System.out.println("end in order");
		System.out.println("Post order");
		tree.printPostOrder();
		System.out.println("end in order");
		System.out.println("Size is: " + tree.getSize());
		//search for five in and five not in
		tree.pSearch(20);
		tree.pSearch(66);
		tree.pSearch(99);
		tree.pSearch(11);
		tree.pSearch(33);
		//not in
		
		tree.pSearch(17);
		tree.pSearch(78);
		tree.pSearch(23);
		tree.pSearch(148);
		tree.pSearch(88);
		//delete five elements and print in-order, size
		tree.pDel(d);
		tree.pDel(g);
		tree.pDel(j);
		tree.pDel(s);
		tree.pDel(t);
		tree.printInOrder();
		System.out.println("Size is: " + tree.getSize());
		

	}

}
