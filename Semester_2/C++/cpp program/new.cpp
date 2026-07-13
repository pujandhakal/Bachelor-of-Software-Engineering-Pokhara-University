#include<iostream>
#include<string.h>
using namespace std;

class Person{
    private:
    char name[20];
    int code;

    public:
    Person(char n[], int c){
        strcpy(name, n);
        code = c;
    }
    void display(){
        cout<<"Name="<<name<<endl;
        cout<<"Code="<<code<<endl;

    }
};

class Account: virtual public Person{
    private:
    float salary;

    public:
    Account(char n[], int c, float s): Person(n, c){
        salary = s;
    }

    void display(){
        cout<<"Salary = "<<salary<<endl;
    }
};

class Admin: virtual public Person{
    private:
    int year;

    public:
    Admin(char n[], int c, int y):Person(n,c){
        year = y;
    }
    void display(){
        cout<<"No. of experience year = "<<year<<endl;
    }
};

class Record: public Account, public Admin{
    private:
    int recno;
    
    public:
    Record(char n[], int c, float s, int y, int r):Account(n, c,s), Admin(n, c, y), Person(n, c){
        recno =r;
    }
    void display(){
        cout<<"Record no = "<<recno<<endl;
    }
};

int main(){
    char name[20];
    int code, year, recno;
    float salary;
    cout<<"Enter person name and code"<<endl;
    cin>>name>>code;
    cout<<"Enter salary"<<endl;
    cin>>salary;
    cout<<"Enter number of year of experience"<<endl;
    cin>>year;
    cout<<"Enter Record no"<<endl;
    cin>>recno;
    Record r1(name, code, salary, year, recno);
    r1.Person::display();
    r1.Account::display();
    r1.Admin::display();
    r1.display();
    return 0;
}