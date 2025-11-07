class Cliente {
    private String id;
    private String nome;
    private String categoria; // Ex: REGULAR ou VIP

    public Cliente(String id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
}