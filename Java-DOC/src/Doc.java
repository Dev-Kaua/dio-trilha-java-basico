//!Documentação na linguagem Java:
//?     
/*
 !Existem comentários de linha unica, comentários de mais de uma linha E comentários a nivel de documentação.

 !Javadoc:
 ?  é um gerador de documentação criado pela Sun, para gerar uma documentação/api
 ?  visual para que a gente possa terc acesso de naveagção.
 ?  criando nossa documentação no formato html para disponibilizar via web:
    no terminal execute o comando abaixo
 ?  javadoc-encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
 *      a sugestão é: voçê volta um nível, cria uma pasta docs e vou pegar todos os meus arquivos que estão dentro
 *      desse src que tem a extensão .java ; 
 */

public class Doc {

    public void main(String[]args){

        //olá, eu sou um comentário de uma unica linha.
        
        /*
        eu sou um comentário que pode
        ser mais detalhado quando necessário.
        */
    }

    /**
     * Estas duas estrelinhas acima
     * é para identificar que voçê 
     * pretende elaborar um comentário a nível de documentação.
     * Que incrivel!!
     */
    public void metodo(){}
    
}