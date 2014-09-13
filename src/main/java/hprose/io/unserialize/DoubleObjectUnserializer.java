/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * DoubleObjectUnserializer.java                          *
 *                                                        *
 * Double unserializer class for Java.                    *
 *                                                        *
 * LastModified: Sep 13, 2014                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.unserialize;

import hprose.io.HproseReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class DoubleObjectUnserializer implements HproseUnserializer {

    public final static HproseUnserializer instance = new DoubleObjectUnserializer();

    public Object read(HproseReader reader, Class<?> cls, Type type) throws IOException {
        return reader.readDoubleObject();
    }

}
