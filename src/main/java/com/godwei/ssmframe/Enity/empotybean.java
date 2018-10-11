package com.godwei.ssmframe.Enity;

public class empotybean {
    private int id;
    private String name;
    private String pwd;
    private String sex;



    public empotybean() {
    }

    public empotybean(int id, String name, String pwd, String sex) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
    }

    public String getPwd() {return pwd;}

    public void setPwd(String pwd) { this.pwd = pwd; }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "empotybean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
