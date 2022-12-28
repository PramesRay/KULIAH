#include <iostream>
#include <string>

using namespace std;

string dataNama[70]{"Oriex Mawan Junnior", "Elang Al Majid", "Muhammad Ikhsan Fadhilah", "Rizky Ramadhan Sudjarmono", 
                    "Aliya Rahmania", "Glory Cornelia Patining Kurik", "Felicia Natania Lingga", "Nabila Sa'diyyah Ahmadi", 
                    "Ardes Zubka Putra", "Muhammad Dzikri Alfian Zahir", "Chienta Fleury Mahathereysa", "Aryan Dafi Maulana", 
                    "Muhammad Giat", "", "Amir Salim", "Frederick James Prakoso", "Adinda Salsabila", 
                    "Luthfi Ramadhan Yudiansyah", "Raditya Muhamad Lacavi", "Devina Dixie", "Mohammad Zidan Yohanza", "", "",
                    "David Wijaya", "Shafira Ramadhina Adifa", "Guntur Eka Putra", "", "Ken Almayda Fathurrahman", 
                    "Rifqi Muhadzib Ahdan", "Chairal Octavyanz Tanjung", "", "Dandy Erlangga Aryaputra", "Mohammad Sulaeman", 
                    "Musaddad", "Aliya Sania", "Dheary Zikri Muhammad", "Qurrota Ayuni Qamra Ariva", "", 
                    "Ibrahim Dafi Iskandar", "Raihan Muhammad Fuad Amin", "Muhammad Fauzan Azhiima", "Dhifan Fadhilah Aditya", 
                    "", "", "", "Fakhri Fajar Ramadhan", "Alifian Latif Muksit", "Akmal Azzary Megaputra", 
                    "Lazia Firli Adlisnandar", "Hudzaifah Al Mutaz", "Satria Alief Putra Hidayat", "Muhammad Rakha Al Rovi", 
                    "Hermanu Widyatama", "Shanzelig Putra Wijaya", "Varian Avila Faldi", "Daffa Yusranizar Arrifi", 
                    "Rakha Farras Maulana", "Muhammad Naufal Nur Ramadhan", "Prames Ray Lapian", "Gilman Nahdi Al-Fathir", "", 
                    "Ahmad Yazid Ghossani", "Sarah Khairunnisa Prihantoro", "Zakia Noorardini", "Sultan Ali Ilyasa", "Raffanisa Kamila Zikri", 
                    "Bintang Arya Pramudya", "Andrew Orisar Boekorsyom"};
int dataNpm[70]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60};

struct treeNode{
    int npm;
    string nama;
    treeNode *Left;
    treeNode *Right;
};

using pointerTree = treeNode*;
using Tree  = pointerTree;

void createNodeTree(pointerTree& New, int npm, string nama){
    New = new treeNode;
    New->Left = nullptr;
    New->npm = npm;
    New->nama = nama;
    New->Right = nullptr;
}

void insertBST(Tree& root,pointerTree New){
    if (root == nullptr)
    {
        root = New;
    }
    else if (New->npm < root->npm)
    {
        insertBST(root->Left, New);
    }
    else 
    {
        insertBST(root->Right,New);
    }
}

string cariNamaMhs(Tree& root, int npm){
    if(root != nullptr){
        if(root->npm == npm){
            return root->nama;
        }
        if(root->npm < npm){
            return cariNamaMhs(root->Right,npm);
        }else {
            return cariNamaMhs(root->Left,npm);
        }
    }
    return "noName";
}

void createDataMhs(Tree& root,pointerTree New){
    for(int i=0;i<70;i++){
        createNodeTree(New,dataNpm[i],dataNama[i]);
        insertBST(root,New);
    }
}


void login(Tree root)
{
    pointerTree New;
    string nama;
    int npm = 0, loop = 0;

    do
    {
        cout << "*Gunakan Nama yang sesuai dengan Himatif Apps!" << endl; 
        cout << "\nNama\t: "; getline(cin, nama);
        cout << "NPM\t: "; cin >> npm;


        do
        {
            if (nama == dataNama[npm-1])
            {
                cout <<"Login Berhasil!";
                loop = 4;
                break;
            }
            else if(cariNamaMhs(root, npm)=="noName")
            {
                cout<<"NPM tidak terdaftar! Harap hubungi Admin!!";
                break;
            }
            else 
            {
                cout << "Login Gagal! |" << loop << "x|" << endl;
                break;
            }
            
            npm ++;

        } while(npm <= 60);        
        loop++;

    } while(loop <= 3);        
}

int main()
{
    Tree root;
    pointerTree New;

    createDataMhs(root, New);
    login(root);
}