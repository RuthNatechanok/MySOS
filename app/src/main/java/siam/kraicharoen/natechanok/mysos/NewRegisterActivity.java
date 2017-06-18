package siam.kraicharoen.natechanok.mysos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewRegisterActivity extends AppCompatActivity {
    //Explicit
    private ImageView imageView;
    private EditText nameEditText,userEditText, passEditText;
    private Button button;
    private String nameString,userString, passString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_register);

         //Initial View
        initialView();

         //Back Controller
        backController();

         //NewRegister Controler
        newRegisterController();

    }

    private void newRegisterController() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //Get Value From Edit Textดึงค่าจาดEditextเป็นSring
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();


                  //Check Space
                if (nameString.equals("") || userString.equals("")||passString.equals("")) {
                     //have space
                    MyAlert myAlert = new MyAlert(NewRegisterActivity.this);
                    myAlert.myDialog("Have Space","กรุณากรอกข้อมูลให้ครบ");
                } else {
                     //no space
                }
            }
        });
    }

    private void backController() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initialView() {
        imageView = (ImageView) findViewById(R.id.btnBack);
        nameEditText = (EditText) findViewById(R.id.edtName);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passEditText = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnNewRegister);
    }

    //Main Method
}
 //Main Calss
