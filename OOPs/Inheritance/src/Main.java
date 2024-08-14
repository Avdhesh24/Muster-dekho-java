class base{
    public int x;

    public int getX()
    {return x;}

    public int setX(int x) {
        System.out.println("I am base and set x now");
        this.x = x;
        return x;
    }

    public void printMe()
    {
        System.out.println("I am a constructor");
    }

static class Derived extends base{
        public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



}






public class Main{
    public static void main(String[] args) {
        base b = new base() ;
        b.setX(4);
        System.out.println(b.getX());

    }
}