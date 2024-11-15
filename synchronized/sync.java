

class table{
	synchronized void print(int n){
	  for (int i = 1; i < 5; i++) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		System.out.println(e);	
			}
			System.out.println(n*i);
	  }
	}
}

class a extends Thread{

	table t;

	a(table t){
		this.t=t;
	}
	public void run(){
		t.print(5);
	}
}

class b extends Thread{

	table t;

	b(table t){
		this.t=t;
	}
	public void run(){
		t.print(2);
	}
}

class aa {
	public static void main(String[] args) {
		table obj =new table();
		a a=new a(obj);
		b b=new b(obj);
		a.start();
		b.start();
	}
}