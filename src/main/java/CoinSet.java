import java.util.ArrayList;
import java.util.List;

public class CoinSet {

    private List <Integer> coinSets = new ArrayList<Integer>();

    public void add(int coin){
        this.coinSets.add(coin);
    }

    @Override
    public boolean equals(Object coinSet){
        if( !(coinSet instanceof CoinSet)){
            return false;
        }

        return this.toString().equals( coinSet.toString() );
    }
}
