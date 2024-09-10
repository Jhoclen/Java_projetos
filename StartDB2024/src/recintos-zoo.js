/*


    1) Um animal se sente confortável se está num bioma adequado e com espaço suficiente para cada indivíduo
    2) Animais carnívoros devem habitar somente com a própria espécie
    3) Animais já presentes no recinto devem continuar confortáveis com a inclusão do(s) novo(s)
    4) Hipopótamo(s) só tolera(m) outras espécies estando num recinto com savana e rio
    5) Um macaco não se sente confortável sem outro animal no recinto, seja da mesma ou outra espécie
    6) Quando há mais de uma espécie no mesmo recinto, é preciso considerar 1 espaço extra ocupado
    7) Não é possível separar os lotes de animais nem trocar os animais que já existem de recinto (eles são muito apegados!).
    Por exemplo, se chegar um lote de 12 macacos, não é possível colocar 6 em 2 recintos.
 */

class RecintosZoo {
    
    constructor(){

        
        this.animais = {
            'LEAO': { tamanho: 3, biomas: ['savana'], carnivoro :true , nome:'LEAO'},
            'LEOPARDO': { tamanho: 2, biomas: ['savana'], carnivoro :true , nome:'LEOPARDO' },
            'CROCODILO': { tamanho: 3, biomas: ['rio'] , carnivoro :true , nome:'CROCODILO' },
            'MACACO': { tamanho: 1, biomas: ['savana', 'floresta'], carnivoro : false , nome:'MACACO' },
            'GAZELA': { tamanho: 2, biomas: ['savana'] , carnivoro :false , nome:'GAZELA'},
            'HIPOPOTAMO': { tamanho: 4, biomas: ['savana', 'rio'], carnivoro :false , nome:'HIPOPOTAMO'}
        }

        this.recintos = [
            { numero: 1, bioma: 'savana', tamanhoTotal: 10, animaisExistentes: {especie:'MACACO', quantidade: 3, peso: 1}, espacoDisponivel: 0 },
            { numero: 2, bioma: 'floresta', tamanhoTotal: 5, animaisExistentes: { especie:0}, espacoDisponivel: 0},
            { numero: 3, bioma: 'savana e rio', tamanhoTotal: 7, animaisExistentes:{especie:'GAZELA', quantidade: 1, peso:2} , espacoDisponivel: 0 },
            { numero: 4, bioma: 'rio', tamanhoTotal: 8, animaisExistentes: {especie:0}, espacoDisponivel: 0 },
            { numero: 5, bioma: 'savana', tamanhoTotal: 9, animaisExistentes: {especie:'LEAO', quantidade: 1, peso:3} , espacoDisponivel: 0 }
        ]

        
    }
   

    analisaRecintos(animal, quantidade) {
        if(!this.animais[animal.toUpperCase()]){
            return console.log('animal inválido')//{ erro: "Animal inválido" }
        }
        if(quantidade <= 0){
            return console.log('quantidade inválida')//{ erro: "Quantidade inválida" }
        }
        // if(animal == 'MACACO'){
        //    return console.log('ACHAMOS O MAMACO')
        //}
        const especie = this.animais[animal.toUpperCase()];
        const tamanhoOcupado = especie.tamanho * quantidade
        const recintosViaveis = []
        const recintosValBioma = []
        
       //função para  catalogar o espeço disponivel nos biomas 
        function calcularEspacoDisponivel(recintosValBioma){
            for(const res of recintosValBioma){
                if(res.animaisExistentes.especie == 0 ){
                    res.espacoDisponivel = res.tamanhoTotal 
    
                }else{
                   res.espacoDisponivel = res.tamanhoTotal - (res.animaisExistentes.quantidade * res.animaisExistentes.peso)
                }
               
                
            }   
            
        }
        
       
        // for loop para adicionar o bioma correspondente ao input no array
        for(const recinto of this.recintos){
            if (especie.biomas.some(bioma => recinto.bioma.includes(bioma))) {
                recintosValBioma.push(recinto)
                    
            }
        }
       function testarCarnivoro(recintosValBioma){
            if (especie.carnivoro){
                for(const res of recintosValBioma){
                    if(especie.nome == res.animaisExistentes.especie || res.animaisExistentes.especie == 0 ){
                        recintosViaveis.push(res)
                    }

                }
                
            }else{
                for(const res of recintosValBioma){
                    const animaiscarne = ['LEAO' ,'CROCODILO','LEOPARDO' ]
                        if(res.animaisExistentes.especie != 'LEAO' ){
                            recintosViaveis.push(res)
    
                        }else if(res.animaisExistentes.especie != 'CROCODILO' ){
                            recintosViaveis.push(res)

                        }else if(res.animaisExistentes.especie != 'LEOPARDO' ){
                            recintosViaveis.push(res)
                        }
                    
                   


                }
                
              
                
            }
       }
       
        
        calcularEspacoDisponivel(recintosValBioma)
        testarCarnivoro(recintosValBioma)
        console.log(recintosViaveis)
        console.log("---------------------------------------------------------")
        console.log(recintosValBioma)
        
        //console.log(this.recintos[2].bioma)
       // erro na galeza
    }           
}
const zoo = new RecintosZoo
zoo.analisaRecintos('macaco',1)

export { RecintosZoo as RecintosZoo };

