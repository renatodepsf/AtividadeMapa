package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.entity.Usuario;

public interface UsuarioDAO {
    
    public void cadastrarUsuario(Usuario usuario);
    public void acessar(Usuario usuario);
}
