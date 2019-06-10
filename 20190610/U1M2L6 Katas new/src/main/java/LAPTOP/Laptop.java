package LAPTOP;

public class Laptop {
  private Memory memory;
  private OpticalDrive optDrive;
  private Processor processor;

  public Laptop() {
  }

  public Memory getMemory() {
    return memory;
  }

  public void setMemory(Memory memory) {
    this.memory = memory;
  }

  public OpticalDrive getOptDrive() {
    return optDrive;
  }

  public void setOptDrive(OpticalDrive optDrive) {
    this.optDrive = optDrive;
  }

  public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(Processor processor) {
    this.processor = processor;
  }
}

