package org.example.finalworkapi.Application.DTOs.JobDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ListJobDTO {

    private int idJob;
    private int idMaintenance;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startMaintenance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endMaintenance;

    public ListJobDTO(int idJob, int idMaintenance, String description, Date startMaintenance, Date endMaintenance) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.description = description;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
    }

    public ListJobDTO(){
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public Date getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(Date startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public Date getEndMaintenance() {
        return endMaintenance;
    }

    public void setEndMaintenance(Date endMaintenance) {
        this.endMaintenance = endMaintenance;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
