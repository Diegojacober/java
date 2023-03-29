import java.util.Scanner;

public class ColisaoDeTrens {
    public static void main(String[] args) {
        double velA, velB, posA, posB;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Deseja ver o desafio? ");
            String resp = sc.nextLine().toLowerCase();
            String r = resp.substring(0,1);
            if (r.equals("n")){
                break;
            }

            posA = getDouble("Digite a posição do trem A: ");
            posB = getDouble("Digite a posição do trem B: ");



            if (posA == posB) {
                System.out.println("Os trens já colidiram");
            }else if((posB >= 0 && posA > 10000) || ( posB >= 0 && posB > 10000 )) {
                System.out.println("A posição do trem deve ser menor ou igual a 10.000 e maior ou igual a 0");
                continue;
            }
            else {
                velA = getVelocidade("Digite a velocidade do trem A: ");
                velB = (getVelocidade("Digite a velocidade do trem B: "));
                if (velA < 0) {
                    velA = velA * -1;
                }
                if (velB > 0){
                    velB = velB * -1;
                }
                double[] temp = tempo(posA, posB, velA, velB);


                double posicaoFinalA = posA + velA * temp[0];
                double posicaoFinalB = posB + velB * temp[0];
                double horaInicial = 61200;
                double horaFinal = (horaInicial + temp[1]) / 60 / 60;
                System.out.println("Eles vão colidir após "+temp[1]+" segundos, no KM "+posicaoFinalA+" as "+horaFinal);
            }
        }
    }

    public static double[] tempo(double SOa, double SOb, double Va, double Vb){
        double[] t = new double[2];
        t[0] = (SOa - SOb)/(Vb - Va);
        t[1] = t[0] * 60 * 60;
        return t;
    }

    public static int getInt(String msg){
        Scanner sc = new Scanner(System.in);
        String numero;
        int num;
        while (true){
            try {
                System.out.print(msg);
                numero = sc.nextLine().strip();
                num = Integer.parseInt(numero);

                if (num == (int) num) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Erro digite apenas números: " + e);
            }

        }
    }

    public static double getDouble(String msg){
        Scanner sc = new Scanner(System.in);
        String numero;
        Double num;
        while (true){
            try {
                System.out.print(msg);
                numero = sc.nextLine().strip();
                num = Double.parseDouble(numero);

                if (num == (Double) num) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Erro digite apenas números: " + e);
            }

        }
    }

    public static double getVelocidade(String msg){
        Scanner sc = new Scanner(System.in);
        String numero;
        Double num;
        while (true){
            try {
                System.out.print(msg);
                numero = sc.nextLine().strip();
                num = Double.parseDouble(numero);

                if (num == (Double) num && (num < 300.00 && num > 0.00)) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Erro digite apenas números e velocidades menores ou iguais a 300km/h ");
            }

        }
    }


}
