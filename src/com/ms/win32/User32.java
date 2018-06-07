package com.ms.win32;

import com.ms.dll.Callback;

public class User32 {

    public static int LoadCursor(int i, int j) {
        System.out.println("User32.LoadCursor");
        return 0;
    }

    public static void SendMessage(int i, int j, int k, int l) {
        System.out.println("User32.SendMessage");
    }

    public static void SetWindowLong(int i, int j, int k) {
        System.out.println("User32.SetWindowLong");
    }

    public static int SetWindowLong(int i, int j, Callback callback) {
        System.out.println("User32.SetWindowLong");
        return 0;
    }

    public static void SetCursorPos(int i, int j) {
        System.out.println("User32.SetCursorPos");
    }

    public static int GetWindowLong(int i, int j) {
        System.out.println("User32.GetWindowLong");
        return 0;
    }

    public static int CallWindowProc(int i, int j, int k, int l, int m) {
        System.out.println("User32.CallWindowProc");
        return 0;
    }

    public static void SetCursor(int i) {
        System.out.println("User32.SetCursor");
    }

	public static int SetWindowLong(int anInt637, int j, Object object) {
		// TODO Auto-generated method stub
		return 0;
	}
}
