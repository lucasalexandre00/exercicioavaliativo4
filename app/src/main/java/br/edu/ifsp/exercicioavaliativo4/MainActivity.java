package br.edu.ifsp.exercicioavaliativo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import br.edu.ifsp.exercicioavaliativo4.adapter.TarefaAdapter;
import br.edu.ifsp.exercicioavaliativo4.model.Tarefa;
import br.edu.ifsp.exercicioavaliativo4.presenter.ListaTarefasContrato;
import br.edu.ifsp.exercicioavaliativo4.presenter.ListaTarefasPresenter;

public class MainActivity extends AppCompatActivity implements ListaTarefasContrato.ListaTarefasView {

    private RecyclerView recyclerViewTarefas;
    private TarefaAdapter tarefaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTarefas = findViewById(R.id.recyclerViewTarefasID);
        tarefaAdapter = new TarefaAdapter();

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);


        recyclerViewTarefas.setLayoutManager(linearLayoutManager);
        recyclerViewTarefas.setAdapter(tarefaAdapter);

        ListaTarefasContrato.ListaTarefasPresenter presenter = new ListaTarefasPresenter();
        presenter.getTarefas();

    }

    @Override
    public void listarTarefas(List<Tarefa> listaTarefas) {
        tarefaAdapter.setListaTarefas(listaTarefas);
    }

}