package com.example.cursoMc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursoMc.domain.Categoria;

@RestController
@RequestMapping(value="/Categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria c1 = new Categoria(1,"Refrigerante");
		Categoria c2 = new Categoria(2,"Lanches");
		
		List<Categoria> listCategoria = new ArrayList<Categoria>();
		listCategoria.add(c1);
		listCategoria.add(c2);
		
		return listCategoria;
	}
}
