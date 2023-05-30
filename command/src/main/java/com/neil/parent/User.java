package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/30
 */
public class User {

    public static void main(String[] args) {
        // 遥控器
        RemoteControl remoteControl = new RemoteControl();

        // 对象（Receiver）
        XiaoMiLight light1 = new XiaoMiLight("卧室1");
        XiaoMiLight light2 = new XiaoMiLight("卧室2");
        XiaoMiLight light3 = new XiaoMiLight("卧室3");
        XiaoMiLight light4 = new XiaoMiLight("卧室4");

        // 命令+对象（Receiver）
        LightOnCommand lightOnCommand1 = new LightOnCommand(light1);
        LightOffCommand lightOffCommand1 = new LightOffCommand(light1);
        LightOnCommand lightOnCommand2 = new LightOnCommand(light2);
        LightOffCommand lightOffCommand2 = new LightOffCommand(light2);
        LightOnCommand lightOnCommand3 = new LightOnCommand(light3);
        LightOffCommand lightOffCommand3 = new LightOffCommand(light3);
        LightOnCommand lightOnCommand4 = new LightOnCommand(light4);
        LightOffCommand lightOffCommand4 = new LightOffCommand(light4);

        // 遥控器按钮与命令绑定
        remoteControl.setCommand(0, lightOnCommand1, lightOffCommand1);
        remoteControl.setCommand(1, lightOnCommand2, lightOffCommand2);
        remoteControl.setCommand(2, lightOnCommand3, lightOffCommand3);
        remoteControl.setCommand(3, lightOnCommand4, lightOffCommand4);

        System.out.println(remoteControl);

        // 开启电灯
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        // 关闭电灯
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(3);
        System.out.println("-------- 撤销 ---------");
        // 撤销最后一步
        remoteControl.undoButtonWasPushed();

        // 全局模式
        Command[] allOn = {lightOnCommand1, lightOnCommand2, lightOnCommand3, lightOnCommand4};
        Command[] allOff = {lightOffCommand1, lightOffCommand2, lightOffCommand3, lightOffCommand4};

        AllCommand allOnCommand = new AllCommand(allOn);
        AllCommand allOffCommand = new AllCommand(allOff);

        System.out.println("-------- 全局模式 -------");
        remoteControl.setCommand(5, allOnCommand, allOffCommand);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
