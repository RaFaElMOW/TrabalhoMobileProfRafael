package com.example.babycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewCadastroResponsavel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cadastro_responsavel);

        Button cancelar = (Button) findViewById(R.id.btnCancelar);
        Button cadastrar = (Button) findViewById(R.id.btnEfetuarCadastro);

        cancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                Intent it = new Intent(ViewCadastroResponsavel.this, ViewCadastroCrianca.class);
                startActivity(it);
            }
        });
    }
}
