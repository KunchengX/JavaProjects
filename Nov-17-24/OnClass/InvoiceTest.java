public class InvoiceTest {
    public static void main(String[] args) {
        Invoice Invoice1 = new Invoice();
        Invoice1.setInfo("r43wew4", "coffee", 23, 400);
        Invoice1.getInfo();
        //Invoice1.setPrice(-100);
        Invoice1.setQuantity(-900);
        double invoiceAmount;
        invoiceAmount = Invoice1.getInvoiceAmount();
        System.out.println(invoiceAmount);
    }
}

class Invoice {
    String number;
    String description;
    int quantity;
    double price;

    public void setInfo(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void getInfo(){
        System.out.println(number + " " + description + " " + quantity + " " + price);
    }

    public String getNumber(){
        return number;
    }

    public String getDescription(){
        return description;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getInvoiceAmount(){
        double InvoiceAmount;
        if (this.quantity <= 0){
            this.quantity = 0;
        }
        if (this.price <= 0){
            this.price = 0;
        }
        InvoiceAmount = this.quantity * this.price;
        return InvoiceAmount;
    }
}
