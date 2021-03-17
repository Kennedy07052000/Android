package br.estacio.media;

public class Media {
    private double Av1;
    private double Av2;
    private double Av3;
    private double Av4;

    public Media() {
    }

    public Media(double av1, double av2, double av3, double av4) {
        this.Av1 = av1;
        this.Av2 = av2;
        this.Av3 = av3;
        this.Av4 = av4;
    }

    public double getAv1() {
        return this.Av1;
    }

    public void setAv1(double av1) {
        this.Av1 = av1;
    }

    public double getAv2() {
        return this.Av2;
    }

    public void setAv2(double av2) {
        this.Av2 = av2;
    }

    public double getAv3() {
        return this.Av3;
    }

    public void setAv3(double av3) {
        this.Av3 = av3;
    }

    public double getAv4() {
        return this.Av4;
    }

    public void setAv4(double av4) {
        this.Av4 = av4;
    }

    public double media() {
        return (this.Av1 + this.Av2 + this.Av3 + this.Av4) / 4;
    }

    public double maior() {
        if (Av1 > Av2 && Av1 > Av3 && Av1 > Av4) {
            return Av1;
        } else if (Av2 > Av1 && Av2 > Av3 && Av2 > Av4) {
            return Av2;
        } else if (Av3 > Av1 && Av3 > Av2 && Av3 > Av4) {
            return Av3;
        }
        return Av4;
    }

    public double menor() {
        if (Av1 < Av2 && Av1 < Av3 && Av1 < Av4) {
            return Av1;
        } else if (Av2 < Av1 && Av2 < Av3 && Av2 < Av4) {
            return Av2;
        } else if (Av3 < Av1 && Av3 < Av2 && Av3 < Av4) {
            return Av3;
        }
        return Av4;
    }

    public String status() {
        double media = this.media();
        if (media > 6) {
            return "Aprovado";
        } else if (media >= 4 && media <= 6) {
            return "Verificação Suplementar";
        }
        return "Reprovado";
    }
}
