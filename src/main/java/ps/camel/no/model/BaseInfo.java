package ps.camel.no.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true, ignoreMissingChars = true)
public abstract class BaseInfo {



}
