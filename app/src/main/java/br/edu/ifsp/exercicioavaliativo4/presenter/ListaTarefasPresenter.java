package br.edu.ifsp.exercicioavaliativo4.presenter;

import java.util.List;

import br.edu.ifsp.exercicioavaliativo4.model.Tarefa;
import br.edu.ifsp.exercicioavaliativo4.repository.TarefaRepository;

public class ListaTarefasPresenter implements ListaTarefasContrato.ListaTarefasPresenter {

    private ListaTarefasContrato.ListaTarefasView view;
    @Override
    public void setView(ListaTarefasContrato.ListaTarefasView view) {
        this.view = view;
    }

    @Override
    public void getTarefas() {
        List<Tarefa> tarefas = TarefaRepository.getInstance().getAll();

        view.listarTarefas(tarefas);
    }
}
