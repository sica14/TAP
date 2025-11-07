interface Repositorio<T, ID> {
    void salvar(T entidade);
    T buscarPorId(ID id);
}