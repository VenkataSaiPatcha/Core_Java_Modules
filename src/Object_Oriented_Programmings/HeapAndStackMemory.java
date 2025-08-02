package Object_Oriented_Programmings;

public class HeapAndStackMemory
{
	private Integer i1 = 900;
	
	public static void main(String[] args) 
	{
		HeapAndStackMemory h1 = new HeapAndStackMemory();
		HeapAndStackMemory h2 = new HeapAndStackMemory();
		HeapAndStackMemory h3 = modify(h2);
		
		h1=null;
		System.out.println(h2.i1);
		
	}
	public static  HeapAndStackMemory modify(HeapAndStackMemory heap)
	{
		heap.i1=9;
		heap = new HeapAndStackMemory();
		heap.i1=20;
		System.out.println(heap.i1);
		heap = null;
		return heap;
	}

}
