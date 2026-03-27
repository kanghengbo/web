/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginBean;

/**
 *
 * @author Administrator
 */
public class LoginBean {
    private String userName;
    private String passWord;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public boolean login(String userName,String passWord){
        boolean b=false;
        if(userName.equals("QQ")&&passWord.equals("123")){
            b=true;
            return b;
	}
	else{
            b=false;
            return b;
	}
    }
    
}
