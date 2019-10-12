class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sexId;
    protected String sex;

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    Pet() {}

    Pet(String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(int sexId) {
        switch(sexId) {
            case 1:
                sex = "Male";
                break;
            case 2:
                sex = "Female";
                break;
            case 3:
                sex = "Spayed";
                break;
            case 4:
                sex = "Neutered";
                break;
        }
    }
    
    public String toString(){
        return name+ " owned by " +ownerName+ "\n" +
                "Color: " +color+ "\n" +
                "Sex: " +getSex();
    }

}