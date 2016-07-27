package com.ahsen.xmlparser.domain;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name ="directory")
public class Dictionary {

    private String name;
    private String nameEn;
    private List<String> tags;
    private boolean popular;
    private String shortDescription;
    private String longDescription;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }
    @XmlElement (name = "name-en")
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public List<String> getTags() {
        return tags;
    }

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean isPopular() {
        return popular;
    }

    @XmlElement
    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @XmlElement (name = "short-description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @XmlElement (name = "long-description")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
