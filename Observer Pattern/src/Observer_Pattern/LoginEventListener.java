package Observer_Pattern;

import java.util.EventListener;

public interface LoginEventListener extends EventListener {
	//抽象观察者（登录事件监听器）
	public void validateLogin( LoginEvent event );//声明响应方法

}
