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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

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
    
    private int pAct=0;
    private int idCanvas=0;
    private int start=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
}
