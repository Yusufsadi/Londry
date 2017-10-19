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
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Yusuf
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button Oke;

    @FXML
    private TextField Nama;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Alamat;

    @FXML
    private TextArea Hasil;
   
   @FXML
    void proses(ActionEvent event) {
    String nama, absen, alamat;
        nama= Nama.getText();
        absen= Absen.getText();
        alamat= Alamat.getText();
        
        Hasil.setText("Nama = "+nama+"\n Absen = "+absen+"\n Alamat = "+alamat);
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
