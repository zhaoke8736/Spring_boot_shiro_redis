package com.example.demo.model;

public class XueShen {
    private Integer stuno;
    private String stuname;
    private String sex;
    private String indate;
    private Integer classno;
    private String classname;
	private Integer kno;
	private String kname;
	private double score;
	
	
	@Override
	public String toString() {
		return "XueShen [stuno=" + stuno + ", stuname=" + stuname + ", sex=" + sex + ", indate=" + indate + ", classno="
				+ classno + ", classname=" + classname + ", kno=" + kno + ", kname=" + kname + ", score=" + score + "]";
	}


	public Integer getStuno() {
		return stuno;
	}


	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}


	public String getStuname() {
		return stuname;
	}


	public void setStuname(String stuname) {
		this.stuname = stuname;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getIndate() {
		return indate;
	}


	public void setIndate(String indate) {
		this.indate = indate;
	}


	public Integer getClassno() {
		return classno;
	}


	public void setClassno(Integer classno) {
		this.classno = classno;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	public Integer getKno() {
		return kno;
	}


	public void setKno(Integer kno) {
		this.kno = kno;
	}


	public String getKname() {
		return kname;
	}


	public void setKname(String kname) {
		this.kname = kname;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	public XueShen(Integer stuno, String stuname, String sex, String indate, Integer classno, String classname,
			Integer kno, String kname, double score) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.sex = sex;
		this.indate = indate;
		this.classno = classno;
		this.classname = classname;
		this.kno = kno;
		this.kname = kname;
		this.score = score;
	}


	public XueShen() {
		super();
		// TODO Auto-generated constructor stub
	}
}
