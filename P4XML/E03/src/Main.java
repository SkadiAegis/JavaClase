import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //creo el objeto que trabajara con el XML

        try {

            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true); //Evita ataques como XXE
            DocumentBuilder db = dbf.newDocumentBuilder();//Se separa el XML en componentes mas faciles de procesar
            Document doc = db.parse(new URL("https://www.xataka.com/sitemap_index.xml").openStream());//Guardamos la URL donde se encuentra el XML
            doc.getDocumentElement().normalize();//Elimina espacios y saltos de linea
            NodeList list = doc.getElementsByTagName("loc");//Obtiene los elementos con el tag "loc"

            File carpeta = new File("./Sitemaps");//Con esto creo la carpeta donde se guardaran los txt y informo de si se ha creado o no
            if (!carpeta.exists()) {
                if (carpeta.mkdir()) {
                    System.out.println("Directorio Creado");
                    }else System.out.println("El directorio no se ha creado");
                }
            for (int temp = 0; temp < list.getLength(); temp++) {//Bucle para recorrer la lista de elementos
               //Obtengo el nombre que le pondre al archivo y lo retoco para que sea mas entendible
                String nArchivo = list.item(temp).getTextContent();
                nArchivo = nArchivo.replace("https://www.xataka.com/","");
                nArchivo= nArchivo.replace(".xml","");
                nArchivo= nArchivo.replace("/","_");

                //Crear el nuevo documento y NodeList para analizar otra lista de XML's
                Document subDoc = db.parse(new URL(list.item(temp).getTextContent()).openStream());//Recoje el link anterior como nuevo documento
                subDoc.getDocumentElement().normalize();//Elimina espacios y saltos de linea
                NodeList subList = subDoc.getElementsByTagName("loc");//Obtiene lo que hay dentro de loc del SubDocumento
                FileWriter fw = new FileWriter("Sitemaps/" + nArchivo + ".txt");//Declaro el nombre del archivo con el nombre de la URL y le añado .txt al final
                BufferedWriter bw = new BufferedWriter(fw);
                for (int SubDoclist = 0; SubDoclist < subList.getLength(); SubDoclist++) {//Recorrer la lista de nodes para escribir todas las URL en eltxt
                    bw.write(subList.item(SubDoclist).getTextContent()+System.lineSeparator());//Con esta linea pongo las url en el BufferedWritter
                }
                bw.close();//al cerrar el Buffered Writter se escribe todo lo que hay en el buffer en el archivo
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}