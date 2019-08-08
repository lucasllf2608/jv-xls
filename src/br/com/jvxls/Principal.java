package br.com.jvxls;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args)throws IOException, BiffException  {
		// TODO Auto-generated method stub
		
		System.out.println("teste");
		
		
		
		Workbook workbook = Workbook.getWorkbook(new File("myxls.xls"));
		
		Sheet sheet = workbook.getSheet(0);
		int linhas = sheet.getRows();
		
		System.out.println(linhas);
		
		System.out.println("Iniciando o processo de leitura.");
		
		for(int i = 0; i < linhas; i++){
			Cell a1 = sheet.getCell(0,i);
			Cell a2 = sheet.getCell(1,i);
			Cell a3 = sheet.getCell(2,i);
			
			String as1 = a1.getContents();
			String as2 = a2.getContents();
			String as3 = a3.getContents();

			
			System.out.println("Coluna 01: "+as1);
			System.out.println("Coluna 02: "+as2);
			System.out.println("Coluna 03: "+as3);
			
			
		}
		
		workbook.close();
		
	}

}
