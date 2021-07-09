package productdto.comparable;

import java.util.Date;

public class ProductDto implements Comparable<ProductDto>{
	private int productKey;
	private String productDescription;
	private Date productCreationDate;
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
		
		if(p.productKey==this.productKey)
			return true;
		return false;
	}


	public String toString() {
		return "productKey:"+productKey;
	}
	
	@Override
	public int compareTo(ProductDto o) {
		int flag=  o.getProductCreationDate().compareTo(getProductCreationDate());
		if(flag==0)
			return getProductKey()-o.getProductKey();
		return flag;
	}
}
