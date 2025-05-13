package za.ac.cput.domain.product;
/*Oluhle Makhaye
* 222419636*/

public class Brand {
    private int brandID;
    private String brandName;

    private Brand() {

    }

    private Brand(Builder builder){

    }

    public int getBrandID() {
        return brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandID=" + brandID +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public static class Builder {
        private int brandID;
        private String brandName;

        public Builder setBrandID(int brandID) {
            this.brandID = brandID;
            return this;
        }

        public Builder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Brand copy(Brand brand){
            this.brandID = brand.brandID;
            this.brandName = brand.brandName;
            return this.build();
        }

        public Brand build(){return new Brand(this);}
    }

}
