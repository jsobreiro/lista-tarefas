import java.util.ArrayList;

public abstract class ListaTarefas {

    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    
    
    
    
    
    public static ArrayList<Tarefa> listarTarefas() {
        return listaTarefas;
    }


    public static void cadastrarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public static Tarefa buscarTarefa(String titulo) throws Exception {

        for (Tarefa tempTarefa : listaTarefas) {
            if (tempTarefa.getTitulo().contains(titulo)) {
                return tempTarefa;
            }
        }

       throw new Exception("\nTarefa não localizada");


    }

    public static void excluirTarefa(Tarefa tarefa) {
        listaTarefas.remove(tarefa);
    }

    
}
