package labWorkover_loading_rridding;

class BANK { //parent class 
    float getRateOfInterest() { //get interest in float 
        return 0;
    }
}

class SBI extends BANK { //child class 
    float getRateOfInterest() {
        return 8.0f;
    }
}

class ICICI extends BANK { //child class
    float getRateOfInterest() {
        return 7.0f;
    }
}

class AXIS extends BANK { //child class
    float getRateOfInterest() {
        return 9.0f;
    }
}

public class Bank_LabWork { //main class
    public static void main(String[] args) {
        SBI sbi = new SBI(); //object creating
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("The SBI Bank Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("The ICICI Bank Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("The AXIS Bank Rate of Interest: " + axis.getRateOfInterest());
    }
}