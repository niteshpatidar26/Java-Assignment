package forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ArraySummation extends RecursiveTask<Long> {
	
	private static final long serialVersionUID = 1L;
	private static long sum=0;
	private final int[] sumArray;
	private final int threshold ; 
	private int start;
	private int end;
	private int mid;
	
	public ArraySummation(int[] sumArray,  int start, int end,int threshold) {
		super();
		this.sumArray = sumArray;
		this.threshold = threshold;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() 
	{
		if(end-start>threshold) {
			for (int i = start; i <= end; i++) {
				sum+=sumArray[i];
			}
			return sum;
		}
		else {
			mid = end-start/2 +start;
			ArraySummation t1 = new ArraySummation(sumArray, start, mid, threshold);
			t1.fork();
			ArraySummation t2 = new ArraySummation(sumArray, mid, end, threshold);
			long addExact = Math.addExact(t2.compute(), t1.join());
			return addExact;
		}
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		long verifySum=0;
		ForkJoinPool pool = new ForkJoinPool();
		int data[] = new int[100000];
		for(int i=0;i<data.length;i++) {
			int x = (int)(Math.random() * 100);
			verifySum+=x;
			data[i]=x;
		}	
		
		System.out.println("---------- Given Array ----------");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+",");
		}
				
		ArraySummation task = new ArraySummation(data, 0, data.length-1,data.length/300);
		Long result = pool.invoke(task);
		System.out.println("\n\n---------- Verifying Answer ----------\n");
		Thread.sleep(2000);
		System.out.println("Summation from FORK-JOIN is : "+result);
		System.out.println("Actual Sum is : "+verifySum);
		if(verifySum==result) {
			System.out.println("---------- Answer Verified ----------");
		}
		else {
			System.out.println("---------- Answer is Incorrect ----------");
		}
	}

}
