package kata6.control;

import kata6.model.Block;

/**
 *
 * @author Airam
 */
public class timeCommand implements Command{
    private final Block block;

    public timeCommand(Block block) {
        this.block = block;
    }
    public void close(){
        block.stop();
    }
    @Override
    public void execute() {
       block.time();
    }
    
}
