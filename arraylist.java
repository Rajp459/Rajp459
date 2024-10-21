import java.util.ArrayList;
import java.util.Collection;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //add element
        list.add(9);
        list.add(7);
        list.add(3);
        System.out.println(list);
        //get element
        
        int element = list.get(0);
        System.out.println(element);
        list.add(2,2);
        System.out.println(list);
        
        list.remove(3);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
            
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
