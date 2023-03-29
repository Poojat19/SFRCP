package com.example.mysfrcp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DatabaseReference;

public class RegisterActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button register;
    private TextView txt_login;

//    private FirebaseAuth auth;
//    private DatabaseReference reference;
    private ProgressDialog pd;

    private TextView usernameStatus;
    private Button usernameCheck;

    private static int usernameFlag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        email = findViewById(R.id.email);
//        password = findViewById(R.id.password);
//        register = findViewById(R.id.register);
//
////        auth = FirebaseAuth.getInstance();
//
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String str_email = email.getText().toString();
//                String str_password = password.getText().toString();
//
//                if (TextUtils.isEmpty(str_email) || TextUtils.isEmpty(str_password)) {
//                    Toast.makeText(RegisterActivity.this, "Empty credentials!", Toast.LENGTH_SHORT).show();
//                } else if (str_password.length() < 6) {
//                    Toast.makeText(RegisterActivity.this, "Password too short!", Toast.LENGTH_SHORT).show();
//                } else {
//                    registerUser(str_email, str_password);
//                }
//            }
//        });
//        void registerUser(String email, String password){
//            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if(task.isSuccessfu()){
//                        Toast.makeText(RegisterActivity.this, "Register successful", Toast.LENGTH_SHORT).show();
//                    }
//                    else{
//                        Toast.makeText(RegisterActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//        }

    }
}
