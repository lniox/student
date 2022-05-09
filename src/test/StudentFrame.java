package test;
import windows.LoginWindow;
import windows.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
AWT是Abstract Windowing Toolkit 的缩写 意思是：Java抽象窗口工具
java中EventQueue的作用_Swing之EventQueue简介:https://blog.csdn.net/weixin_30677191/article/details/114961331
 */
public class StudentFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
            if (loginWindow.getDefaultCloseOperation()
                    ==WindowConstants.DISPOSE_ON_CLOSE) {
        System.out.println("Login Successfully");
        EventQueue.invokeLater(() -> {
            var mainWindow = new MainWindow(loginWindow.getUserName());
            mainWindow.setLocationRelativeTo(null);
        });
            }
            }
        });
        });
    }
}