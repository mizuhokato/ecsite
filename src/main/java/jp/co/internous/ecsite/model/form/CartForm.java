package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {
	
	private int userID;
	
	private List<Cart> cartList;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}
