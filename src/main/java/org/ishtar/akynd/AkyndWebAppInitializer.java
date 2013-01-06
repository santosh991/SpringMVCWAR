package org.ishtar.akynd;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * ウェブアプリケーション初期化処理
 * 
 * @author tatsunori.hasegawa.1029@gmail.com
 */
public class AkyndWebAppInitializer implements WebApplicationInitializer {

	/**
	 * 開始処理
	 * 
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	}
}
