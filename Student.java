import java.util.ArrayList;

class Student {
    String index;
    String firstName;
    String lastName;
    ArrayList<Integer> labPoints;

    //TODO constructor

    public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }


    //TODO seters & getters


    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Integer> getLabPoints() {
        return labPoints;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLabPoints(ArrayList<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public double getAverage() {
        //TODO
        double vkupno = 0;
        double prosecen_broj = 0;
        for (int i=0; i < labPoints.size(); i++){
            vkupno += labPoints.get(i);
        }
        prosecen_broj = vkupno / labPoints.size();
        return prosecen_broj;
    }

    public boolean hasSignature() {
        //TODO
        return labPoints.size() > 8;
    }
}
