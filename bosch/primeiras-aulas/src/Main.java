public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome 2 Bosch");
        System.out.println("Welcome to ETS");

        int raio = 5;
        final double pi = 3.141;
        double areaCirculo = (pi * raio * raio );

        System.out.printf("A areá do circulo é %.2f",areaCirculo);


        //Tipos de variaveis inteiras
        byte meuByte = 127;
        System.out.printf("Tamanho do Byte: %d \n",meuByte);
        short meuShort = 32767;
        System.out.printf("Tamanho do Short: %d \n",meuShort);
        int meuInt = 2_147_483_647;
        System.out.printf("Tamanho do Int: %d \n", meuInt);
        long meuLong = 9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do Long: %d \n", meuLong);

        //Tipos de dados reais
        float meuFloat = 3.4e+38F;
        System.out.printf("Valor do Float: %f \n", meuFloat);
        double meuDouble = 1.7e+308D;
        System.out.printf("Valor do Double: %f \n", meuDouble);
        char meuCaracter = 'D';
        System.out.printf("Meu caracter: %c \n",meuCaracter);

    }
}