// LinkedList.java

/**
 * Encapsulates a linked list of <code>BaseballPlayer</code>.
 */
public class BaseballPlayerList  {

/**  First node in linked list - dummy node  */
   protected Node first = new Node(null);

/**  Last node in linked list  */
   protected Node last = first;

/**  Number of data items in the list.  */
   protected int length = 0;

  /**
    * Gets the number of data values currently
    * stored in this LinkedList.
    *
    * @return the number of elements in the list.
    */

   public int getLength()  { 
      return length; 
   }


   /**
    * Appends a String data element to this
    * LinkedList.
    *
    * @param data the data element to be appended.
    */
   //Method to add a baseball player to the end of the list
   public void append(BaseballPlayer d){
	   Node toAppend=new Node(d);
	   last.next=toAppend;
	   last=toAppend;
	   length++;
   }
   
   //Method to add baseball players to the list sorting them by player number
   public void insert(BaseballPlayer d){
	   if (length == 0){
		   Node newNode = new Node(d);
		   last.next = newNode;
		   last = newNode;
		   length++;
	   }
	   else{
		   Node a = first;
		   Node b = a.next;
		   Node newNode = new Node(d);
		   while(b != null && b.data.getNumber() <= newNode.data.getNumber()){
			   a = a.next;
			   b = b.next;
		   }
		   if(b != null && b.data.getNumber() > newNode.data.getNumber()){
			   a.next = newNode;
			   newNode.next = b;
			   last = b;
			   length++;
		   }
	   }
	   
   }
   
   
   /**
    * Prepends (adds to the beginning) a String data element to this
    * LinkedList.
    *
    * @param data the data element to be prepended.
    */
   public void prepend(BaseballPlayer d){
	   Node toPrepend=new Node(d);
	   if(first==last){
		   last.next=toPrepend;
		   last=toPrepend; 
		   length++;
	   }
	   else{
		   toPrepend.next=first.next;
		   first.next=toPrepend;
	       length++;
	   }
   }


  /**
   *  Prints the contents of the Linked List
   *
   */
   
   
   
   public String toString() {
      Node p = first.next;
      String returnString = "";
      while (p != null) {
         returnString += p.data+" ";
         p=p.next;
      }
      return returnString;
   }

  
  
   public boolean equals(Object other)
   {
      if ( other == null 
              || getClass() != other.getClass()
              || length != ((BaseballPlayerList) other).length )
          return false;

      Node nodeThis = first;
      Node nodeOther = ((BaseballPlayerList) other).first;
      while ( nodeThis != null )
      {
          // Since the two linked lists are the same length,
          // they should reach null on the same iteration.

          if ( nodeThis.data != nodeOther.data )
             return false;

          nodeThis = nodeThis.next;
          nodeOther = nodeOther.next;
      }  // while

      return true;
   }  // method equals

  

}  // class BaseballPlayerList