
// The answer should be 6.

class A {
	List<Object> list = new LinkedList<>();
	public boolean addAll(Collection<Object> c) { //In A class, this method is called first
		Iterator<Object> it = c.iterator();
		while(it.hasNext())
			this.add(it.next());// Then the add method is called
		return true;
	}
	public boolean add(Object e) {
		list.add(e);
		return true;
	}

	private int i = 0;
	public int getI(){
		return i;
	}
}

class B extends A { //B extends all method and data in A
	private int addCount = 0; // The initial value of i is 0;
	public int getAddCount() { 
		return addCount;
	}

	@Override
	public boolean addAll(Collection<Object> c) { //When this method is called, addCount is added with the number of elements in c.
		addCount += c.size(); // when this method is called in Main, the addCount is 3.
		return super.addAll(c); //Called addAll method in A
	}
	
	@Override
	public boolean add(Object e) {
		addCount++;
		return super.add(e);
	}
    
	public int i = 3; 
}

public class Test {
	public static void main(String[] args) {
		B b = new B();
		List<Object> list = Arrays.asList(1,2,3); //there are 3 elements in the list
		b.addAll(list);//After this method called, addCount equals to 3.
		System.out.println(b.getAddCount()+b.getI());// b.getI method is extended from A, and the i value is 3.
	}
}
