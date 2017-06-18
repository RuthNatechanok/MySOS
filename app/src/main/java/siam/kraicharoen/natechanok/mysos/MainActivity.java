package siam.kraicharoen.natechanok.mysos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Explicit คือการประกาศตัวแปร
    private EditText userEditText, passwordEditiText;
    private TextView textView;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial View
        initialView();

        //TextView Controller ทำให้textviewสามารถคลิกได้
        textViewController();



    }   //Mathod Main นี่คือแมทตอดหลัก

    private void textViewController() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent to NewregisterActivity ลิงค์ไปหน้าสมัครสมาชิก
                Intent intent = new Intent(MainActivity.this,NewRegisterActivity.class);
                startActivity(intent);



            }
        });
    }

    private void initialView() {


        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditiText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }
}   //Main Class    นี่คือคลาสหลัก
