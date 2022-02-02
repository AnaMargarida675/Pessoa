package Exercicio5;

import java.util.Scanner;

public class exerciciosPessoas {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantas pessoas deseja registar: ");
        int J=sc.nextInt();
        Pessoas[]pessoas=new Pessoas[J];
        sc.nextLine();

        for(int i=0; i<J; i++)
        {
            System.out.print(" Insira o nome da " +(i+1)+ "ºpessoa: ");
            String nome = sc.nextLine();

            System.out.print("Insira o peso da " +(i+1)+ "ºpessoa: ");
            double peso = sc.nextDouble();

            System.out.print("Insira o altura da " +(i+1)+ "ºpessoa:");
            double altura = sc.nextDouble();
            sc.nextLine();
            Pessoas ps=new Pessoas(nome,peso,altura);
            pessoas[i]=ps;
        }
            double totalPeso=0;
            double totalAltura=0;
            double mediaPeso=0;
            double mediaAltura=0;
            double Pesomax=0;
            double Alturamax=0;

            for(int i=0;i<J;i++)
            {
                totalPeso+=pessoas[i].getPeso();
                totalAltura+= pessoas[i].getAltura();

                if(pessoas[i].getPeso()>Pesomax)
                    Pesomax=pessoas[i].getPeso();

                if(pessoas[i].getAltura()>Alturamax)
                    Alturamax=pessoas[i].getAltura();

            }
            mediaPeso=totalPeso/J;
            mediaAltura=totalAltura/J;

            for(int i=0;i<J;i++)
            {
                System.out.println("A" + (i+1)+ " ºpessoa" + pessoas[i].Nome + "com peso"+ pessoas[i].Peso
                        + "e com a altura"+ pessoas[i].Altura);
            }
            System.out.println("O peso medio é de: %2f%n " + mediaPeso);
            System.out.println("A altura media  é de: %2f%n " + mediaAltura);
            System.out.println("O peso máximo  é de: %2f%n " + Pesomax);
            System.out.println("A altura máxima  é de: %2f%n " + Alturamax);









    }
}
