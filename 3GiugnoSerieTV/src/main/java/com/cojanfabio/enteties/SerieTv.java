package com.cojanfabio.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
@Table(name="serie")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor (roba utile)
@Data
public class SerieTv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //chiave primaria autoincrement
	private String titolo;
	private String img;
	@Column(columnDefinition = "decimal")
	private double rating; //su sql defaul double, ci serve decimal
	@Column(columnDefinition = "text") //su sql diventa test
	private String summary; //su sql è default come varchar
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
	
}
