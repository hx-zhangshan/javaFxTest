package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class FormMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //设置运用哪个主题
        setUserAgentStylesheet(STYLESHEET_MODENA);
        //运用GridPane 创建表单布局
        GridPane gridPane=new GridPane();
        //设置 居中对齐
        gridPane.setAlignment(Pos.CENTER);
        //设置行间距 列间距
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        //运用lable，text，textfield
        Text text=new Text("Welcome");
        text.setId("welcome-text");
//        text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(text,0,0,2,1);

        Label label1=new Label();
        label1.setText("userName");
        gridPane.add(label1,0,1);

        TextField userField=new TextField();
        gridPane.add(userField,1,1);

        Label label2=new Label();
        label2.setText("Email");
        gridPane.add(label2,0,2);
        PasswordField emailField=new PasswordField();
        gridPane.add(emailField,1,2);

        //创建注册的按钮
        Button bt=new Button("Sign in");
        HBox hb=new HBox(10);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(bt);
        gridPane.add(hb,1,4);

        Text show=new Text();
        gridPane.add(show,1,6);
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                show.setFill(Color.FIREBRICK);
                show.setText("sign in yuzhiqiang shabi");
            }
});
        Scene scene=new Scene(gridPane,300,250);
        scene.getStylesheets().add(FormMain.class.getResource("../formMain.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
