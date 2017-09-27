import com.leilao.Avaliador;
import com.leilao.Lance;
import com.leilao.Leilao;
import com.leilao.Usuario;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Michel Berigo
 */
public class TesteDoAvaliador {
    
    @Test
    public void main () {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("PS3");
        
        leilao.propoe(new Lance (joao, 250.0));
        leilao.propoe(new Lance (jose, 300.0));
        leilao.propoe(new Lance (maria, 400.0));
        
        Avaliador leiloeiro = new Avaliador ();
        leiloeiro.avalia (leilao);
        
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
}
