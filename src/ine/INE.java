/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ine;


import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;


/**
 *
 * @author LENOVO
 */
public class INE {
    public static final  String FRONTAL ="C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\INE\\FRONTAL.PNG";
    public static final  String TRACERA ="C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\INE\\TRACERA.PNG";
    public static final  String DESTINO ="C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\INE";
    
    
    public static void main(String[] args) throws IOException{
      new INE().crearPDF(DESTINO);
        
    }
    
    public void crearPDF(String DESTINO) throws IOException{
    PdfWriter W = new PdfWriter(DESTINO);
    PdfDocument pdf = new PdfDocument(W);
        try (Document ine = new Document(pdf)) {
            Image frontal = new Image(ImageDataFactory.create(FRONTAL));
            Image tracera = new Image(ImageDataFactory.create(TRACERA));
            Paragraph p = new Paragraph("esta es la vista frontal")
                    .add(FRONTAL)
                    .add("esta es la vista del reverso")
                    .add(TRACERA);
            ine.add(p);
        }
    }
}
