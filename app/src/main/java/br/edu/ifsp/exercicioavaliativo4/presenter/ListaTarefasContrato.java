package br.edu.ifsp.exercicioavaliativo4.presenter;

import java.util.List;

import br.edu.ifsp.exercicioavaliativo4.model.Tarefa;

public interface ListaTarefasContrato {

    interface ListaTarefasView{
        void listarTarefas(List<Tarefa> listaTarefas);

    }

    interface ListaTarefasPresenter{
        void setView(ListaTarefasView view);
        void getTarefas();
    }


}
