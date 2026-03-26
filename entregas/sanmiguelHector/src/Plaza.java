class Plaza {
    
    private int tipoPlaza;
    private boolean ocupada;
    private String matriculaVehiculo;


    public Plaza (int tipoPlaza, boolean ocupada){
        assert tipoPlaza == 1 || tipoPlaza == 2 ||tipoPlaza == 3 : "No es un tipo de plaza válido";
        this.tipoPlaza = tipoPlaza;
        this.ocupada = ocupada;
    }

    public boolean estaOcupada(){
        return this.ocupada;
    }

    public int precioPlaza(){}

    public String quienOcupaPlaza(){}

    public void mostrarDatos(){}

}