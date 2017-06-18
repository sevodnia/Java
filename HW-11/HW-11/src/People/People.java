package People;

public class People {

    private String name;
    private String surname;
    private String patronimic;

    public People(String name,  String patronimic, String surname) {
        this.name = name;
        this.patronimic = patronimic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    
	@Override
	public String toString()
	{
		return this.name+" "+this.patronimic+" "+this.surname;
	}
    
    
    
}
