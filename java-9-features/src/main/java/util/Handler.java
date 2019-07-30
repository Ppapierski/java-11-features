package util;

public interface Handler<T> {

    void handle(T t);
    void dontHandle(T t);
}
