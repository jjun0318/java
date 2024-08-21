import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception {

//        Properties 개체 생성
        Properties prop = new Properties();
        
//        getPath() : 지정한 파일의 전체 경로 출력
//        getResource() : 사용한 설정 파일 지정
        String path = PropertiesEx.class.getResource("database.properties").getPath();
//        URLDecoder : 웹에서 사용하는 인코딩 방식을 일반 문자열 방식으로 변환
//        맵에서는 모든 주소를 영문으로 사용함
//        다른 언어와의 문자셋 문자가 발생하기 때문에 웹 전용으로 문자셋을 변환하여 사용함
        path = URLDecoder.decode(path, "UTF-8");
        prop.load(new FileReader(path));

        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String userId = prop.getProperty("username");
        String userPw = prop.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("userId : " + userId);
        System.out.println("userPw : " + userPw);
    }
}
