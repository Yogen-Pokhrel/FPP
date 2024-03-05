package Assignment5.Problem5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, int processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    int getRamSize(){
        return ramSize;
    }

    double getProcessorSpeed(){
        return processorSpeed;
    }

    double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer { \n" +
                "Manufacturer: " + manufacturer+"\n"+
                "Processor: " + processor + "\n" +
                "Ram Size: " + ramSize + "\n" +
                "Processor Speed: " + processorSpeed + "\n" +
                "}\n "
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Computer compObj = (Computer) obj;
        return Objects.equals(compObj.manufacturer, manufacturer) && Objects.equals(compObj.processor, processor)
                && compObj.ramSize == ramSize && compObj.processorSpeed == processorSpeed;
    }
}
