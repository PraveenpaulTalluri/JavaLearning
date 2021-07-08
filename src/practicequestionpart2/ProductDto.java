package practicequestionpart2;

import java.util.*;

public class ProductDto {
	private int productKey;
	private String productDescription;
	private Date productCreationDate;
	public ProductDto(int productKey, String productDescription, Date productCreationDate) {
		super();
		this.productKey = productKey;
		this.productDescription = productDescription;
		this.productCreationDate = productCreationDate;
	}
	
	
	public Date getProductCreationDate() {
		return productCreationDate;
	}


	public void setProductCreationDate(Date productCreationDate) {
		this.productCreationDate = productCreationDate;
	}

	
	
	@Override
	public int hashCode() {
		return this.productKey;
	}


	@Override
	public boolean equals(Object obj) {
		
		ProductDto p=(ProductDto)obj;
		
		if(p.productKey==this.productKey)
			return true;
		return false;
	}


	public String toString() {
		return "productKey:"+productKey;
	}
	
}
