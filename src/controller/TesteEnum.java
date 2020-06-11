package controller;
public enum TesteEnum {
	TodosOsValores(-1);
	
	private final int id;
    TesteEnum(int id) {this.id = id;}
    public int getValue() {return id;}

    public static TesteEnum fromValue(int id) {
        for (TesteEnum aip: values()) {
            if (aip.getValue() == id) {
                return aip;
            }
        }
        return null;
    }

}
