package Object_Oriented_Programmings;

public class HeapAndStackMemory01 
{
	
	HeapAndStackMemory01 hs;
	int val;
	
	public HeapAndStackMemory01(int val)
	{
		this.val=val; // 100
	}
	public HeapAndStackMemory01(int val,HeapAndStackMemory01 hs) {
		super();
		this.hs = hs; // h1  //h1 //h2
		this.val = val; // 200 //300 //400
	}

	public static void main(String[] args) 
	{
		HeapAndStackMemory01 h1 = new HeapAndStackMemory01(100);
		HeapAndStackMemory01 h2 = new HeapAndStackMemory01(200,h1);
		HeapAndStackMemory01 h3 = new HeapAndStackMemory01(300, h1);
		HeapAndStackMemory01 h4 = new HeapAndStackMemory01(400, h2);
		
		h2.hs=h3;
		h3.hs=h4;
		h1.hs=h2.hs;
		h2.hs=h4.hs;
		
		System.out.println(h1.hs.val);
		System.out.println(h2.hs.val);
		System.out.println(h3.hs.val);
		System.out.println(h4.hs.val);
		
	}

}
