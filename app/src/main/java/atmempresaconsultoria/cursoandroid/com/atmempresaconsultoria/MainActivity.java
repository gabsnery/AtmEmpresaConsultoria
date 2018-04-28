package atmempresaconsultoria.cursoandroid.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {
    ImageView botaoServico;
    ImageView botaoCliente;
    ImageView botaoContato;
    ImageView botaoEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoServico = findViewById(R.id.servicoId);
        botaoCliente = findViewById(R.id.clienteId);
        botaoContato = findViewById(R.id.contatoId);
        botaoEmpresa = findViewById(R.id.empresaId);

        botaoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ServicoActivity.class));
            }
        });
        botaoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ClienteActivity.class));
            }
        });
        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ContatoActivity.class));
            }
        });
        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ActivityEmpresa.class));
            }
        });
    }
}
