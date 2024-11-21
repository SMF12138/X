package NewLearn.Learn162;

class UserService {//登录方法

    public boolean login(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }

    private void logout() {
        System.out.println("系统已安全退出! ");
    }
}