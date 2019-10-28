package secao14;
//Interfaces - O que é e quando utilizar

/*
- Interfaces são conhecidas como "contratos".

Uma empresa criou um contrato 'com regras' para definir
a criação de um produto/serviço.

Quem implementar esse contrato é OBRIGADO a seguir as regras.

O João, decidiu criar um produto/serviço baseado nesse mesmo contrato.
A Maria, também decidiu criar um produto/serviço baseado no mesmo contrato.

Contrato para a confecção de um bolo.
    - O bolo precisa ser de chocolate;
    - O bolo deve ter cobertura;
    - O bolo deve ser recheado;
*/
public class Programa33 {
    
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();
        
        System.out.println("A marca do ventilador é " + vent.MARCA + ".");
        
        vent.desligar(); //Não deve imprimir a mensagem
        
        vent.ligar(); //Deve imprimir a mensagem
        
        vent.desligar(); //Aqui deve imprimir a mensagem
    }
    
}
