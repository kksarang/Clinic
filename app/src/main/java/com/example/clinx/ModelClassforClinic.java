package com.example.clinx;

public class ModelClassforClinic {

    private String hospitalname;
    private String hospitalplace;
    private String hospitaltime;
    private String hospitalservice;
    private String hospitalGeneral1;
    private String hospitalGeneral2;
    private String hospitalGeneral3;
    private String hospitalGeneral4;

    private Integer img;

    public ModelClassforClinic(String hospitalname,
                               String hospitalplace,
                               String hospitaltime,
                               String hospitalservice,
                               String hospitalGeneral1,
                               String hospitalGeneral2,
                               String hospitalGeneral3,
                               String hospitalGeneral4,
                               Integer img) {
        this.hospitalname = hospitalname;
        this.hospitalplace = hospitalplace;
        this.hospitaltime = hospitaltime;
        this.hospitalservice = hospitalservice;
        this.hospitalGeneral1 = hospitalGeneral1;
        this.hospitalGeneral2 = hospitalGeneral2;
        this.hospitalGeneral3 = hospitalGeneral3;
        this.hospitalGeneral4 = hospitalGeneral4;
        this.img = img;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getHospitalplace() {
        return hospitalplace;
    }

    public void setHospitalplace(String hospitalplace) {
        this.hospitalplace = hospitalplace;
    }

    public String getHospitaltime() {
        return hospitaltime;
    }

    public void setHospitaltime(String hospitaltime) {
        this.hospitaltime = hospitaltime;
    }

    public String getHospitalservice() {
        return hospitalservice;
    }

    public void setHospitalservice(String hospitalservice) {
        this.hospitalservice = hospitalservice;
    }

    public String getHospitalGeneral1() {
        return hospitalGeneral1;
    }

    public void setHospitalGeneral1(String hospitalGeneral1) {
        this.hospitalGeneral1 = hospitalGeneral1;
    }

    public String getHospitalGeneral2() {
        return hospitalGeneral2;
    }

    public void setHospitalGeneral2(String hospitalGeneral2) {
        this.hospitalGeneral2 = hospitalGeneral2;
    }

    public String getHospitalGeneral3() {
        return hospitalGeneral3;
    }

    public void setHospitalGeneral3(String hospitalGeneral3) {
        this.hospitalGeneral3 = hospitalGeneral3;
    }

    public String getHospitalGeneral4() {
        return hospitalGeneral4;
    }

    public void setHospitalGeneral4(String hospitalGeneral4) {
        this.hospitalGeneral4 = hospitalGeneral4;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
