package service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FilaDAO;
import entity.Fila;


@Service
public class FilaService {
	private FilaDAO dao;
	
	
	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}
	public List<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public Fila carregar(int id) throws IOException{
		// TODO Auto-generated method stub
		return dao.carregar(id);
	}
}
