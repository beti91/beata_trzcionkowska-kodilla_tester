public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }


    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("light");
        } else if (this.weight > 600 && this.weight < 1600) {
            System.out.println("not very heavy");
        } else {
            System.out.println("very heavy");
        }
    }


public void checkPriceYear(){
    if (this.price <= 500 && this.year <= 2015 ) {
        System.out.println("laptop is cheap because old");
    } else if (this.price > 500 && this.price <=1000 && this.year >2015 && this.year <=2018) {
        System.out.println("this laptop is good");
    } else {
        System.out.println("laptop is very good");

    }
    }
}





