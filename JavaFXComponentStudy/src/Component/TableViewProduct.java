/**
 * 
 */
package Component;

/**
 * ClassName: TableViewProduct <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月21日 下午12:00:24 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */

public class TableViewProduct {
	private String name;
	private double price;
	private int quantity;

	/**
	 * Creates a new instance of Product.
	 * 
	 */
	public TableViewProduct() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}

	public TableViewProduct(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
