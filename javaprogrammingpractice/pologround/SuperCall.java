class A{
    public A(){
        this(22);
    }
    public A(int a){
        this();
    }
}

class SuperCall{
	public static void main(String[] args) {
        A obj = new A();
    }
}

