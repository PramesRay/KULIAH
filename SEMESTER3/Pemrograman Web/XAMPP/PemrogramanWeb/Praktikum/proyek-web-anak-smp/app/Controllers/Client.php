<?php
namespace App\Controllers;

use App\Controllers\BaseController;
use App\Models\Client as ClientModel;
use App\Models\Ticket as TicketModel;


class Client extends BaseController
{
    public function index() {
        return view('index');
    }

    public function show_db()
    {
        $modelIdentity = new ClientModel();
        $modelTicket = new TicketModel();
        $data = [
            'clients' => $modelIdentity->getClient(),
            'tickets' => $modelTicket->getTicket(),
        ];
        return view('show_db',$data);
    }
    public function show_tiket()
    {
        $modelTicket = new TicketModel();
        $data = [
            'tickets' => $modelTicket->getTicket(),
        ];
        return view('show_tiket',$data);
    }

    public function regis() {
        return view('regis1');
    }

    public function save1() {
        $modelIdentity = new ClientModel();
        
        $dataIdentity = [
            'NPM'       => $this->request->getPost('NPM'), 
            'NAMA'      => $this->request->getPost('NAMA'), 
            'ALAMAT'    => $this->request->getPost('ALAMAT'), 
            'JK'        => $this->request->getPost('JK'), 
            'TGL_LHR'   => $this->request->getPost('TGL_LHR'), 
            'EMAIL'     => $this->request->getPost('EMAIL'), 
        ];
        $modelIdentity->saveClient($dataIdentity);

        $data = [
            'clients' => $modelIdentity->getClient()
        ];

        return view('regis2', $data);
    }
    
    public function save2() {
        $modelTicket = new TicketModel();
        $dataTicket = [
            'KATEGORI'  => $this->request->getPost('KATEGORI'), 
            'LOMBA'     => $this->request->getPost('LOMBA'), 
            'NPM'       => $this->request->getPost('NPM') ,
        ];
        $modelTicket->saveTicket($dataTicket);
        return redirect()->to('/');
    }

    // public function edit($id) {
    //     $model = new ClientModel();
    //     $data = [
    //         'client' => $model->getClient($id),
    //     ];
    //     return view('edit',$data);
    // }

    // public function update($id) {
    //     $model = new ClientModel();
    //     $data = [
    //         'NAMA'      => $this->request->getPost('NAMA'), 
    //         'ALAMAT'    => $this->request->getPost('ALAMAT'), 
    //         'JK'        => $this->request->getPost('JK'), 
    //         'TGL_LHR'   => $this->request->getPost('TGL_LHR'), 
    //         'EMAIL'     => $this->request->getPost('EMAIL'), 
    //     ];
    //     $model->updateClient($id, $data);
    //     return redirect()->to('/');
    // }

    // public function delete($id) {
    //     $model = new ClientModel();
    //     $model->deleteClient($id);
    //     return redirect()->to('/');
    // }
    
    public function about(){
        return view('about');
    }
    public function detail(){
        return view('detail');
    }
}
