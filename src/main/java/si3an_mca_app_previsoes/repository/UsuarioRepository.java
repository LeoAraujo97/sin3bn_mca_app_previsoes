package si3an_mca_app_previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si3an_mca_app_previsoes.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
public Usuario findOneByLoginAndSenha (String login, String senha);
}