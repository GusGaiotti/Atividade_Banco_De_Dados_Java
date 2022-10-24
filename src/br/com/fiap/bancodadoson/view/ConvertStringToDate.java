package br.com.fiap.bancodadoson.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {

		String strDate = "08/12/2022";
		Date dataCorreta = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		System.out.println(dataCorreta);
	}

}
