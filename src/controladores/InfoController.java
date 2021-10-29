/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author dape
 */
public class InfoController implements Initializable {
    

    @FXML
    private MenuItem menu_info;
    
    @FXML
    private Stage stage;
    
    
    @FXML
    private void onAction_Info(ActionEvent event) throws IOException {
        try{
            
        Stage secondStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/InfoFXML.fxml")); 
        Scene scene = new Scene(root);
        secondStage.setScene(scene);
        secondStage.setTitle("About - Darian Petre");
        secondStage.show();
        
        } catch (IOException e){
            System.out.println("No se puede abrir");
        }
        
    }
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
