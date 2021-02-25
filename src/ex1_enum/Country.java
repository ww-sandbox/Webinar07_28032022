package ex1_enum;

public enum Country {
    PL("Poland"), DE("Germany"), UK("United Kingdom");

    Country(String fullName){
        this.fullName = fullName;
    }
    private String fullName;

    public String getFullName(){
        return fullName;
    }

}
