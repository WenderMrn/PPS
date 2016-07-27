package br.edu.ifpb.pp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
	
	public static Calendar stringToDate(String data){
		Calendar c = null;
		try{
	        Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
	        c = Calendar.getInstance();
	        c.setTime(dataFormatada);
	     }catch(Exception e){
	            e.printStackTrace();
	     }
		return c;
	}
	
	public static Calendar stringToDate(String data, String formato){
		Calendar c = null;
		try{
	        Date dataFormatada = new SimpleDateFormat(formato).parse(data);
	        c = Calendar.getInstance();
	        c.setTime(dataFormatada);
	     }catch(Exception e){
	            e.printStackTrace();
	     }
		return c;
	}

}
