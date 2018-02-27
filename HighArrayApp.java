/*HighArrayApp.java
 *The main driver of the project. Calls the basic methods from HighArray: 
 *inserting data, display the data, find a key, delete a few items, and display the data again, find the max, and find the min.
 *To run this program: C>java HighArrayApp
 *Name: Josh Johnston
 *Date: 5/15/2015
 */
 
public class HighArrayApp{
   
   public static void main(String[] args){
      
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array
      long y, z;

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();                // display items

      int searchKey = 35;           // search for item
      
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 3 items
      arr.delete(55);
      arr.delete(99);

      arr.display();                // display items again
	  
      y=arr.getMax();                                   
      System.out.println(y);
      z=arr.getMin();
      System.out.println(z); 
      }  // end main()
   }  // end class HighArrayApp
////////////////////////////////////////////////////////////////
