package kata_6.control;

import kata_6.model.Block;

public class LeftCommand implements Command{
    private final Block block;

    public LeftCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute(){
        block.left();
    }
}
