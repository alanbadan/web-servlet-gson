package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada")
public class MonitorimentoFilter implements Filter {


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void destroy() {}
	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		//executa=acao
		chain.doFilter(request, response);
		
		
	   
		long depois = System.currentTimeMillis();
		//lambda
		System.out.println("Tempo de execução da acao " + acao + " -> " + (depois - antes));  
	    // System.out.println("tempo de execução :" + (depois - antes));
	    // System.out.println(" Tempo de execução :" + acao);
		
	}
	
}
