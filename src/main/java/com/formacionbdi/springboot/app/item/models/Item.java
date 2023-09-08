package com.formacionbdi.springboot.app.item.models;


public class Item {

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	private Producto producto;
	private Integer cantidad;

	public Item(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
	public Double getTotal() {
		return producto.getPrecio() *cantidad.doubleValue();
		
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Item [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
}
