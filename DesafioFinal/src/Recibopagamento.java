class ReciboPagamento {
    private String idPedido;
    private String metodo;
    private String transacao;
    private boolean sucesso;
    private String mensagem;

    public ReciboPagamento(String idPedido, String metodo, String transacao, boolean sucesso, String mensagem) {
        this.idPedido = idPedido;
        this.metodo = metodo;
        this.transacao = transacao;
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public String getIdPedido() { return idPedido; }
    public String getMetodo() { return metodo; }
    public String getTransacao() { return transacao; }
    public boolean isSucesso() { return sucesso; }
    public String getMensagem() { return mensagem; }
}