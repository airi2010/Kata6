package kata_6.control;

import kata_6.model.Block;

public class DownCommand implements Command{
    private final Block block;
    
    public DownCommand(Block block) {
        this.block = block;
    }
    
    @Override
    public void execute(){
        block.down();
    }
}
