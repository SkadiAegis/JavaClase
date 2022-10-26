import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

public class Main {

    private static final String FILENAME = "https://www.xataka.com/sitemap_index.xml"; //Obtengo el archivo XML
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //creo el objeto que trabajara con el XML

        try {

            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true); //Evita ataques como XXE
            DocumentBuilder db = dbf.newDocumentBuilder();//Se separa el XML en componentes mas faciles de procesar
            Document doc = db.parse(new URL("https://www.xataka.com/sitemap_index.xml").openStream());//Guardamos la URL donde se encuentra el XML
            doc.getDocumentElement().normalize();//Elimina espacios y saltos de linea
            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());//Imprime el nombre del elemento raiz
            System.out.println("---------------------------------------------");
            NodeList list = doc.getElementsByTagName("loc");//Obtiene los elementos con el tag "loc"
            for (int temp=0; temp<list.getLength();temp++){//Bucle para recorrer la lista de elementos
                System.out.println(list.item(temp).getTextContent());//Imprime el texto del elemento en la posicion del indice
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}