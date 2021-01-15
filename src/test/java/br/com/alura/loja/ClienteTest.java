package br.com.alura.loja;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


import org.junit.Test;

import junit.framework.Assert;

public class ClienteTest {
	@Inject
	private Client client;

	@Test
	public void testaQueAConexaoComOServidorFunciona() {
		
		client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://www.mocky.io");
		String conteudo = target.path("/v2/52aaf5bbee7ba8c60329fb7b").request().get(String.class);
		Assert.assertTrue(conteudo.contains("<rua> Rua Vergueiro"));
	}
}
