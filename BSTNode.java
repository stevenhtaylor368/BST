/**
 * @author Steven Taylor
 * @version 10/11/2020
 * @class CSCI 333
 * @assignment HW6 BST
 * @description BSTNode contains 4 fields key, rightChild, leftChild and p. A node is created via passing a key int value setting the right and left to null as well as the parent.
 * getters and setters in place for key, child nodes and parent node. 
 * 
 */
public class BSTNode {
public int key;
public BSTNode rightChild;
public BSTNode leftChild;
public BSTNode p;
/**
 * @param key
 * @param rightChild
 * @param leftChild
 */
public BSTNode(int key) {
	this.key = key;
	this.rightChild = null;
	this.leftChild = null;
	this.p = null;
}
public int getKey() {
	return key;
}
public void setKey(int key) {
	this.key = key;
}
public BSTNode getRightChild() {
	return rightChild;
}
public void setRightChild(BSTNode rightChild) {
	this.rightChild = rightChild;
}
public BSTNode getLeftChild() {
	return leftChild;
}
public void setLeftChild(BSTNode leftChild) {
	this.leftChild = leftChild;
}
public BSTNode getP() {
	return p;
}
public void setP(BSTNode p) {
	this.p = p;
}


}
