package com.chz.pojo;

import java.io.Serializable;

public class Doctor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer did;
	private Integer uniacid;
	private String openid;
	private String d_name;
	private String d_thumb;
	private String d_keshi;
	private String d_zhicheng;
	private String d_zhiwu;
	private String d_telephone;
	private String d_email;
	private String d_money;
	private String d_content;
	private String d_sex;
	private String d_age;
	private String d_shenfengzheng;
	private String d_yiyuan;
	private Boolean d_checked;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getUniacid() {
		return uniacid;
	}
	public void setUniacid(Integer uniacid) {
		this.uniacid = uniacid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_thumb() {
		return d_thumb;
	}
	public void setD_thumb(String d_thumb) {
		this.d_thumb = d_thumb;
	}
	public String getD_keshi() {
		return d_keshi;
	}
	public void setD_keshi(String d_keshi) {
		this.d_keshi = d_keshi;
	}
	public String getD_zhicheng() {
		return d_zhicheng;
	}
	public void setD_zhicheng(String d_zhicheng) {
		this.d_zhicheng = d_zhicheng;
	}
	public String getD_zhiwu() {
		return d_zhiwu;
	}
	public void setD_zhiwu(String d_zhiwu) {
		this.d_zhiwu = d_zhiwu;
	}
	public String getD_telephone() {
		return d_telephone;
	}
	public void setD_telephone(String d_telephone) {
		this.d_telephone = d_telephone;
	}
	public String getD_email() {
		return d_email;
	}
	public void setD_email(String d_email) {
		this.d_email = d_email;
	}
	public String getD_money() {
		return d_money;
	}
	public void setD_money(String d_money) {
		this.d_money = d_money;
	}
	public String getD_content() {
		return d_content;
	}
	public void setD_content(String d_content) {
		this.d_content = d_content;
	}
	public String getD_sex() {
		return d_sex;
	}
	public void setD_sex(String d_sex) {
		this.d_sex = d_sex;
	}
	public String getD_age() {
		return d_age;
	}
	public void setD_age(String d_age) {
		this.d_age = d_age;
	}
	public String getD_shenfengzheng() {
		return d_shenfengzheng;
	}
	public void setD_shenfengzheng(String d_shenfengzheng) {
		this.d_shenfengzheng = d_shenfengzheng;
	}
	public String getD_yiyuan() {
		return d_yiyuan;
	}
	public void setD_yiyuan(String d_yiyuan) {
		this.d_yiyuan = d_yiyuan;
	}
	public Boolean getD_checked() {
		return d_checked;
	}
	public void setD_checked(Boolean d_checked) {
		this.d_checked = d_checked;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", uniacid=" + uniacid + ", openid=" + openid + ", d_name=" + d_name
				+ ", d_thumb=" + d_thumb + ", d_keshi=" + d_keshi + ", d_zhicheng=" + d_zhicheng + ", d_zhiwu="
				+ d_zhiwu + ", d_telephone=" + d_telephone + ", d_email=" + d_email + ", d_money=" + d_money
				+ ", d_content=" + d_content + ", d_sex=" + d_sex + ", d_age=" + d_age + ", d_shenfengzheng="
				+ d_shenfengzheng + ", d_yiyuan=" + d_yiyuan + ", d_checked=" + d_checked + "]";
	}
	
	
}
