package productdto.comparator;

import java.util.Date;

public class ProductDto{
	int productKey;
	private String productDescription;
	Date productCreationDate;
	public ProductDto(int productKey, String productDescription, Date productCreationDate) {
		super();
		this.productKey = productKey;
		this.productDescription = productDescription;
		this.productCreationDate = productCreationDate;
	}
	
	
	
	public int getProductKey() {
		return productKey;
	}



	public void setProductKey(int productKey) {
		this.productKey = productKey;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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
		if(p.productCreationDate==this.productCreationDate)
			return true;
		if(p.productKey==this.productKey)
			return true;
		return false;
	}


	public String toString() {
		return "productKey:"+productKey +" " +productCreationDate;
	}


	
}
