#include<iostream>
#include<fstream>
using namespace std;

//for writing to file
// int main(){
//     ofstream onFile;
//     onFile.open("file.txt");
//     onFile<<"Thank U so much :>";
//     cout<<"data written";
//     onFile.close();
// }

//for reading from file
// int main(){
//     string str;
//     ifstream inFile;
//     inFile.open("file.txt");
//     while(getline(inFile, str)){
//         cout<<str;
//     }
    
//     inFile.close();
// }

// copying data of one file from other file
// int main(){
//     char str;
//     ifstream inFile;
//     ofstream onFile;
//     inFile.open("file.txt");
//     onFile.open("file2.txt");
//     while(inFile.get(str)){
//         onFile.put(str);
//     }
//     cout<<"copied"<<endl;
    
//     inFile.close();
//     onFile.close();
// }

//delete file
int main(){
    int value = remove("file2.txt");
    if(value == 0){
        cout<<"File deleted!";

    }else{
        cout<<"File not deleted";  
    }
    return 0;
}


