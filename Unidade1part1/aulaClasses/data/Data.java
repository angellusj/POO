package Unidade1part1.aulaClasses.data;

class Data{
    private int dia, mes, ano;
    
    public boolean dataValida() {
        return (dia >= 1 && dia <= 30 && mes >= 1 && mes<= 12 && ano>=0);
    }

    public void inicializaData (int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void mostraData (){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}