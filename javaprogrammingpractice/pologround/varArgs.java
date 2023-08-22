class Test{

    public void addFloat(float... i){
        for (float element : i) {
            System.out.println(element);
        }
    }

    public void addFloat(float k, float z){
        System.out.println(k+" "+z);
    }
}

class varArgs{
	public static void main(String[] args) {
        Test objt = new Test();
        objt.addFloat(22.f,44.56f);

    }
}