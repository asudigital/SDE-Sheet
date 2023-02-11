package arrayList;
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(30);
        Iterator it =  (Iterator) al.iterator();
        while(it.hasNext())
        {
        	int x= (Integer)it.next();
            
            if(x<10)
            it.remove();
            else
            System.out.println(x);
        }
	}

	
	}


