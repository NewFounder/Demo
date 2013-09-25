Vars * Define username pwd
Input UserName enterText ${username} %thinktime=5000
Input Password enterText ${pwd} %thinktime=5000
Button "Sign in or register" tap %thinktime=5000
Label welcome_msg Verify "Welcome to my world!!!" %thinktime=5000
Device * back %thinktime=2000