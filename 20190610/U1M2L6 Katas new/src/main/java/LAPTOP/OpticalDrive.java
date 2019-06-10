package LAPTOP;

public class OpticalDrive {
    private Boolean isDVD;
    private String mechanism;

    public OpticalDrive() {
    }

    public Boolean getDVD() {
        return isDVD;
    }

    public void setDVD(Boolean DVD) {
        isDVD = DVD;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }
}
