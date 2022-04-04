package com.assignment7;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class DemoQLSP {
    public TextField ten,gia,donvi,soluong;
    public Text loi;
    public void xemsp() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("listsp.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
    public void nhaptt(){
        try {
            NhapTT ntt = new NhapTT(ten.getText(), Float.parseFloat(gia.getText()),donvi.getText(),Integer.parseInt(soluong.getText()));
            Main.nttList.add(ntt);
            loi.setVisible(false);
        }
        catch (Exception e){
            loi.setText(e.getMessage());
            loi.setVisible(true);
        }
    }
}
