package br.edu.ifsp.exercicioavaliativo4.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.exercicioavaliativo4.model.Tarefa;

public class TarefaRepository {

    private static TarefaRepository tarefaRepository = new TarefaRepository();
    private static List<Tarefa> listaTarefas = new ArrayList<>();

    static {
        listaTarefas.add(new Tarefa(1, "Tarefa1"));
        listaTarefas.add(new Tarefa(2, "Tarefa2"));
    }

    private TarefaRepository(){}

    public static TarefaRepository getInstance(){
        return tarefaRepository;
    }

    public void addTarefa(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }

    public List<Tarefa> getAll(){
        return this.listaTarefas;
    }

}
