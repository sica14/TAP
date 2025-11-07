class NotificadorConsole implements Notificador {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("[Notificação para " + cliente.getNome() + "] " + mensagem);
    }
}