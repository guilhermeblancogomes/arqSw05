package service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDAO;
import entity.Usuario;

@Service
public class UsuarioService {
	private UsuarioDAO dao;
	
	@Autowired
	public UsuarioService(UsuarioDAO dao) {
		this.dao = dao;
	}
	
	public Boolean validarLogin(Usuario usuario) throws IOException {
		return dao.validarLogin(usuario);
	}
	
	
}
