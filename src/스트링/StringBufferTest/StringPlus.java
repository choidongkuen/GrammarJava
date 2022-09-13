// 기존의 StringBuffer,StringBuilder 에 appendLine(), appendFormat()을 더해주고 싶음


package 스트링.StringBufferTest;

public class StringPlus {

    StringBuilder sb = null;

    StringPlus(){
        sb = new StringBuilder(32);
    }

    public void append(String str){
        sb.append(str);
    }
    public String toString(){
        return sb.toString();
    }

    public StringPlus appendFormat(String format, Object... args){
        sb.append(String.format(format,args));
        return this;
    }

    public StringPlus line(){
        sb.append(System.lineSeparator());
        return this;
    }

    public StringPlus appendLine(String str){
        this.append(str);
        this.line();
        return this;
    }
}
