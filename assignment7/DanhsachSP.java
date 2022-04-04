package com.assignment7;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DanhsachSP  implements Initializable {
    public TableView<NhapTT> nSP;
    public TableColumn<NhapTT, String> nTen;
    public TableColumn<NhapTT, Float> nGiatien;
    public TableColumn<NhapTT, String> nDonvi;
    public TableColumn<NhapTT, Integer> nSoluong;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nTen.setCellValueFactory(new PropertyValueFactory<NhapTT, String>("ten"));
        nGiatien.setCellValueFactory(new PropertyValueFactory<NhapTT, Float>("gia"));
        nDonvi.setCellValueFactory(new PropertyValueFactory<NhapTT, String>("donvi"));
        nSoluong.setCellValueFactory(new PropertyValueFactory<NhapTT, Integer>("soluong"));
        nSP.setItems(Main.nttList);
    }

    public void qldsspScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("qldssp.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
