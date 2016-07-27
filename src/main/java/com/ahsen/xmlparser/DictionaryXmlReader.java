package com.ahsen.xmlparser;

/**
 * Created by ahmetkonyalioglu on 13.07.2016.
 */

//@Singleton
//@Startup
public class DictionaryXmlReader {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(DictionaryXmlReader.class);
    Unmarshaller directoryUnmarshaller = JAXBContext.newInstance(Dictionary.class).createUnmarshaller();
    DictionaryCacheManager dictionaryCacheManager = DictionaryCacheManager.getCacheManager();

    public DictionaryXmlReader() throws JAXBException {
    }

    @PostConstruct
    public void readXml() throws IOException, URISyntaxException, JAXBException {


        File folder = new ClassPathResource("/dictionaries",DictionaryXmlReader.class).getFile();
        File[] listOfFiles = folder.listFiles();
        for (File file:listOfFiles) {
            LOGGER.info(file.getName());
            if(file.getName().endsWith(".xml")){
                InputStream inputStream = new FileInputStream(file);
                Reader reader = new InputStreamReader(inputStream, "UTF-8");
                try {
                    Dictionary dictionary = (Dictionary) directoryUnmarshaller.unmarshal(reader);
                    dictionaryCacheManager.put(dictionary.getName(), dictionary);
                } finally  {
                    reader.close();
                }
            }
        }
    }
    */
}
