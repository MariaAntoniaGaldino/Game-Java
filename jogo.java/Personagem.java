public class Personagem {
    boolean vivo = true;
    int vida = 100;
    int poderAtaque = 5;
    int defesa = 2; 
    int nivel = 1; 
    int experiencia = 0; 
    String nome; 
    
    
    public void atacar( Personagem alvo){
        System.out.println(thid.nome+"atacou" alvo.nome);

        int dano = this.poderAtaque - alvo.defesa;
        if(dano >0) {
            alvo.vida -=dano;
            this.experiencia += 10;
            System.out.println(alvo.nome+"ficou com "+alvo.vida);
            this.verXP();

            if (alvo.vida <=0){
                alvo.vivo = false;
                System.out.println(alvo.nome+"morreu!");
                System.out.println("parabens" + this.nome +"voce venceu!");
            }
            else{
            System.out.println("O oponente é forte demais, nennhum dano foi causado!");
        }

        }

    public verXP(){

        if (this.experiencia >= 100) (
            this.nivel++;
            this.nivel defesa +=2 ;
            this.poderAtaque += 5;
            this.recuperar();
            this.experiencia = this.experiencia - 100;
            System.out.println(this.nome +"subiu um nivel, seu nivel atual é "+this.nivel);
            this.recuperar();
        )

    }
    }
    public void treinar(){
        this.experiencia += 50; 
        System.out.println(this.nome+"treinou");
        this.verXp();

        if (this.experiencia >= 100) (
            this.nivel++;
            this.nivel defesa +=2 ;
            this.poderAtaque += 5;
            this.recuperar();
            this.experiencia = this.experiencia - 100;
        )
    }
    public void recuperar(){
        this.vida += 20;

        if (this.vida >100)(
            this.vida = 100;
        )
    }

/* 
* ATRIBUTOS 
* VIVO 
* nome 
* experienciia
*vida
*nivel
* poder de ataque 
* defesa
*
*METODOS
*atacar 
*treinar 
*recuperar
*/


}