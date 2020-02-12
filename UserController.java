@Controller
pulic class UserController{

   //로그인 페이지로 이동
 @RequsetMapping("/user/login.do")
public String login(){
	logger.info("경로 : login");
	return "user/login"; 

 }
//회원가입 페이지로 이동
@RequestMapping("/user/signUp.do")
public String signUp(){
	logger.info("경로:signUp");
	return "user/signUp"; 
 }
//회원가입 처리
 @RequestMapping("/user/signPro.do")
public String signPro(@RequestParam userid, @RequestParam userPwd){
	logger.info("경로:signPro");
	return "user/signPro";
 }
//회원수정 페이지로 이동
@RequestMapping("/user/update")
public String update(){
	logger.info("경로:update");
	return "user/update";
 }
}