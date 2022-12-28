#include <iostream>
#include <fstream>
#include <string>
using namespace std;

const int banyakPertanyaan = 3;

string pertanyaan[banyakPertanyaan]{"Dari rating 1-10 berapa rating kamu untuk acara COIN X INSTAGRAM?", "Apa kesan kamu terhadap acara COIN X INSTAGTRAM", "Apa saran kamu untuk acara COIN X INSTAGRAM tahun depan?"};
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

struct treeNode
{
    int npm;
    string nama;
    treeNode *Left;
    treeNode *Right;
};
using pointerTree = treeNode*;
using Tree = pointerTree;

void createNodeTree(pointerTree &New, int npm, string nama)
{
    New = new treeNode;
    New->Left = nullptr;
    New->npm = npm;
    New->nama = nama;
    New->Right = nullptr;
}

void insertBST(Tree &root, pointerTree New)
{
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
        insertBST(root->Right, New);
    }
}

string cariNamaMhs(Tree &root, int npm)
{
    if (root != nullptr)
    {
        if (root->npm == npm)
        {
            return root->nama;
        }
        if (root->npm < npm)
        {
            return cariNamaMhs(root->Right, npm);
        }
        else
        {
            return cariNamaMhs(root->Left, npm);
        }
    }
    return "noName";
}

void createDataMhs(Tree &root, pointerTree New)
{
    for (int i = 0; i < 70; i++)
    {
        createNodeTree(New, dataNpm[i], dataNama[i]);
        insertBST(root, New);
    }
}

struct ElemenQueue
{
    string pertanyaan;
    ElemenQueue *next;
};
typedef ElemenQueue *pointer;
typedef pointer List;

struct Queue
{
    List Head;
    List Tail;
};
Queue Q;

void createQueue(Queue &Q)
{
    Q.Head = NULL;
    Q.Tail = NULL;
}

void createElement(pointer &pBaru, string pertanyaan)
{
    pBaru = new ElemenQueue;
    pBaru->pertanyaan = pertanyaan;
    pBaru->next = NULL;
}

void insertQueue(Queue &Q, pointer pBaru)
{
    if (Q.Head == NULL && Q.Tail == NULL)
    {
        Q.Head = pBaru;
        Q.Tail = pBaru;
    }
    else
    {
        pointer temp = Q.Head;
        Q.Head = pBaru;
        Q.Head->next = temp;
    }
}

void createSoal(Queue &Q, pointer pBaru)
{
    for (int i = 3; i >= 0; i--)
    {
        createElement(pBaru, pertanyaan[i]);
        insertQueue(Q, pBaru);
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
        cout << "\nNama\t: ";
        getline(cin, nama);
        cout << "NPM\t: ";
        cin >> npm;

        do
        {
            if (nama == dataNama[npm - 1])
            {
                cout << "Login Berhasil!";
                loop = 4;
                break;
            }
            else if (cariNamaMhs(root, npm) == "noName")
            {
                cout << "NPM tidak terdaftar! Harap hubungi Admin!!";
                break;
            }
            else
            {
                cout << "Login Gagal! |" << loop << "x|" << endl;
                break;
            }

            npm++;

        } while (npm <= 60);
        loop++;

    } while (loop <= 3);
}

char menu()
{
    char option;
    system("cls");
    cout << "===============================" << endl
         << "        COIN X INSTAGRAM       " << endl
         << "===============================" << endl
         << "1. Registrasi \n"
         << "2. Detail Event \n"
         << "3. About Us \n"
         << "4. Daftar Peserta \n"
         << "5. Feedback (After Event) \n"
         << "===============================" << endl
         << endl;
    cin >> option;
    cin.ignore();
    return option;
}

void bookTicket(string &nama, int &npm, string &email, string &lomba)
{
    system("cls");
    cout << "________________________" << endl
         << "                            REGISTRATION                            " << endl
         << "====================================================================" << endl
         << "Note            : - Cabang Lomba dapat diakses di menu Detail Event \n"
         << endl;
    cout << "Nama Panggilan  : ";
    cin >> nama;
    cin.ignore();
    cout << "6 Digit NPM     : ";
    cin >> npm;
    cin.ignore();
    cout << "Alamat Email    : ";
    getline(cin, email);
    cout << "Kode Lomba      : ";
    getline(cin, lomba);
    cout << "====================================================================" << endl;

    ofstream myFile;
    myFile.open("daftar_peserta.txt", ios::app);
    myFile << nama << " " << npm << " " << email << " " << lomba << endl;
    myFile.close();

    cout << "Pendaftaran Selesai Dilakukan!" << endl
         << endl;
}

void daftarPeserta()
{
    system("cls");
    ifstream myFile;
    string output, buffer;
    bool isData = false;
    string nama, email, lomba;
    int npm;

    myFile.open("daftar_peserta.txt");
    int jumlah = 0;
    int no = 1;
    while (!myFile.eof())
    {
        myFile >> nama;
        myFile >> npm;
        myFile >> email;
        myFile >> lomba;

        cout << "| " << no << " | " << nama << " \t| " << npm << " \t\t| "
             << email << " \t| " << lomba << " |" << endl;
        jumlah++;
        no++;
    }
    cout << "JUMLAH PESERTA = " << jumlah << endl;
}

