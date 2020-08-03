/*
 * Copyright (C) 2020 fapm1
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package proyectocdt;

import animatefx.animation.*;
import com.sun.javafx.font.FontFactory;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Grupo 1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    AnchorPane base;
    @FXML
    AnchorPane baseCanvas;
    @FXML
    AnchorPane dp11;
    @FXML
    AnchorPane dp12;
    @FXML
    AnchorPane dp21;
    @FXML
    AnchorPane dp22;
    @FXML
    AnchorPane dp31;
    @FXML
    AnchorPane dp32;
    @FXML
    AnchorPane dp41;
    @FXML
    AnchorPane dp42;
    @FXML
    AnchorPane dp51;
    @FXML
    AnchorPane dp52;
    @FXML
    Canvas canvas;
    @FXML
    Button chars;
    @FXML
    Button text;
    @FXML
    Button control;
    @FXML
    Button help;
    @FXML
    Button change;
    @FXML
    Button fda;
    @FXML
    Button fdc;
    @FXML
    Button cda;
    @FXML
    Button cdc;
    @FXML
    Button csa;
    @FXML
    Button csc;
    @FXML
    Button tp;
    @FXML
    Button rotar;
    @FXML
    Button trasladar;
    @FXML
    Button reverse;
    @FXML
    Button controlPoints;
    @FXML
    AnchorPane charsdp;
    @FXML
    AnchorPane textdp;
    @FXML
    AnchorPane controldp;
    @FXML
    AnchorPane helpdp;
    @FXML
    Text objetivo;
    @FXML 
    TextField textoEntrada;
    @FXML 
    TextField grados;
    @FXML
    TextField userXY;
    @FXML
    TextField textoAntiguo = new TextField();
    @FXML
    TextField textoNuevo = new TextField();
    
    private int pAct=0;
    private int idCanvas=0;
    private int start=0;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        Font plumon = Font.loadFont(FXMLDocumentController.class.getResource("Michella Garden.otf").toExternalForm(), 36);        
        objetivo.setFont(plumon);        
    }   
    
    public void changeCanvas(){
        if (this.idCanvas==0){
            this.baseCanvas.setStyle("-fx-background-image: url('style/maybe.png')");
            this.idCanvas=1;
        }
        else{
            this.baseCanvas.setStyle("-fx-background-color: white");
            this.idCanvas=0;
        }
    }
    
    @FXML
    public void showChars(){
        SlideOutDown animation = null;
        if (this.pAct==2){
            animation = new SlideOutDown(this.textdp);
            animation.play();
        }
        if (this.pAct==3){
            animation = new SlideOutDown(this.controldp);
            animation.play();
        }
        if (this.pAct==4){
             animation = new SlideOutDown(this.helpdp);
             animation.play();
        }
        new SlideInUp(this.charsdp).play();
        this.charsdp.setVisible(true);
        this.pAct=1;

    }
    
    @FXML
    public void showText(){
        SlideOutDown animation = null;
        if (this.pAct==1){
             animation = new SlideOutDown(this.charsdp);
             animation.play();
        }
        if (this.pAct==3){
             animation = new SlideOutDown(this.controldp);
             animation.play();
        }
        if (this.pAct==4){
             animation = new SlideOutDown(this.helpdp);
             animation.play();
        }
        new SlideInUp(this.textdp).play();
        this.textdp.setVisible(true);
        this.pAct=2;
    }
    
    @FXML
    public void showControl(){
        SlideOutDown animation = null;
        if (this.pAct==1){
             animation = new SlideOutDown(this.charsdp);
             animation.play();
        }
        if (this.pAct==2){
             animation = new SlideOutDown(this.textdp);
             animation.play();
        }
        if (this.pAct==4){
             animation = new SlideOutDown(this.helpdp);
             animation.play();
        }
        textoAntiguo.setText(textoEntrada.getText()); //Muestra texto de manera simultanea en el cuadro de texto "texto antiguo" en pestaña control
        new SlideInUp(this.controldp).play();
        this.controldp.setVisible(true);
        this.pAct=3;
    }
    
    @FXML
    public void showHelp(){
        SlideOutDown animation = null;
        if (this.pAct==1){
             animation = new SlideOutDown(this.charsdp);
             animation.play();
        }
        if (this.pAct==2){
             animation = new SlideOutDown(this.textdp);
             animation.play();
        }
        if (this.pAct==3){
             animation = new SlideOutDown(this.controldp);
             animation.play();
        }
        new SlideInUp(this.helpdp).play();
        this.helpdp.setVisible(true);
        this.pAct=4;
    }

    /**
    * Muestra el texto al mismo tiempo que se escribe en el campo de texto
    * @param event 
    */
    @FXML
    public void mostrarTextField(KeyEvent event){
       String txt = this.textoEntrada.getText(); //captura el texto que ingresa el usuario
       //this.canvas.getGraphicsContext2D().fillText(txt, pAct, pAct); //mostrar texto en vivo en canvas
       objetivo.setText(txt);
       textoNuevo.setText(invertirFrase(txt)); // si se escribe en la pestaña edicion, se actualiza en vivo la frase invertida en texto nuevo
       System.out.println(""+txt+""); //mostrar texto en vivo en consola
    }    

    @FXML
    public void cambiarColor(MouseEvent event){
        Font tiza = Font.loadFont(FXMLDocumentController.class.getResource("tiza.ttf").toExternalForm(), 36);
        Font plumon = Font.loadFont(FXMLDocumentController.class.getResource("Michella Garden.otf").toExternalForm(), 36);              
        if (this.objetivo.getFill()==Color.WHITE){
             this.objetivo.setFill(Color.BLACK);
             this.objetivo.setFont(plumon);  
        }else{
             objetivo.setFont(tiza);                
             objetivo.setFill(Color.WHITE);               
        }                   
    }
    
    @FXML
    public void rotar(MouseEvent event){   
        this.objetivo.setRotate(Double.parseDouble(grados.getText()));
    }
    
    @FXML
    public void trasladar(MouseEvent event){
        String[] coordenadas = userXY.getText().split(",");
        this.objetivo.setTranslateX(Integer.parseInt(coordenadas[0]));
        this.objetivo.setTranslateY(Integer.parseInt(coordenadas[1]));
    }
    /**
     * Muestra el texto ingresado en "texto antiguo" en vivo,
     * luego de invertirse y mostrandolo en "texto nuevo"
     * @param event 
     */
    @FXML
    public void mostrarTextoInvertido(KeyEvent event){
        String txt = textoAntiguo.getText();
        txt = invertirFrase(txt);
        textoNuevo.setText(txt);
    }
    /**
     * Al usar esta funcion acepta el cambio de invertir la frase
     * mostrandola en el canvas
     * @param event 
     */
    @FXML
    public void invertir(MouseEvent event){
        objetivo.setText(textoNuevo.getText());// cambia el texto mostrado
        /*  actualiza cuadros de texto luego de invertir
        hasta ahora el cuadro "texto" en edicion,"texto antiguo" y 
        "texto nuevo" en control    */
        String txt = textoAntiguo.getText();
        textoAntiguo.setText(textoNuevo.getText());
        textoNuevo.setText(txt);
        textoEntrada.setText(textoAntiguo.getText());
    }
    /**
     * cambia la ubicacion de las palabras ingresadas en la frase
     * de modo que quede invertida
     * @param s String que contiene la frase a invertir
     * @return 
     */
    private String invertirFrase(String s){
        String txt = s+' ';
        String frase = "";
        String palabra;
        int count = 0;
        // cuenta las palabras que hay separadas por un espacio ' '
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ') {
                count++;
            }
        }
        if (count > 1) {
            int fin;
            count--;
            // invierte el texto, guardandolo en el String "frase"
            for (int i = count; i >= 0; i--) {
                fin = txt.indexOf(' ')+1;
                palabra = txt.substring(0, fin);
                frase = palabra+frase;
                txt = txt.replaceFirst(palabra, "");
            }
            return frase.substring(0, frase.lastIndexOf(' '));
        }else{
            return txt.substring(0, txt.lastIndexOf(' '));
        }
    }
}
