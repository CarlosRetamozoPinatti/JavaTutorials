package com.computerproperties;

import com.computerproperties.components.*;

public class FullComputer {
    private final int idComp;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Processor processor;
    private Psu psu;
    private RamMemory ramMemory;
    private VideoCard videoCard;
    private Cabinet cabinet;
    private static int compCount;

    private FullComputer(){
        this.idComp = ++compCount;
    }

    public FullComputer(String name, Monitor monitor,Keyboard keyboard, Mouse mouse, Processor processor, Psu psu,
                        RamMemory ramMemory, VideoCard videoCard, Cabinet cabinet){
        this();
        this.name = name;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.processor = processor;
        this.psu = psu;
        this.ramMemory = ramMemory;
        this.videoCard = videoCard;
        this.cabinet = cabinet;

    }

    public int getIdComp() {
        return idComp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Psu getPsu() {
        return psu;
    }

    public void setPsu(Psu psu) {
        this.psu = psu;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public String toString() {
        return "FullComputer{" +
                "idComp=" + idComp +
                ", name='" + name + '\'' +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", processor=" + processor +
                ", psu=" + psu +
                ", ramMemory=" + ramMemory +
                ", videoCard=" + videoCard +
                ", cabinet=" + cabinet +
                '}';
    }
}
