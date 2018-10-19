public class Computer {
    private String name;
    private int timing;
    private int memory;

    public Computer(String name, int timing, int memory) {
        this.name = name;
        this.timing = timing;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name + "\nPrędkość procesora: " + timing + "MHz\nPamięć RAM: " + memory + "GB";
    }
}