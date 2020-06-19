public class Car {
    //2 member dalam class
    //1. field
    //2. method

    private String model;
    private int doors;
    private int wheels;
    private String engine;

    //setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("Agya") || validModel.equals("Xenia")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }


    }
    //getter
    public String getModel(){
        return this.model;
    }

}
