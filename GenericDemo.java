package Prognine;

import java.util.Scanner;

class Storage<T>{
	T value;
	Storage(T value){
		this.value=value;
	}
	Storage(T[] arr){
		GenericDemo.printArray(arr);
	}
	void display() {
		System.out.println("Storage has "+this.value);
	}
}
public class GenericDemo{
	static <E> void printArray(E[] array) {
		System.out.println("Element in an array");
		for(E ele:array) {
			System.out.print(ele +",");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("\n1. Int Storage");
            System.out.println("2. String Storage");
            System.out.println("3. Double Storage");
            System.out.println("4. Print Int array");
            System.out.println("5. Print String array");
            System.out.println("6. Print Double array");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Integer Storage: ");
				Storage<Integer> Intstorage=new Storage<>(sc.nextInt());
				Intstorage.display();
				break;
			case 2:
				System.out.println("String Storage: ");
				Storage<String> Stringstorage=new Storage<>(sc.next());
				Stringstorage.display();
				break;
			case 3:
				System.out.println("Double Storage: ");
				Storage<Double> Doublestorage=new Storage<>(sc.nextDouble());
				Doublestorage.display();
				break;
			case 4:
				Integer[] intarray= {1,2,3,4,5,6};
				new Storage<Integer>(intarray);
				break;
			case 5:
				String[] Stringarray= {"hi","I am under","the water"};
				new Storage<String>(Stringarray);
				break;
			case 6:
				Double[] dblarray= {1.34,13.43,2.78};
				new Storage<Double>(dblarray);
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
			
		}
	}
}
