package com.kishore.ecommapiwebapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	/** The name of the product. */
	@Column(name = "name", nullable = false, unique = true)
	private String name;

	private String imageURL;

	/** The short description of the product. */
	@Column(name = "short_description", nullable = false)
	private String shortDescription;
	/** The long description of the product. */
	@Column(name = "long_description")
	private String longDescription;
	/** The price of the product. */
	@Column(name = "price", nullable = false)
	private Double price;

	public Product() {
	}

	public Product(String name, String imageURL, String shortDescription, String longDescription, Double price) {
		super();
		this.name = name;
		this.imageURL = imageURL;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", imageURL=" + imageURL + ", shortDescription="
				+ shortDescription + ", longDescription=" + longDescription + ", price=" + price + "]";
	}

}
