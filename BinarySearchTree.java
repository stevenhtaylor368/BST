/**
 * @author Steven Taylor
 * @version 10/11/2020
 * @class CSCI 333
 * @assignment HW6 BST
 * @description BinarySearchTree has two fields root and size. The operations on the class getSize() gets the size of the tree.
 * private transplant is a helper operation for the deletion operator takes two nodes as the parameters. 10 private operations have correlating public methods
 * search takes the integer value being searched for starts searching for the int value by looking at the root node and then traverses down the tree until found.
 * The traversal methods all begin at the root of the tree. All other operations take nodes as parameters to be checked from the tree. Insert and deletion operation 
 * causes size field to be updated upon correlated method call such as insert increase size delete decrease size.
 * 
 */
public class BinarySearchTree {
BSTNode root;
private int size;
public BinarySearchTree() {
	this.root = null;
	size = 0;
}
public int getSize() {
	return size;
}
private void transplant(BSTNode u, BSTNode v) {
	if(u.p == null) {
		this.root = v;
	}
	else if(u == u.p.leftChild) {
		u.p.leftChild = v;
	}
	else {
		u.p.rightChild = v;
	}
	if(v != null) {
		v.p = u.p;
	}
}
//7 deadly sets(all private?): search, min, max, succesor, predecessor, insert and delete
private BSTNode search(int x, BSTNode node) {
	if(node.getKey() == x) {
		return node;
	}
	else if(node.getKey() > x) {
		return search(x, node.getLeftChild());
	}
	else if((node.getKey() < x)){
		return search(x, node.getRightChild());
	}
	else{
		return null;
	}
	
}
public void pSearch(int val) {
	try {
	if(search(val, root) != null) {
		System.out.println("found--> " + val);
	}
	}
	catch(NullPointerException e) {
		System.out.println("--> " + val + " not found, --> null point exception");
	}
}
private BSTNode min(BSTNode x) {
	while(x.leftChild != null) {
		x = x.leftChild;
	}
	return x;
}
public void pMin(BSTNode y) {
	min(y);
}
private BSTNode max(BSTNode x) {
	while(x.rightChild !=null) {
		x= x.rightChild;
	}
	return x;
}
public void pMax(BSTNode y) {
	max(y);
}
private BSTNode successor(BSTNode x) {
	if(x.rightChild != null) {
		return min(x.rightChild);
	}
	BSTNode y = x.p;
	while(y != null && x == y.rightChild) {
		x =y;
		y=y.p;
	}
	return y;
}
public void pSucc(BSTNode y) {
	successor(y);
}
//this one may need more work done
private BSTNode predecssor(BSTNode x) {
	if(x.p != null) {
		return max(x.leftChild);
	}
	BSTNode y = x.p;
	while(y != null && x == y.leftChild) {
		x =y;
		y=y.p;
	}
	return y;
}
public void pPS(BSTNode y) {
	predecssor(y);
}
private void insert(BSTNode z) {
	BSTNode y = null;
	BSTNode x = this.root;
	while(x != null) {
		y =  x;
		if(z.key < y.key) {
			x = x.leftChild;
		}
		else {
			x = x.rightChild;
		}
	}
	z.p = y;
	if(y == null) {
		this.root = z;
	}
	else if (z.key < y.key) {
		y.leftChild = z;
	}
	else {
		y.rightChild = z;
	}
	size ++;
}
public void pIns(BSTNode y) {
	insert(y);
}
private void delete(BSTNode z) {
	if(z.leftChild == null) {
		transplant(z, z.rightChild);
	}
	else if(z.rightChild == null) {
		transplant(z, z.leftChild);
	}
	else {
		BSTNode y = min(z.rightChild);
		if(y.p != z) {
			transplant(y, y.rightChild);
			y.rightChild = z.rightChild;
			y.rightChild.p = y;
		}
		transplant(z, y);
		y.leftChild = z.leftChild;
		y.leftChild.p = y;
	}
	size --;
}
public void pDel(BSTNode y) {
	delete(y);
}
//3 private traversal preOrder, inOrder, postOrder and then 3 public to call method
private void inOrder(BSTNode x) {
	if(x != null) {
		inOrder(x.leftChild);
		System.out.println(x.key);
		inOrder(x.rightChild);
	}
}
private void preOrder(BSTNode x) {
	if(x != null) {
		System.out.println(x.key);
		preOrder(x.leftChild);
		preOrder(x.rightChild);
	}
}
private void postOrder(BSTNode x) {
	if(x != null) {
		postOrder(x.leftChild);
		postOrder(x.rightChild);
		System.out.println(x.key);
	}
}
public void printInOrder() {
	inOrder(root);
}

public void printPreOrder() {
	preOrder(root);
}
public void printPostOrder() {
	postOrder(root);
}
}
