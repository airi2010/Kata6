package kata_6.control;

import kata_6.model.Block;

public class UpCommand implements Command{
    private final Block block;

    public UpCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute(){
        block.up();
    }
}
