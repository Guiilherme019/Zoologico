public enum EstadoAnimais {
    COMENDO("Comendo"),
    DORMINDO("Dormindo"),
    DOENTE("Doente"),
    BEBENDO_AGUA("Bebendo Agua");
    private String descricao;
    private EstadoAnimais(String descricao) {
        this.descricao = descricao;
    }
}
