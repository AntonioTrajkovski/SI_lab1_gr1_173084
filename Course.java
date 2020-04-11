class Course{

    ArrayList<Student> lista_od_studenti;

    public Course(ArrayList<Student> lista_od_studenti) {
        this.lista_od_studenti = lista_od_studenti;
    }

    public void dodadiStudent(Student student){
        lista_od_studenti.add(student);
    }
    
    public void izbrisiStudent(Student student){
        lista_od_studenti.remove(student);
    }
}