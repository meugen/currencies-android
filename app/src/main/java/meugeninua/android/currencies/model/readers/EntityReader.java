package meugeninua.android.currencies.model.readers;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public interface EntityReader<T> {

    T readOne(Reader reader) throws XmlPullParserException, IOException;

    List<T> readList(Reader reader) throws XmlPullParserException, IOException;

    void readOne(Reader reader, OnEntityReadListener<T> listener) throws XmlPullParserException, IOException;

    void readList(Reader reader, OnEntityReadListener<T> listener) throws XmlPullParserException, IOException;

    interface OnEntityReadListener<T> {

        boolean onEntityRead(T entity);
    }
}
