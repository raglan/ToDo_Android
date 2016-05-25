package com.example.william.to_do;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by willi on 25/05/2016.
 */
public class NovaTarefaActivity extends AppCompatActivity{

    private TextView edtTitulo;
    private TextView edtDescricao;
    private DatePicker data;
    private TimePicker hora;
    private Button buttonOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa);


        edtTitulo = (TextView) findViewById(R.id.editTitulo);
        edtTitulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        edtDescricao = (TextView) findViewById(R.id.editDescricao);
        edtDescricao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        data = (DatePicker) findViewById(R.id.datePicker);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        hora = (TimePicker) findViewById(R.id.timePicker);
        hora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();

                String titulo = edtTitulo.getText().toString();
                String descricao = edtDescricao.getText().toString();

                it.putExtra("titulo", titulo);
                it.putExtra("descricao", descricao);

                setResult(RESULT_OK, it);

                finish();
            }
        });
    }


}
