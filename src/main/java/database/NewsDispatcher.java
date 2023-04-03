package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.Driver;
import news.News;

public class NewsDispatcher {

	
	public boolean createNews(News news){
		   boolean status=(false);
		   try { 
			          if(news!=null){
	    	             Connection connection =new Driver().getDataConnection();
	    	             connection.setAutoCommit(false);
		    		     PreparedStatement statement=connection.prepareStatement("insert into news(news_code,title,describe,news_date,news_time,teacher_code,generated_key)values(null,?,?,curdate(),curtime())");
		    		                      // statement
		    		                       
		    		                    if(statement!=null){
				    		               if((statement.executeUpdate()==1)){
				    		                	   connection.commit();
				    		                	   status=true;
				    		               }
		    		                    }
				    		        
				    		      if(statement!=null) {
				    		    	 statement.close();
				    		      }
				    		      
				    		      if(connection!=null) {
				    		    	 connection.close();
				    		      }   
			          }
		       }catch(Exception e){
		    	      return status;
		       }
		   return status;
	}
}
