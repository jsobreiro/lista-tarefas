import java.util.ArrayList;

public abstract class ListaTarefas {

    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    
}
