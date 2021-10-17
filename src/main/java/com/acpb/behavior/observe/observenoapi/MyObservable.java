package com.acpb.behavior.observe.observenoapi;

import com.acpb.behavior.observe.observenoapi.Myobserver;

import java.util.Observer;
import java.util.Vector;

public class MyObservable {
    private boolean changed = false;
    private Vector<Myobserver> obs = new Vector<>();
   //添加myobserve对象
    public synchronized void addObserver(Myobserver o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    //删除
    public synchronized void deleteObserver(Myobserver o) {
        obs.removeElement(o);
    }
    //是否改变
    protected synchronized void setChanged() {
        changed = true;
    }



    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {

        Object[] arrLocal;

        synchronized (this) {

            if (!changed)
                return;
            arrLocal = obs.toArray();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Myobserver)arrLocal[i]).update(this, arg);
    }
}