void feedback(Queue Q)
{
    pointer pBaru;
    string pertanyaan;
    createQueue(Q);
    createSoal(Q, pBaru);
    string feedback1, feedback2, feedback3, nama;

    if (Q.Head == NULL)
    {
        cout << "\nPertanyaan kosong!" << endl;
    }
    else
    {
        cout << Q.Head->pertanyaan << endl;
        getline(cin, feedback1);

        cout << Q.Head->next->pertanyaan << endl;
        getline(cin, feedback2);

        cout << Q.Head->next->next->pertanyaan << endl;
        getline(cin, feedback3);

        ofstream myFile;
        myFile.open("feedback.txt", ios::app);
        myFile << "Rating = " << feedback1 << ". Kesan = " << feedback2 << ". Saran = " << feedback3 << endl;
        myFile.close();

        cout << "Terimakasih Telah Mengikuti Acara COIN X INSTAGRAM" << endl
             << endl;
    }
}

void detail()
{
    system("cls");
    cout << "_________________" << endl
         << "                DETAIL EVENT                   " << endl
         << "===============================================" << endl

         << "Event tahunan TI UNPAD yang diselenggarakan \n"
         << "oleh HIMATIF yang didalamnya terdapat banyak \n"
         << "lomba menarik yang bisa diikuti oleh mahasiswa/i\n"
         << "TI UNPAD \n\n"

         << "____ \n"
         << "TIME & PLACE \n\n"
         << "15:00 - 21:00 ONLINE \n\n"

         << "____ \n"
         << "TIMELINE \n\n"
         << "Pendaftaran       = 23 Mei 2022 - 29 Mei 2022 \n"
         << "Technical Meeting = 2 Juni 2022 \n"
         << "Match             = 3 Juni 2022 - 10 Juni 2022\n\n"

         << "____ \n"
         << "CABANG LOMBA \n\n"
         << "Band (BND) \nFotografi (FTG) \nSolo Vocal (VCL) \n"
         << "Mobile Legend (ML) \nCounter Strike (CS) \nDota 2 (DT) \nPUBG Mobile (PUB) \n"
         << "Valorant (VAL) \nCatur Online (CTR) \n\n"

         << "_ \n"
         << "FEE \n\n"
         << "Free (Mahasiswa TI UNPAD)\n\n"

         << "===============================================" << endl
         << endl;
}

void about()
{
    system("cls");
    cout << "_______________" << endl
         << "                  ABOUT US                   " << endl
         << "=============================================" << endl
         << "______ \n"
         << "LATAR BELAKANG \n\n"

         << "Perkembangan dunia olahraga ini pada umumnya \n"
         << "telah mengalami perkembangan pada beberapa \n"
         << "tahun terakhir ini yang cukup memuaskan. \n"
         << "Potensi-potensi muda telah bermunculan seiring \n"
         << "dengan perkembangan dunia olahraga, hal ini \n"
         << "tidak lepas dari peran serta dari beberapa pihak \n"
         << "yang memberikan support dan ruang kepada para \n"
         << "mahasiswa untuk mengaktualkan kreativitas dan \n"
         << "sportivitas mereka dalam sebuah tournament \n"
         << "atau kompetisi.\n\n"

         << "______ \n"
         << "MANFAAT & TUJUAN \n\n"

         << "MANFAAT :\n"
         << "-Menjadi wadah berkompetisi secara sehat\n"
         << "-Dapat menjalin silaturahmi antar warga TI UNPAD\n"
         << "TUJUAN :\n"
         << "-Menumbuhkan kerjasama antar warga TI UNPAD\n"
         << "-Menunjukkan mekanik siapa yg lebih oke\n\n"

         << "______ \n"
         << "CONTACT PERSON \n\n"

         << "-bedul (WA : 0812345678)(LINE : bedulganteng) \n\n"
         << "=============================================" << endl
         << endl;
}

void program()
{
    cout << "---------------------------------------------------- " << endl
         << " Apakah masih ingin melanjutkan memakai program?(y)  " << endl
         << "---------------------------------------------------- " << endl;
}

int main()
{
    char option, lanjut;
    string nama, email, lomba;
    int npm;
    Queue Q;
    Tree root;
    pointerTree New;
    bool start = true;

    login(root);
    
    while (start)
    {
        char option = menu();
        switch (option)
        {
        case '1':
            bookTicket(nama, npm, email, lomba);
            break;
        case '2':
            detail();
            break;
        case '3':
            about();
            break;
        case '4':
            daftarPeserta();
            break;
        case '5':
            feedback(Q);
            break;
        default:
            break;
        }

        program();
        cin >> lanjut;
        cin.ignore();
        if (lanjut == 'y')
        {
            cout << endl;
            start = true;
        }
        else
        {
            start = false;
        }
    }
}