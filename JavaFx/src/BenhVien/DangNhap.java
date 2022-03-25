package BenhVien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class DangNhap {

    @FXML
    private TextField txtDn;

    @FXML
    private PasswordField txtMk;

    @FXML
    void DangNhap(ActionEvent event) throws IOException, InterruptedException {

        try{
            String tk="Vietanh",mk="1";
            boolean flag=false;

            if(txtDn.getText().equals(tk) && txtMk.getText().equals(mk)){
                    flag=true;
            }

            Alert alert=new Alert(Alert.AlertType.INFORMATION);
//            Kiểm tra thông tin
            if(flag==true){
                Stage close1=(Stage) txtDn.getScene().getWindow();
                close1.close();

                Parent root= FXMLLoader.load(getClass().getResource("QLBA.fxml"));
                Stage stage =new Stage();
                stage.setTitle("Điền thông tin");
                stage.setScene(new Scene(root));
                stage.show();
            }
            else{
                alert.setContentText("Tên đăng nhập hoặc mật khẩu không đúng");
                alert.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
