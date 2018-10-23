package java.com.design.behavior.template_method;

public class Client {
	public static void main(String args[]){
		int [] array={ 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
		AbstractSort s=new ConcreteSort();
		s.showSortResult(array);
	}
}
