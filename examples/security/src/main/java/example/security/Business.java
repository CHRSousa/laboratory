package example.security;

import br.gov.frameworkdemoiselle.security.RequiredPermission;
import br.gov.frameworkdemoiselle.security.RequiredRole;


public class Business {

	@RequiredPermission
	public void businessMethodOne(){
		System.out.println("M�todo de Neg�cio 1");
	}
	
	@RequiredPermission(resource="negocio", operation="metodo2")
	public void businessMethodTwo(){
		System.out.println("M�todo de Neg�cio 2");	
	}
	
	@RequiredRole("admin")
	public void businessMethodThree(){
		System.out.println("M�todo de Neg�cio 3");
	}
}
