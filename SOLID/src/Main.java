class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
}

class ValidadorSenha {
    public boolean valida(String senha) {
        return senha != null && senha.length() >= 8;
    }
}

class CadastroUsuario {
    public void cadastrar(Usuario usuario) {
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }
}

class EmailService {
    public void enviarBoasVindas(String email) {
        System.out.println("Enviando e-mail de boas-vindas para: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana", "ana@email.com");
        CadastroUsuario cadastro = new CadastroUsuario();
        EmailService email = new EmailService();
        ValidadorSenha validador = new ValidadorSenha();

        if (validador.valida("minhasenha")) {
            cadastro.cadastrar(usuario);
            email.enviarBoasVindas(usuario.getEmail());
        }
    }
}
