package br.edu.ifsp.exercicioavaliativo4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.ifsp.exercicioavaliativo4.R;
import br.edu.ifsp.exercicioavaliativo4.model.Tarefa;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.ListaTarefasViewHolder> {

    private List<Tarefa> listaTarefas;

    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    @NonNull
    @Override
    public ListaTarefasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tarefa, parent, false );

        return new ListaTarefasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaTarefasViewHolder holder, int position) {
        holder.textTarefa.setText(listaTarefas.get(position).getDescricao());
    }

    @Override
    public int getItemCount() {
        return listaTarefas.size();
    }

    static class ListaTarefasViewHolder extends RecyclerView.ViewHolder {
        private TextView textTarefa;
        public ListaTarefasViewHolder(@NonNull View itemView) {
            super(itemView);

            textTarefa = itemView.findViewById(R.id.textViewTarefa);
        }
    }
}
