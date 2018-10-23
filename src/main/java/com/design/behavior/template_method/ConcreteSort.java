package java.com.design.behavior.template_method;

import java.util.Arrays;

public class ConcreteSort extends AbstractSort{

    @Override
    protected void sort(int[] array){
        Arrays.sort(array);
    }
    
    

}