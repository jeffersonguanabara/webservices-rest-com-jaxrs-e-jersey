package br.com.alura.loja.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Produto;

@Path("/produtos")
public class ProdutoResource {

//	@Path("{id}")
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public String buscarProdudoPeloId(@PathParam(value = "id") long id) {
//		Produto produto = new ProdutoDAO().buscar(id);
//		return produto.toXML();
//	}
}
