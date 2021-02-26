package Day4_Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

class Bound<T extends A>


{
	

	private T objRef; 
    
    public Bound(T obj){ 
        this.objRef = obj; 
    } 
       
    public void doRunTest(){ 
        this.objRef.displayClass(); 
    } 
} 
   
class A 
{ 
    public void displayClass() 
    { 
        System.out.println("Welcome To Chennai:"); 
        List<String> chlist = new ArrayList<String>();
        chlist.add( "Marina Beach");
        chlist.add( "Elliot’s Beach");
        chlist.add( "Dakshina Chitra");
        chlist.add("Birla Planetarium");
        String element = chlist.get(1);
        System.out.println(element);
      }
        
    } 

class B extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Welcome to TamilNaidu:"); 
        List<String >Tnlist = new ArrayList<String>();
        Tnlist.add("Ooty");
        Tnlist.add("Yelagiri");
        Tnlist.add("Yercaud");
        Tnlist.add("coonnoor");
        Tnlist.add("Kodaikanal");
        String element = Tnlist.get(1);
        System.out.println(element);
        System.out.println("");
    } 
} 
   
class C extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Welcome To India :"); 
        ArrayList<String>Indlist= new ArrayList<String>();
        Indlist.add("TajMahal");
        Indlist.add("RedFort");
        Indlist.add("Wind Place");
        Indlist.add("Colva Beach");
        String element = Indlist.get(1);
        System.out.println(element);
        System.out.println("");
       
        
    } 
} 
public class MultiBoundGensis {
public static void main(String[] args) {
		
        Bound<C> Chennai = new Bound<C>(new C()); 
        Chennai.doRunTest(); 
  
        Bound<B> TamilNaidu = new Bound<B>(new B()); 
        TamilNaidu.doRunTest(); 
  
        
        Bound<A> India = new Bound<A>(new A()); 
        India.doRunTest(); 

}


}
