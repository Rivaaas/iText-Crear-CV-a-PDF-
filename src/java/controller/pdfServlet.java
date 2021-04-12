/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rivaa
 */
public class pdfServlet extends HttpServlet {

  
 
    

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String nombre = request.getParameter("nombre");
        System.out.println(nombre);
        String edad = request.getParameter("edad");

        //RUTA DONDE IRA
        String path = "C:\\Users\\rivaa\\Documents\\pdf software\\";
        //NOMBRE DEL ARCHIVO, SE LO DAMOS AFUERA O PUEDES DARSELO AQUI DENTRO TAMBIEN
        String nombreArchivo = request.getParameter("nombreAr");

        try {

            //PRIMERA LINEA CREA UN ARCHIVO CON LA RUTA+NOMBRE+LAEXTENCION
            FileOutputStream archivo = new FileOutputStream(path + nombreArchivo + ".pdf");

            //SE CREA UN NUEVO DOCUMENTO
            Document doc = new Document();

            //AQUI LE INDICAMOS QUE EL DOCUMENTO SERA EN PDF, Y LE DAMOS COMO PARAMETROS EL DOCUEMENTO + EL ARCHIVO
            PdfWriter pdf = PdfWriter.getInstance(doc, archivo);

            //ABRIMOS EL DOCUMENTO
            doc.open();

            //LE DAMOS UN FORMATO DE LETRA
            Font fTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 12.0f, Font.BOLD, BaseColor.BLACK);

            //LE DAMOS UN NUEVO PARRAFO, EL CUAL LE DIMOS UN TITULO QUE ES EL FORMATO ANTES VISTO
            Paragraph titulo = new Paragraph(nombre, fTitulo);

            //CREAMOS OTRO PARRAFO NORMAL DE SOLO TEXTO SIN UNA FUENTE ESPCIFICA
            Paragraph texto = new Paragraph("Aqui van mas parametros que quieras mandar");

            //CREAMOS UN PARRAFO PARA LA EDAD POR EJEMPLO
            Paragraph parrafoEdad = new Paragraph("SU EDAD: " + edad, fTitulo);

            //AÑADIMOS TODOS LOS PARRAFOS CREADOS A DOCUMENTO
            doc.add(titulo);
            doc.add(texto);
            doc.add(parrafoEdad);

            //CERRAMOS EL DOCUMENTO
            doc.close();

            //respondemos hacia la primera vista, MOSTRANDO COMO MENSAJE LA RUTA DONDE EL ARCHIVO SE GUARDO
            request.getRequestDispatcher("index.jsp?m=" + path + nombreArchivo + ".pdf").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(pdfServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
