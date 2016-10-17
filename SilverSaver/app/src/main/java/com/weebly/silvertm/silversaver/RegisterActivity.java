package com.weebly.silvertm.silversaver;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btnRegistrar_click(View view) {
        //construindo a classe
        User user = new User();
        EditText txt;

        txt = (EditText) findViewById(R.id.txtRegNome);
        user.setNome(txt.getText().toString());
        txt = (EditText) findViewById(R.id.txtRegEmail);
        user.setEmail(txt.getText().toString());
        txt = (EditText) findViewById(R.id.txtRegSenha);
        user.setSenha(txt.getText().toString());

        //chamaria o DAO

        //MessageBox
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("Esse e o usuario que esta sendo cadastrado:\n"+user.getEmail().toString()+"\n"+user.getNome().toString()+"\n"+user.getSenha().toString()+"\n");
        dlgAlert.setTitle("Cadastro");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}
