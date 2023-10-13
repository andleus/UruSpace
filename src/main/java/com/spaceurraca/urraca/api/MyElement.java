package com.spaceurraca.urraca.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "uru1")
public class MyElement {
    @Id
    public String id;
    public String name;
    public String filename;


    public MyElement(String name, String filename){
        this.name = name;
        this.filename = filename;
    }


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}