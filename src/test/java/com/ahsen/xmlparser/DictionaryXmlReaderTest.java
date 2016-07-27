package com.ahsen.xmlparser;

import com.ahsen.xmlparser.domain.Dictionary;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 */
public class DictionaryXmlReaderTest {
    public static final org.slf4j.Logger LOGGER= LoggerFactory.getLogger(DictionaryXmlReaderTest.class);
    Unmarshaller directoryUnmarshaller = JAXBContext.newInstance(Dictionary.class).createUnmarshaller();

    public DictionaryXmlReaderTest() throws JAXBException {
    }


    @Test
    public void readXml() throws Exception {
        Assert.assertTrue(true);
        File folder = new ClassPathResource("/dictionaries", DictionaryXmlReaderTest.class).getFile();
        File[] ListOfFiles = folder.listFiles();
        for (File file : ListOfFiles) {
            System.out.println(file.getName());
            if (file.getName().endsWith(".xml")) {
                InputStream inputStream = new FileInputStream(file);
                Reader reader = new InputStreamReader(inputStream, "UTF-8");
                Dictionary dictionary=null;
                try {
                    dictionary = (Dictionary) directoryUnmarshaller.unmarshal(reader);

                }catch (Exception e){
                    e.printStackTrace();
                    Assert.fail();
                }
                finally {
                    reader.close();

                }
                Assert.assertTrue(dictionary.getLongDescription()!=null);
                System.out.println(dictionary.toString());
                Assert.assertTrue(dictionary.getShortDescription()!=null);
                System.out.println(dictionary.toString());
                Assert.assertTrue(dictionary.getName()!=null);
                System.out.println(dictionary.toString());
                Assert.assertTrue(dictionary.getNameEn()!=null);
                Assert.assertTrue(dictionary.getTags()!=null);
                System.out.println(dictionary.toString());



            }

        }
    }
}
