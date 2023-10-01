
package genericclasss;
class TestN<T> {
    T t;

    public TestN(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public TestN(){
        
    }
    
    
}
public class Demo2 {
    public static void main(String[] args) {
        TestN<Integer> a = new<Integer> TestN(23);
        
        System.out.println(a.getT());
    }
}
