package Homework_5;

public class Credentials {
	private String username;
	private String password;
	private String [] oldpasswords;
    private int oldpasswordCount;
	Credentials(String username, String password) {
		this.username = username;
		this.password = password;
		this.oldpasswords  = new String[100];
		this.oldpasswordCount = 0;
	}

	public boolean passValidation(String pass) {
		if (this.password.equals(pass)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isOldPass(String pass) {
		if (pass.equals(this.password)){
			return true;
		}
		for (int i = 0; i < this.oldpasswordCount; i++) {
			if (this.oldpasswords[i].equals(pass)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean setNewPass(String oldpass,String newpass){
		boolean flag1 = isOldPass(newpass);
		boolean flag2 = passValidation(oldpass);
		if (!flag1 && flag2){
			this.oldpasswords[this.oldpasswordCount++] = oldpass; 
			this.password = newpass;
			return true;
		}
		return false;
		
	}
	
	public String getUsername(){
		return this.username;
	}

}
