package HW_5;

public class StaffWrapper implements Comparable<StaffWrapper> {
    private final String staff;
    private final Integer count;

    public StaffWrapper(String staff, Integer count) {
        this.staff = staff;
        this.count = count;
    }

    public String getStaff() {
        return staff;
    }

    public Integer getCount() {
        return count;
    }

//    @Override
    public int compareTo(StaffWrapper thatWord) {
        if (count > thatWord.getCount()) {
            return -1;
        }
        if (count < thatWord.getCount()) {
            return 1;
        }
        return staff.compareTo(thatWord.getStaff());
    }

//    @Override
    public String toString() {
        return staff + " -> " + count;
    }

}
