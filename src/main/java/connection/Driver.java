package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Driver {

		private Connection connection;
		private String databaseName=("");
		private String username="";
		private String password="";
		private final String DB_URL="jdbc:mysql://localhost/";
		
		public String getDatabaseName() {
			return databaseName;
		}

		public void setDatabaseName(String databaseName) {
			if((databaseName!=null)){
			    if((databaseName.length()>=1)&&(databaseName.length()<=100)){
			        this.databaseName = databaseName;
			    }
			} 
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			if((username!=null)){
			    this.username = username;
			}
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getDB_URL() {
			return DB_URL;
		}
	
		public Connection getDataConnection() {
			 try {
				   Class.forName("com.mysql.jdbc.Driver");
				   connection=DriverManager.getConnection(getDB_URL().concat(getDatabaseName()),getUsername(),getPassword());
				}catch(Exception e) {
					e.printStackTrace();
				}
			   return connection;
		}
	
}
