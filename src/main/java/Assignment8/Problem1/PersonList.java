package Assignment8.Problem1;

import java.util.ArrayList;
import java.util.Arrays;


public class PersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public PersonList(){
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(Person p){
        if(p == null){ return;}
        if(numOfElements == currentArray.length){resize();}
        currentArray[numOfElements] = p;
        numOfElements += 1;
    }

    public Person get(int i){
        if(i < 0 || i >= numOfElements){return null;}
        return currentArray[i];
    }

    private void resize(){
        int len = currentArray.length;
        int newLen = len * 2;
        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty(){
        return numOfElements == 0;
    }

    public boolean find(String lastName){
        if(lastName == null){return false;}
        for(int i = 0; i < numOfElements; i++){
            if(currentArray[i].getLast().equals(lastName)){return true;}
        }
        return false;
    }

    public void insert(Person p, int pos){
        if(p == null){return;}
        if(pos > numOfElements || pos < 0){ return;}
        if(numOfElements == currentArray.length){resize();}
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos]= p;
        System.arraycopy(currentArray, pos, temp, pos+1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean  remove(String lastName){
        if(lastName == null){return false;}
        int index = -1;
        for(int i= 0; i< numOfElements; i++){
            if(currentArray[i].getLast().equals(lastName)){
                index = i;
                break;
            }
        }
        if(index == -1){ return false;}
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[ \n");
        if(numOfElements > 0){
            for(int i = 0; i< numOfElements - 1; i++){
                sb.append("\t");
                sb.append(currentArray[i].toString());
                sb.append(", \n ");
            }
            sb.append("\t");
            sb.append(currentArray[numOfElements - 1]);
        }
        sb.append("\n]");
        return sb.toString();
    }

    public int Size(){
        return numOfElements;
    }

    @Override
    public Object clone(){
        return Arrays.copyOf(currentArray, numOfElements);
    }

    public static void main(String[] args) {
        PersonList pList = new PersonList();
        pList.add(new Person("Pokhrel", "Yogen", 25));
        pList.add(new Person("Prasai", "Dikshya", 22));
        pList.add(new Person("Prasai", "Cholika", 22));
        pList.add(new Person("Pokhrel", "Manjari Lamsal", 55));
        pList.insert(new Person("Bhattarai", "Binod", 42), 2);
        pList.insert(new Person("Shah", "Gyendra", 49), 4);
        System.out.println("Find: " + pList.find("Pokhrel"));
        System.out.println("At index 3: " + pList.get(3));
        pList.remove("Prasai");
        System.out.println(pList);
    }

}

