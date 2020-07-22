package com.hervey.app.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.hervey.app.models.Book;
import com.hervey.app.services.ApiService;

@Component
public class SetupDatabaseData implements ApplicationListener<ContextRefreshedEvent>{

	private ApiService apiService;
	
	public SetupDatabaseData(ApiService apiService) {
		this.apiService =apiService;
	}



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(apiService.fetchCountBooks()==0) {
			System.out.println("here we will add a record because books size is:  " + apiService.fetchCountBooks());
			
			Book book = new Book();
			book.setName("bookname2");
			book.setNumberPages(34);
			apiService.createBook(book);
				
		}
		else {
			System.out.println("we won't add becasue books size is;  " + apiService.fetchCountBooks());
		}
	}
	
	
	
	
	
	
	 
	
	

}
