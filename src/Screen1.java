public class Screen1 {
    private String name;
    private int seatNo;

    @Override
    public String toString() {
        return STR."Screen 1 : { name='\{name}\{'\''}, seatNo=\{seatNo}\{'}'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
