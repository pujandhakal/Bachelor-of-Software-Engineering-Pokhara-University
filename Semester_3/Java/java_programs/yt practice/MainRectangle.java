class Rectangle{
    private int length;
    private int breadth;
    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int findArea(){
        return length*breadth;

    }
    int findPerimeter(){
        return 2*(length*breadth);
    }
}

class MainRectangle{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle();

        System.out.println("First Rectangle");
        System.out.println("Area"+ r1.findArea());
        System.out.println("Perimeter"+ r2.findPerimeter());
        
    }
}