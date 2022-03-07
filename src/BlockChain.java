import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlockChain {
    public static void main(String[] args) {


        ArrayList<Block> blockChain = new ArrayList<>();

        String[] initialValues = {"Stopa $300", "Jhon $900"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock);
        System.out.println("The block chain is " + blockChain);

        System.out.println("===================== blockHash=-793214696");

        String[] jhonChangeValues = {"Jhon -$300", "Jhon +$900"};
        Block secondBlock = new Block(jhonChangeValues, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock);
        System.out.println("The block chain is " + blockChain);

        System.out.println("===================== blockHash=-842425580");


        String[] jhonAgain = {"Jhon -$5", "Jhon +$10"};
        Block thirdBlock = new Block(jhonAgain, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Second block is " + thirdBlock);
        System.out.println("The block chain is " + blockChain);

        System.out.println("===================== lockHash=2099903156");

        System.out.println("If someone changed the values of a block the hash would change, including the following blocks, indicating this tampering attempts");
    }
}
