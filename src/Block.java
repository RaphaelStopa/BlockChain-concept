import java.util.Arrays;

public class Block {

    private String[] transactions;
    private int blockHash;
    private int previousBlackHash;

    public Block(String[] transactions, int previousBlackHash) {
        this.transactions = transactions;
        this.previousBlackHash = previousBlackHash;
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transactions), this.previousBlackHash});
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPreviousBlackHash() {
        return previousBlackHash;
    }

    public void setPreviousBlackHash(int previousBlackHash) {
        this.previousBlackHash = previousBlackHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "transactions=" + Arrays.toString(transactions) +
                ", blockHash=" + blockHash +
                ", previousBlackHash=" + previousBlackHash +
                '}';
    }
}
