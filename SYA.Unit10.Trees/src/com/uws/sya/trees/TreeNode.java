package com.uws.sya.trees;


/**
 * 
 * @author 77800577
 */
public class TreeNode {
    // package access members
   TreeNode leftNode; // left node  
   Comparable data; // node value
   TreeNode rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode( Comparable nodeData )
   { 
      data = nodeData;              
      leftNode = rightNode = null; // node has no children
   } // end TreeNode no-argument constructor

   public Comparable getData(){
        return data;
   }
   
   public TreeNode getLeftNode(){
       return leftNode;
   }
   
   public TreeNode getRightNode(){
       return rightNode;
   }
   
   
   
   // Based on Slide 4-9.  
   //locate insertion point and insert new node; ignore duplicate values
   //Different to slide 4, creation of new node is defferd until adequate possition is found.
   public TreeNode insert(Comparable insertValue )
   {
      // insert in left subtree
      if ( insertValue.compareTo(data) < 0 ) 
      {  
         if ( leftNode == null ) {
            leftNode = new TreeNode( insertValue );
         }
         else
            leftNode = leftNode.insert( insertValue ); 
      } 
      else if ( insertValue.compareTo(data) >= 0 ) // insert in right subtree
      {
          
         if ( rightNode == null )
            rightNode = new TreeNode( insertValue );
         else
            rightNode = rightNode.insert( insertValue ); 
      } 
      return this;
   } 
}
  