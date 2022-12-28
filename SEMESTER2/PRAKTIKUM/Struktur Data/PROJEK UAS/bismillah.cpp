#include <iostream>
#include <fstream>
#include <string>
using namespace std;

char menu()
{
    char option;
    system("cls");
    cout << "===============================" << endl
         << "          JUDUL EVENT          " << endl
         << "===============================" << endl
         << "1. Registrasi \n"
         << "2. Detail Event \n"
         << "3. About Us \n"
         << "===============================" << endl
         << endl;
    cin >> option;
    cin.ignore();
    return option;
}

void regist(string &nama, string &email, string &cabang, int &nomor)
{
    system("cls");
    cout << "                            REGISTRATION                            " << endl
         << "====================================================================" << endl
         << "*Cabang Lomba dapat diakses di menu Detail Event                  \n" << endl;
    cout << "Email           : "; getline(cin, email);
    cout << "Cabang diminati : "; getline(cin, cabang);
    cout << "====================================================================" << endl;

    // Untuk nyimpen inputan user ke dalam file .txt
    ofstream myFile;
    myFile.open("daftar_peserta.txt", ios::app);
    myFile << "| " << nomor << "\t\t | " << nama << "\t\t\t | " << email << "\t\t\t | " << cabang << "\t\t |" << endl;
    myFile.close();

    cout << "Pendaftaran Selesai Dilakukan!" << endl << endl;
}

void detail()
{
    system("cls");
    cout << "            DETAIL EVENT               " << endl
         << "=======================================" << endl
         << "____ \n"
         << "TIME & PLACE \n\n"

         << "..:.. ... \n\n"

         << "_____ \n"
         << "THEME EVENT \n\n"

         << "... \n\n"

         << "____ \n"
         << "TIMELINE \n\n"

         << "... = ... \n"
         << "... = ... \n"
         << "... = ...\n"
         << "... = ...\n\n"

         << "____ \n"
         << "GUEST STAR \n\n"

         << "... \n"
         << "... \n\n"

         << "____ \n"
         << "CABANG LOMBA \n\n"

         << "... \n"
         << "... \n"
         << "... \n"
         << "... \n\n"

         << "=======================================" << endl
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

         << "... ... ... ... ... \n"
         << "... ... ... ... ... \n"
         << "... ... ... ... ... \n\n"

         << "______ \n"
         << "MANFAAT & TUJUAN \n\n"

         << "... ... ...\n"
         << "... ... ...\n\n"

         << "______ \n"
         << "CONTACT PERSON \n\n"

         << "... ... \n\n"
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
    string nama, email, cabang;
    int nomor;
    bool start = true;
    while (start)
    {
        char option = menu();
        switch (option)
        {
        case '1':
            regist(nama, email, cabang, nomor);
            break;
        case '2':
            detail();
            break;
        case '3':
            about();
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