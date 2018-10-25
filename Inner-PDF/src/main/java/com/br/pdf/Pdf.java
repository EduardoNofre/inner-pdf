package com.br.pdf;


import java.io.File;

import org.apache.pdfbox.multipdf.PDFMergerUtility;


public class Pdf {
	
	public static void main(String[] args)
	{
		try
		{
			PDFMergerUtility mergePdf = new PDFMergerUtility();

			String folder ="pdf";

			File _folder = new File("C:\\Users\\eduardo.sa\\Desktop\\pdfs\\");

			for (File string : _folder.listFiles())
			{
				mergePdf.addSource(string);    
			}
			mergePdf.setDestinationFileName("C:\\Users\\eduardo.sa\\Desktop\\Combined.pdf");

			mergePdf.mergeDocuments();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}  
	}
}
