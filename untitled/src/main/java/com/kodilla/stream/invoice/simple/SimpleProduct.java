package com.kodilla.stream.invoice.simple;

public class SimpleProduct {

    private final String productName;
    private final double productPrice;


    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() { return productName; }

    public double getProductPrice() { return productPrice; }



@Override
    public boolean equals(Object o){
        //metoda sprawdza nazwę produktu w celu wykrycia duplikatów
        if (this == o) return true;
        if (! (o instanceof SimpleProduct)) return true;
        SimpleProduct simpleProduct = (SimpleProduct) o;
        return productName.equals(simpleProduct.getProductName());
}

}
