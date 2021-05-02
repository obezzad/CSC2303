import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AssociatedList<T> {

   public List <T> elements;
   public  AssociatedList(){
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
    
    public <T> boolean removeElement(T element){
        return elements.remove(element);
    }
    
    public void modifyElement(T key, T element){
        
        int i = elements.indexOf(key);
        if(i >= 0){
            elements.set(i,element);
        }
    }
    
    public void sortElement(Comparator c){
        elements.sort(c);
    }
    
    // the comparator is used to define the search-by
    public LinkedList<T> searchElement (Comparator c,T key){
    
       LinkedList<T> returnedElements = new LinkedList<>();
       ListIterator<T> i = elements.listIterator();
       while(i.hasNext()){
           T temp = i.next();
           if(c.compare(temp,key)==0){
               returnedElements.add(temp);
              
           }
       }
      return returnedElements;
    }
   
    @Override
    public String toString(){
        Iterator <T> iter= this.elements.iterator();
        String returnedString = "";
        while(iter.hasNext()){
        returnedString=returnedString+iter.next().toString()+"\n";
        }
        
        return returnedString;
    }


}
