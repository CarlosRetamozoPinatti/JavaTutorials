package computerAssembler;

import com.computerproperties.FullComputer;
import com.computerproperties.Order;
import com.computerproperties.components.*;

public class Assembler {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 32);
        Mouse mouseLogitech = new Mouse("USB", "Logitech");
        Keyboard keyboardLogitech = new Keyboard("USB", "Logitech");
        Processor processorAMD = new Processor("AMD", 3600, "185 W");
        Psu psuSentey = new Psu("Sentey", 750);
        VideoCard videoCardAMD = new VideoCard("AMD", 8);
        RamMemory ramMemoryHYPERX = new RamMemory("HyperX", 32, 3200);
        Cabinet cabinetSentey = new Cabinet("Sentey", "Tower");
        FullComputer fullComputerCustom = new FullComputer("Gaming Custom", monitorHP, keyboardLogitech, mouseLogitech, processorAMD, psuSentey, ramMemoryHYPERX, videoCardAMD, cabinetSentey);

        Monitor monitorGenius = new Monitor("Genius", 15);
        Mouse mouseGenius = new Mouse("USB", "Genius");
        Keyboard keyboardGenius = new Keyboard("USB", "Genius");
        Processor processorCeleron = new Processor("Intel Celeron", 3600, "75 W");
        Psu psuATX = new Psu("ATX", 750);
        VideoCard videoCardGeneric = new VideoCard("Generic", 1);
        RamMemory ramMemoryDDR3 = new RamMemory("Generic", 2, 1333);
        Cabinet cabinetGeneric = new Cabinet("Generic", "Tower");
        FullComputer fullComputerOffice = new FullComputer("Gaming Custom", monitorGenius, keyboardGenius, mouseGenius, processorCeleron, psuATX, ramMemoryDDR3, videoCardGeneric, cabinetGeneric);

        Order order01 = new Order();
        order01.addPc(fullComputerCustom);
        order01.addPc(fullComputerOffice);

        order01.showOrder();
    }
}
