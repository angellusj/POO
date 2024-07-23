package Unidade1Part2.tupla;

public class Tupla <P, S>{
    private P pri;
    private S seg;

    public Tupla(P pri, S seg){
        this.pri = pri;
        this.seg = seg;
    }

    public P getPri(){
        return pri;
    }

    public void setPri(P pri){
        this.pri = pri;
    }

    public S getSeg(){
        return seg;
    }

    public void setSeg(S seg){
        this.seg = seg;
    }
}