package teste;

import java.util.ArrayList;


public class Dados {
    
    ArrayList<Usuario> usuarios = new ArrayList();
    
    public void cadastroUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public String numUsuarios() {
        return usuarios.size() + "";
    }
    
    
}
