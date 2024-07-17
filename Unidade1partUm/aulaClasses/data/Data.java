package Unidade1partUm.aulaClasses.data;

class Data{
    int dia, mes, ano;
    
    boolean dataValida() {
        return (dia >= 1 && dia <= 30 && mes >= 1 && mes<= 12 && ano>=0);
    }

    void inicializaData (int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    void mostraData (){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}