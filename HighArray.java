/* HighArray.java
 *demonstrates array class with high-level interface
 *to run this program: C>java HighArrayApp
 *Name: Josh Johnston
 *Date: 5/15/2015
 */
 
class HighArray{
 
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
//-----------------------------------------------------------
   public HighArray(int max){         // constructor
      
      a = new long[max];               // create the array
      nElems = 0;                      // no items yet
    }
//-----------------------------------------------------------
   public boolean find(long searchKey){
                                          // find specified value
      int j;
      for(j = 0; j < nElems; j++)        // for each element,
         if(a[j] == searchKey)           // found item?
            break;                      // exit loop before end
                                         
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
//-----------------------------------------------------------
   public void insert(long value){    // put element into array
      
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
    }
//-----------------------------------------------------------
   public boolean delete(long value){
      
      int j;
      for(j = 0; j < nElems; j++)        // look for it
         if( value == a[j] )
            break;
      
      if(j==nElems)                       // can't find it
          return false;
      else{                               // found it         
	    for(int k=j; k<nElems; k++)   // move higher ones down
                 a[k] = a[k+1];
			
             nElems--;                      // decrement size
	     return true;
         }
      }  // end delete()
//-----------------------------------------------------------
   public void display(){                // displays array contents
      
      for(int j=0; j<nElems; j++)        // for each element,
         System.out.print(a[j] + " ");   // display it
      
	  System.out.println("");
      }
//----------------------------------------------------------- 
   public long getMax(){
	   
      long max = Integer.MIN_VALUE;     //setting max to the lowest value
      
      if(nElems == 0){                  //checking to see if the array is empty
         return -1;
         }//if
	   
      for(int i = 0; i < nElems; i++){    //compares the values in the array to max 
          if(a[i] > max){                 //any value greater then max becomes max
             max = a[i];			   
             }//if	   
          }//for
       return max;
      }// end getMax()
//-----------------------------------------------------------
   public long getMin(){
	   
      long min = Integer.MAX_VALUE;   //setting min to the highest value
	   
      if(nElems == 0){                //checking to see if the array is empty
         return -1;
         }//if

      for(int i = 0; i < nElems; i++){    //compares the values in the array to min
          if(a[i] < min){                   //any value less then min becomes min
	     min = a[i];			   
	     }//if	   
	  }//for
      return min;
     }// end getMin()      
  //-----------------------------------------------------------
   }  // end class HighArray
////////////////////////////////////////////////////////////////
