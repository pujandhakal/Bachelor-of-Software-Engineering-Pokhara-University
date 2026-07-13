class TestArray{
    public static void main(String args[]){
        int a[] = new int[5]; //declaration and initialization
        a[0] =10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        

        //printing array 
        for(int i = 0; i<a.length; i++)
            System.out.println(a[i]);
    }
}
