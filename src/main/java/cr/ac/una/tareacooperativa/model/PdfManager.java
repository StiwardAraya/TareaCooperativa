package cr.ac.una.tareacooperativa.model;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import java.io.InputStream;

public class PdfManager {

    private String basePdfPath;
    private String firstPdfPath;
    private String folioSocio;
    private String nombreSocio;
    private String apellidoSocio;
    private float x;
    private float y;
    private float difference;

    public PdfManager(String basePdfPath, String firstPdfPath, String folioSocio, String nombreSocio, String apellidoSocio, float x, float y, float difference) {
        this.basePdfPath = basePdfPath;
        this.firstPdfPath = firstPdfPath;
        this.folioSocio = folioSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.x = x;
        this.y = y;
        this.difference = difference;
    }

    public void createPdf() {
        try {
            InputStream inputFilePath;
            // Cargar el documento PDF existente
            PdfDocument pdfDocument = new PdfDocument(new PdfReader(basePdfPath), new PdfWriter(firstPdfPath));

            // Obtener la primera página del documento
            PdfPage page = pdfDocument.getFirstPage();

            // Crear un objeto Document para escribir sobre la página
            Document document = new Document(pdfDocument);

            // Crear una fuente
            PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

            // Agregar texto al documento en las coordenadas especificadas
            Paragraph paragraph1 = new Paragraph(nombreSocio).setFont(font).setFixedPosition(x, y, 100);
            Paragraph paragraph2 = new Paragraph(apellidoSocio).setFont(font).setFixedPosition(x, y - difference, 100);
            Paragraph paragraph3 = new Paragraph(folioSocio).setFont(font).setFixedPosition(x, y - (difference * 2) + 5, 100);

            document.add(paragraph1);// aquí se le añade info al documento, hay que restringir la cantidad de caracteres para que no se salgan de los campos
            document.add(paragraph2);
            document.add(paragraph3);
            // Cerrar el documento
            document.close();

            System.out.println("PDF editado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}