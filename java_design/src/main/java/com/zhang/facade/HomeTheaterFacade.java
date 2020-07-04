package com.zhang.facade;

/**
 * 门面模式，联系各个设备
 */
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private DVDPalyer dvdPalyer;
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;
    private Projector projector;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.dvdPalyer = DVDPalyer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPalyer.on();
        theaterLight.dim();
    }
    public void paly(){
        dvdPalyer.play();
    }

    public void pause(){
        dvdPalyer.pause();
    }
    public void end(){
        dvdPalyer.off();
        screen.up();
        theaterLight.on();
    }
}
