package com.xworkz.excel;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class ExcelToDatabase {
	public static void main(String[] args) {
		Connection connection=null;
		 PreparedStatement preparedStatement = null;
	 try {
	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Arun@6134");
      connection.setAutoCommit(false);
      
     
      FileInputStream fileInputStream = new  FileInputStream("C:\\Users\\hp\\Desktop\\StudentDetails.xlsx");
      POIFSFileSystem  fileSystem = new POIFSFileSystem(fileInputStream);
      HSSFWorkbook  hssfWorkbook = new HSSFWorkbook(fileSystem);
      HSSFSheet hssfSheet =hssfWorkbook.getSheetAt(0);
      
      Row row;
      for (int i = 1; i < hssfSheet.getLastRowNum(); i++) {
    	  row=hssfSheet.getRow(i);
    	  int StudentID= (int) row.getCell(0).getNumericCellValue();
    	  String Name = row.getCell(1).getStringCellValue();
    	  String Adress = row.getCell(2).getStringCellValue();
    	  long Mobileno = (long) row.getCell(2).getNumericCellValue();
    	  int Age = (int) row.getCell(3).getNumericCellValue();
    	  
    	  String sql = "insert into candidate_details  values (" +StudentID +",  '" + Name +"' , '"+Adress +"' ,"+
    			  Mobileno+"," +Age ;
    	  
    	  preparedStatement = connection.prepareStatement(sql);
    	  preparedStatement.execute();
    	  System.out.println("fetching data "+i);
    	  
    	  fileInputStream.close();
	}
      connection.commit();
	
	}catch (Exception e) {
		// TODO: handle exception
	}finally {
		
		try {
			
			if(connection!=null)
			connection.close();
			if(preparedStatement!=null)
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}
