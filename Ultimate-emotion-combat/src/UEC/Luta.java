
package UEC;

import java.util.Random;

public class Luta{
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int vidaDesafiado;
    private int vidaDesafiante;
    private int round;
    
    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar(){
        if(this.aprovada){
            
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("---------------------------");
            System.out.println("### DESAFIANTE ###");            
            this.desafiante.apresentar();
            
            vidaDesafiante = (int) (this.desafiante.getAltura() * this.desafiante.getPeso());
            vidaDesafiado = (int) (this.desafiado.getAltura() * this.desafiado.getPeso());
            round = 1;
            while(vidaDesafiante > 0 && vidaDesafiado > 0){
                Random aleatorio = new Random();
                       int golpe = aleatorio.nextInt(8);
                       System.out.println("=====ROUND " + round + "======");
                       round = round + 1;
                       
                       switch(golpe){
                           case 0: //Soco do desafiante
                               System.out.println("O " + this.desafiante.getNome() +
                                       " acertou um soco!!");
                               vidaDesafiado = vidaDesafiado - 20;
                               System.out.println("A vida de " + this.desafiado.getNome() +
                                       " e de " + vidaDesafiado);
                               break;
                           case 1: //Soco do desafiado
                               System.out.println("O " + this.desafiado.getNome() +
                                       " acertou um soco!!");
                               vidaDesafiante = vidaDesafiante - 20;
                               System.out.println("A vida de " + this.desafiante.getNome() +
                                       " e de " + vidaDesafiante);
                               break;
                           case 2: //Chute do desafiante
                               System.out.println("O " + this.desafiante.getNome() +
                                       " acertou um chute!!");
                               vidaDesafiado = vidaDesafiado - 25;
                               System.out.println("A vida de " + this.desafiado.getNome() +
                                       " e de " + vidaDesafiado);
                               break;
                           case 3: //Chute do desafido
                               System.out.println("O " + this.desafiado.getNome() +
                                       " acertou um chute!!");
                               vidaDesafiante = vidaDesafiante - 25;
                               System.out.println("A vida de " + this.desafiante.getNome() +
                                       " e de " + vidaDesafiante);
                               break;
                           case 4: //Nocaute do desafiado
                               System.out.println("O " + this.desafiante.getNome() +
                                       " NOCAUTEOU o " + this.desafiado.getNome());
                               vidaDesafiado = 0;
                               break;
                           case 5: //Nocaute do desafiante
                               System.out.println("O " + this.desafiado.getNome() +
                                       " NOCAUTEOU o " + this.desafiante.getNome());
                               vidaDesafiante = 0;
                               break;
                           case 6: //Golpe critico desafiante
                               System.out.println("O " + this.desafiante.getNome() +
                                       " acertou um Golpe Critico!!");
                               vidaDesafiado = vidaDesafiado - 35;
                               System.out.println("A vida de " + this.desafiado.getNome() +
                                       " e de " + vidaDesafiado);
                               break;
                           case 7: //Golpe critico desafiado
                               System.out.println("O " + this.desafiado.getNome() +
                                       " acertou um Golpe Critico!!");
                               vidaDesafiante = vidaDesafiante - 35;
                               System.out.println("A vida de " + this.desafiante.getNome() +
                                       " e de " + vidaDesafiante);
                    
                        }
                
                }
                if(vidaDesafiante <= 0){
                    System.out.println("O vencedor foi " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }else{
                    System.out.println("O vencedor foi " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                        
            }
           
            
            System.out.println("================================================");
            
        }else{
           System.out.println("A luta não pode acontecer");
           System.out.println("=========================");
        }
    }
    
    
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
