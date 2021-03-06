package com.csshu.command;


/**
 * 实现一个车库门的开关命令
 * @author shujianhua
 *
 */

public class GarageDoorOpenCommand implements Command{  // 这是一个命令，所以需要实现命令接口
	Light light;

	public GarageDoorOpenCommand(Light light) {	// 构造器传入了某个电灯，比方说客厅的电灯
		this.light = light;			// 以便让这个命令控制，然后记录在实例变量中，一旦调用execute
								// ，就由这个电灯对象成为接受者，负责接受请求。
	}
	
	@Override
	public void execute() {	// 这个execute方法调用接受对象(我们正在控制的电灯)的On方法,由子类去实现
		light.on();
	}
	
}
