package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import core.GoogleService;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private List<String> mailList=new ArrayList<String>();
    private List<String> passwordList=new ArrayList<String>();

    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserDao userDao, GoogleService googleService) {

        super();
        this.userDao = userDao;
        this.googleService = googleService;
    }

    public static boolean isEmailValid(String email) {

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean isEmailValidOnClick(String email) {
        return true;

    }







    @Override
    public void register(User user) {
// parola kontrol
        if (user.getPassword().length() < 6 || user.getPassword() == null) {
            System.out.println("Parola en az 6 karakterden oluşmalıdır");
            return;
        }
        // var olan email kullanýmý
        if (mailList.contains(user.getMail())) {
            System.out.println("Bu email daha önce kullanıldı");
            return;
        }

        // ad ve soyad en az 2 karakter içermeli
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır");
            return;

        } else {
            System.out.println("Doðrulama linki gönderildi lütfen kontrol ediniz " + user.getMail());

        }

        if (isEmailValidOnClick(user.getMail())) {
            System.out.println("Kayıt işlemi tamamlandı");
            mailList.add(user.getMail());
            passwordList.add(user.getPassword());
            this.userDao.add(user);
            this.googleService.registerToSystem(null);

        } else {
            System.out.println("Emailinizi kontrol ediniz ve hesabınızı doğrulayın");
        }
    }

    @Override
    public void login(String mail, String password) {
        if (mail.contains(mail) && passwordList.contains(password)) {
            System.out.println("Başarılı Giriş Yaptınız");

        } else {
            System.out.println("Başarısız Giriş!");
        }
    }
}
