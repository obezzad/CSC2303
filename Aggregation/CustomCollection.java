package Aggregation;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CustomCollection<T> {

   public List <T> elements;
   public  CustomCollection(){
        this.elements = new LinkedList<>();
    }
    
    public void addElement (T element){
       elements.add(element);
    }
    
    public void setElements(List <T> elements){
        this.elements = elements;
    }
    
    public List<T> getElements(){
        return this.elements;
    }
    
    public boolean removeElement(T element){
        return elements.remove(element);
    }
    
    public void modifyElement(T key, T element){
        
        int i = elements.indexOf(key);
        if(i >= 0){
            elements.set(i,element);
        }
    }
    
    public void sortElement(Comparator<T> c){
        elements.sort(c);
    }
    
    // the comparator is used to define the search-by
    // TODO: Turn into for-loop, and figure out the modification
    public LinkedList<T> searchElement (Comparator<T> c,T key){
    
       LinkedList<T> returnedElements = new LinkedList<>();
       // ListIterator<T> i = elements.listIterator();
       for (ListIterator<T> i = elements.listIterator(); i.hasNext(); i.next()) {
       //while(i.hasNext()){
           T temp = i.next();
           if(c.compare(temp,key)==0) {
               returnedElements.add(temp);
           }
       }
      return returnedElements;
    }

    // TODO: Review toString.

    /*
    @Override
    public String toString(){
        Iterator <T> iter= this.elements.iterator();
        String returnedString = "";
        while(iter.hasNext()){
        returnedString=returnedString+iter.next().toString()+"\n";
        }
        
        return returnedString;
    }
*/

}
