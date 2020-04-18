package com.coldmorning.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "emailArticle")
public class Mail extends  Article{
    private String contentType;
    private String mailFrom;
    private String mailTo;

    private List<Object> attachments;
    public Mail() {
        contentType = "text/plain";
    }

    public void  setMailFrom( String mailFrom) {
        this.mailFrom = mailFrom;;
    }
    public String getMailFrom(){
        return this.mailFrom;
    }

    public void  setMailTo( String mailTo) {
        this.mailTo = mailTo;;
    }
    public String getMailTo(){
        return this.mailTo;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getContentType() {
        return contentType;
    }

    public List <Object> getAttachments() {
        return attachments;
    }
    public void setAttachments(List <Object> attachments) {
        this.attachments = attachments;
    }
}