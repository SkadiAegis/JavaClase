import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //creo el objeto que trabajara con el XML

        try {

            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true); //Evita ataques como XXE
            DocumentBuilder db = dbf.newDocumentBuilder();//Se separa el XML en componentes mas faciles de procesar
            Document doc = db.parse(new URL("https://www.xataka.com/sitemap_index.xml").openStream());//Guardamos la URL donde se encuentra el XML
            doc.getDocumentElement().normalize();//Elimina espacios y saltos de linea
            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());//Imprime el nombre del elemento raiz
            System.out.println("-----------------------------------------------------------------------------------------");
            NodeList list = doc.getElementsByTagName("loc");//Obtiene los elementos con el tag "loc"
            for (int temp=0; temp<list.getLength();temp++){//Bucle para recorrer la lista de elementos
                System.out.println(list.item(temp).getTextContent());//Imprime el texto del elemento en la posicion del indice

                //Crear el nuevo documento y NodeList para analizar otra lista de XML's
                Document subDoc = db.parse(new URL(list.item(temp).getTextContent()).openStream());//Recoje el link anterior como nuevo documento
                subDoc.getDocumentElement().normalize();//Elimina espacios y saltos de linea
                System.out.println("SubLinks");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Elemento raiz del SubLink " + subDoc.getDocumentElement().getNodeName());
                NodeList subList =subDoc.getElementsByTagName("loc");//Obtiene lo que hay dentro de loc del SubDocumento
                for (int SubDoclist=0; SubDoclist<subList.getLength();SubDoclist++){//Recorrer la lista de nodes para mostrar todos los sublinks
                    System.out.println(subList.item(SubDoclist).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}