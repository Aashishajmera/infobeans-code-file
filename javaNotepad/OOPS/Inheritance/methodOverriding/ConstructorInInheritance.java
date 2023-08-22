import java.security.PublicKey;
import java.util.Scanner;
class Area{
    private int l, w;

    public Area(int l, int w){
        this.l = l;
        this.w = w;
    }

    public int GetArea(){
        return (l*w);
    }
}

class Volume extends Area{
    private int h;
    
    public Volume(int l, int w, int h){
        super(l, w);
        this.h = h;
    }

    public int GetVolume(){
        return (GetArea()*h);
    }
}

class Density extends Volume{
    private float m ;
    public Density(int l, int w, int k, float m){
        super(l, w, l);
        this.m = m;
    }
    public float getDensity(){
        return m/GetVolume();
    }
}

class ConstructorInInheritance{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght: ");
        int lenght = sc.nextInt();
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        System.out.println("Enter mass: ");
        float mass = sc.nextFloat();
        Density obj = new Density(3,5,7,88.9f);
        float ans = obj.getDensity();
        
        System.out.println("Density is: "+ans);
    }
}