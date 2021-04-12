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
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.text.Position;

/**
 *
 * @author rivaa
 */
@WebServlet(name = "pdf", urlPatterns = {"/pd2f.do"})
public class pdf extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet pdf</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet pdf at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String nombre = request.getParameter("txtNombreCompleto");
        String edad = request.getParameter("txtEdad");
        String rut = request.getParameter("txtRut");
        String mail = request.getParameter("txtEmail");
        String direccion = request.getParameter("txtDireccion");
        String telefono = request.getParameter("txtFono");
        String textArea = request.getParameter("txtSobreTi");
        String basica = request.getParameter("txtBasica");
        String media = request.getParameter("txtMedia");
        String universidad = request.getParameter("txtUniversidad");
        String experiencia = request.getParameter("txtExperiencia");

        //CODIGO PARA RESCATAR URL DE IMAGEN
        Part fotocv = request.getPart("foto");

   

        InputStream fileContent = fotocv.getInputStream();
        
        out.println(fileContent);
        
        
        
        
        
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
            Font fTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 14.0f, Font.BOLD, BaseColor.BLACK);

            Font fLetras = new Font(Font.FontFamily.TIMES_ROMAN, 10.0f, Font.BOLD, BaseColor.BLACK);

            Font CURRICULUMTITULO = new Font(Font.FontFamily.TIMES_ROMAN, 25.0f, Font.BOLD, BaseColor.BLACK);

            //LE DAMOS UN NUEVO PARRAFO, EL CUAL LE DIMOS UN TITULO QUE ES EL FORMATO ANTES VISTO
            Paragraph titulo = new Paragraph("Nombre:  " + nombre, fTitulo);

//            CREAMOS OTRO PARRAFO NORMAL DE SOLO TEXTO SIN UNA FUENTE ESPCIFICA
//            Paragraph texto = new Paragraph("Aqui van mas parametros que quieras mandar");
//            //CREAMOS UN PARRAFO PARA LA EDAD POR EJEMPLO
            Paragraph vacio1 = new Paragraph();
            vacio1.add("\n\n");
            Paragraph titulo2 = new Paragraph("Curriculum Vitae", CURRICULUMTITULO);
            Paragraph parrafoEdad = new Paragraph("Fecha de nacimiento: " + edad);
            Paragraph parrafoRut = new Paragraph("Rut: " + rut);
            Paragraph parrafoMail = new Paragraph("Email: " + mail);
            Paragraph parrafoDireccion = new Paragraph("Dirección: " + direccion);
            Paragraph parrafoTelefono = new Paragraph("Numero de telefono: " + telefono);
            Paragraph parrafoSobreti = new Paragraph("Sobre ti: " + textArea);
            Paragraph parrafoBasica = new Paragraph("Nombre de colegio en basica: " + basica);
            Paragraph parrafoMedia = new Paragraph("Nombre de colegio en media:" + media);
            Paragraph parrafoUniversidad = new Paragraph("Nombre de universidad, instituto o CFT: " + universidad);
            Paragraph parrafoExperiencia = new Paragraph("Experiencia laboral: " + experiencia);

            //AÑADIMOS TODOS LOS PARRAFOS CREADOS A DOCUMENTO
            doc.add(titulo2);
            doc.add(vacio1);
            doc.add(titulo);
            doc.add(vacio1);

            doc.add(parrafoEdad);
            doc.add(vacio1);
            doc.add(parrafoRut);
            doc.add(vacio1);
            doc.add(parrafoMail);
            doc.add(vacio1);
            doc.add(parrafoDireccion);
            doc.add(vacio1);
            doc.add(parrafoTelefono);
            doc.add(vacio1);
            doc.add(parrafoBasica);

            doc.add(parrafoMedia);
            doc.add(vacio1);
            doc.add(parrafoUniversidad);
            doc.add(vacio1);
            doc.add(parrafoExperiencia);
            doc.add(vacio1);

            doc.add(parrafoSobreti);
//            doc.add(parrafoEdad);
            //CERRAMOS EL DOCUMENTO
            doc.close();

            //respondemos hacia la primera vista, MOSTRANDO COMO MENSAJE LA RUTA DONDE EL ARCHIVO SE GUARDO
            request.getRequestDispatcher("test.jsp?m=" + path + nombreArchivo + ".pdf").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(pdfServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
