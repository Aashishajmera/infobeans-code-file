class Area{
    private int l, w;

    public void SetData(int l, int w){
        this.l = l;
        this.w = w;
    }

    public int GetArea(){
        return l*w;
    }
}

class AreaVolume extends Area{
	protected int h;

    public void SetData(int l, int w, int h){
        SetData(l, w);
        this.h = h;
    }

    public int GetVolume(){
        return GetArea()*h;
    }
}

class TestMain{
    public static void main(String[] args) {
        // create area object
        AreaVolume obj = new AreaVolume();
        obj.SetData(3, 8, 9);
        System.out.println(obj.GetArea());
        System.out.println(obj.GetVolume());

    }
}