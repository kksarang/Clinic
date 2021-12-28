package com.example.clinx;

public class DoctorModel {

    private String Doctorname;
    private String hospitalplace;
    private String hospitaltime;
    private String hospitalGeneral1;
    private String hospitalGeneral2;
    private String hospitalGeneral3;
    private String hospitalGeneral4;
    private String starlecvel;

    private Integer img;

    public DoctorModel(String doctorname,
                       String hospitalplace,
                       String hospitaltime,
                       String hospitalGeneral1,
                       String hospitalGeneral2,
                       String hospitalGeneral3,
                       String hospitalGeneral4,
                       String starlecvel,
                       Integer img) {
        Doctorname = doctorname;
        this.hospitalplace = hospitalplace;
        this.hospitaltime = hospitaltime;
        this.hospitalGeneral1 = hospitalGeneral1;
        this.hospitalGeneral2 = hospitalGeneral2;
        this.hospitalGeneral3 = hospitalGeneral3;
        this.hospitalGeneral4 = hospitalGeneral4;
        this.starlecvel = starlecvel;
        this.img = img;
    }


    public String getDoctorname() {
        return Doctorname;
    }

    public void setDoctorname(String doctorname) {
        Doctorname = doctorname;
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

    public String getStarlecvel() {
        return starlecvel;
    }

    public void setStarlecvel(String starlecvel) {
        this.starlecvel = starlecvel;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
