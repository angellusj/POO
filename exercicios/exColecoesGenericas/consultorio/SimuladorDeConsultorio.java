package exercicios.exColecoesGenericas.consultorio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SimuladorDeConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> prioridade = new LinkedList<>();
        Queue<Paciente> comum = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int rg = generateRandomRG(random);
            int age = generateRandomAge(random);

            Paciente patient = new Paciente(rg, age);
            if (age > 60) {
                prioridade.add(patient);
            } else {
                comum.add(patient);
            }

            if (i < 19) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            Paciente pacientesParaAtendimento = null;
            if (!prioridade.isEmpty()) {
                pacientesParaAtendimento = prioridade.poll();
            } else if (!comum.isEmpty()) {
                pacientesParaAtendimento = comum.poll();
            }

            if (pacientesParaAtendimento != null) {
                System.out.println("Atendendo paciente de RG: " + pacientesParaAtendimento.getRg() + " e idade: " + pacientesParaAtendimento.getAge());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Nenhum paciente para atender.");
            }
        }
    }

    private static int generateRandomRG(Random random) {
        return 100000000 + random.nextInt(900000000);
    }

    private static int generateRandomAge(Random random) {
        return 1 + random.nextInt(90);
    }

}

