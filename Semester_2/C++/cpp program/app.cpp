// #include<iostream>
// #include<math.h>
// using namespace std;
// class Rectangle{
//     private:
//     float xco;
//     float yco;
//     public:
//     Rectangle(){
//         xco = 0;
//         yco = 0;
//     }
//     Rectangle(float x, float y){
//         xco = x;
//         yco = y;
//     }
//     void display(){
//         cout<<"("<<xco<<","<<yco<<")"<<endl;
//     }
// };

// class Polar{
//     private: 
//     float radius;
//     float angle;

//     public:
//     Polar(){
//         radius=0.0;
//         angle = 0.0;
//     }
//     Polar(float r, float a){
//         radius = r;
//         angle = a;
//     }
//     void display(){
//         cout<<"("<<radius<<","<<angle<<")"<<endl;
//     }
//     operator Rectangle(){
//         float x = radius*cos(angle);
//         float y = radius*sin(angle);
//         return Rectangle(x,y);
//     }
// };

// int main(){
//     Polar p(10.0, 0.75);
//     Rectangle r;
//     r = p;
//     cout<<"Polar coordinates = ";
//     p.display();
//     cout<<"Rectangular coordinates=";
//     r.display();
//     return 0;
// }

class Polar{
    private:
    float radius;
    float angle;

    public: 
    Polar(){
        radius = 0.0;
        angle = 0;
    }
    Polar(float r, float a){
        radius = r;
        angle = a;
    }
    void display(){
        cout<<"("<<radius<<","<<angle<<")"<<endl;
    }
};

class Rectangle{
    private:
    float xco, yco;
    public:
    Rectangle(){
        xco =0;
        yco = 0;
    }
    Rectangle(float x, float y){
        xco = x;
        yco = y;
    }
    void display(){
        cout<<"("<<xco<<","<<yco<<")"<<endl;
    }

    operator Polar(){
        float a = atan(yco/xco);
        float r = sqrt(xco*xco+yco*yco);
        return Polar(r,a);
    }
}