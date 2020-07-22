package com.hervey.app.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hervey.app.services.ApiService;

@Component
public class SetupDatabaseData implements ApplicationListener<ContextRefreshedEvent>{

	private ApiService apiService;
	
	public SetupDatabaseData(ApiService apiService) {
		this.apiService =apiService;
	}


	@Transactional
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("first test");
		int bookSize = apiService.fetchAllBooks().size();
		System.out.println("number of books is:  " + bookSize);
	}
	
	
	
	
	
	
	
	
	

}
