/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terserahsaya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Yusuf
 */
public class FXMLDocumentLoundryController implements Initializable {

    @FXML
    private Button Oke;
    @FXML
    private Button hps;
    @FXML
    private RadioButton KeringSetrika;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton Setrika;
    @FXML
    private RadioButton Kering;
    @FXML
    private TextField Nama;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Berat;
    @FXML
    private TextField Nomer;
    @FXML
    private TextField Tanggal;
    @FXML
    private TextArea Hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void proses(ActionEvent event) {
     String paket;
     int harga = 0;
     
     
     if(Kering.isSelected())
       paket = "Cucian Kering";
     else if(KeringSetrika.isSelected())
            paket = "Cucian Kering Setrika";
     else if(Setrika.isSelected())
         paket = "Setrika";
     else
         paket ="";
     
     if (!(Kering.isSelected() || KeringSetrika.isSelected() || Setrika.isSelected() )){

         JOptionPane.showMessageDialog(null, "Harap Tenang, Anda Belum Menilih Jenis Londry");
     }
     else {
         String nama= Nama.getText();
         String alamat= Alamat.getText();
        String  berat = Berat.getText()+" KG";
         String tanggal = Tanggal.getText();
         String nohp = Nomer.getText();
         
         int hitung = Integer.parseInt(Berat.getText());
         
         if (Kering.isSelected())
             harga = hitung*5000;
         else if (KeringSetrika.isSelected())
             harga = hitung * 8000;
         else if(Setrika.isSelected()) 
               harga = hitung *4000;
         
        Hasil.setText("\nNama = "+ nama +"\nAlamat = "+ alamat +"\nNomer = "+ nohp +"\npaket = "+paket+"\nBerat = "
                +berat+"kg"+"\n Tanggal Ambil = "+ tanggal+"\nharga = "+harga);             
        
     } 
     
    }
    
     
   

    @FXML
    private void Hapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Alamat.setText("");
        Berat.setText("");
        Nomer.setText("");
        Tanggal.setText("");
       
    }
}
    

