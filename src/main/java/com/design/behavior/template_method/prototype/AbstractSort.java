package com.design.behavior.template_method.prototype;

public abstract class AbstractSort {
    protected abstract void sort(int[] array);

    //main template method can't be @Override
    public final void showSortResult(int[] array){
        this.sort(array);
        System.out.print("排序结果：");
        for (int i = 0; i < array.length; i++){
            System.out.printf("%3s", array[i]);
        }
    }
}
