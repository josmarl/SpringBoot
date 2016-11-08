package pe.org.ca.sms.domain;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author itecs
 */
public class Campaign implements Serializable, Cloneable {

    private Long id;
    private String campaingName;
    private String description;
    private String message;
    private String statusCampaign;
    private Long departamentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaingName() {
        return campaingName;
    }

    public void setCampaingName(String campaingName) {
        this.campaingName = campaingName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCampaign() {
        return statusCampaign;
    }

    public void setStatusCampaign(String statusCampaign) {
        this.statusCampaign = statusCampaign;
    }

    public Long getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(Long departamentId) {
        this.departamentId = departamentId;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
