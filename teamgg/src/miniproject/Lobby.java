package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Lobby{
	

public static long main(String[] args) {
	MP3Player mp3 = new MP3Player();
	Scanner sc = new Scanner(System.in);
	SelectDAO dao = new SelectDAO();
	String name = null ;
	long afterTime = 0;
	System.out.println("                                                                 \r\n"
			+ "   :!!!!!!;        ,;!!!!!!!!!!!!*!!!!!!*!!!;,        ;!!!!!!:   \r\n"
			+ "   #@@@@@@@,      .#@@@@@@@@@@@@@@@@@@@@@@@@@#.      ,@@@@@@@#   \r\n"
			+ "   @#..,.$@~      *@$,,......,.~@:..,......,$@*      ~@=.,.,#@   \r\n"
			+ "  ,@$    !@:      =@,          -@-          -@=      :@!    $@.  \r\n"
			+ "  ~@=    :@;      =@,          ~@-          ,@=      !@:    =@~  \r\n"
			+ "  ;@*    ,@*      =@,          -@~          ,@=      *@,    !@;  \r\n"
			+ "  =@;    .@$     :#@,          -@-          ,@#:     =@.    ;@=  \r\n"
			+ "  $@~     ##   ,$@@@#,         ~@~         ,#@@@#,   #@.    ~@#  \r\n"
			+ "  #@!:::::@@   =@=!=@@.        -@-        .@@=!=@=   @@:::::;@#  \r\n"
			+ "  #@@@@@@@@@. .@#   #@~        -@-        -@#   #@. .@@@@@@@@@#  \r\n"
			+ "  ,---#@-,,,  .@#   *@#$$$$$$$$$@$$$$$$$$$#@=   #@.  ,,,-@#-,,,  \r\n"
			+ "      #@       @@   =@@@@@@@@@@@@@@@@@@@@@@@=   @@       @#      \r\n"
			+ "      #@       =@,  =@$===================$@*  .@=       @#      \r\n"
			+ "      #@   .   ;@:. *@~  .                ~@*  :@;    .  @#      \r\n"
			+ "      #@       :@=  =@~                   ~@*  =@~       @#      \r\n"
			+ "      #@       ,@@  =@~                   ~@=  #@,       @#      \r\n"
			+ "      #@       .@@~,=@;,,,,,---,,,,---,,,,:@=,-@@.       @#      \r\n"
			+ "      #@.       $@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$        @#      \r\n"
			+ "      #@        ,:::::::::::::::::::::::::::::::,       .@#.     \r\n"
			+ "    ::#@::.                                            ::@#::    \r\n"
			+ "    @@@@@@,                                           ,@@@@@@    \r\n"
			+ "    !*!!!*.                 ,-,----,.                 .*!!!!*    \r\n"
			+ "                         ,=#@@@@@@@@@@=,                         \r\n"
			+ "                        ~@@#=*******=#@@~                        \r\n"
			+ "                       -@@!           !@@-                       \r\n"
			+ "      .,,,.            #@:             ;@#             .,,,.     \r\n"
			+ "      $@@@@#~         -@#               #@-          -#@@@@#     \r\n"
			+ "      #@===@#         !@!               *@!          $@===@@     \r\n"
			+ "      #@   $@         *@-               -@*          @#  .@@     \r\n"
			+ "      #@   =@         *@:               ~@*         .@$  .@@     \r\n"
			+ "      #@   =@         ;@$               $@;         .@$  ,@@     \r\n"
			+ "      #@.  =@         .@@,             ,@@.         .@$  ,@@     \r\n"
			+ "      #@   =@.         ;@@.           ,@@;          .@$  .@@     \r\n"
			+ "      #@   =@@@@@@#~    =@#*-... ...-*#@$.    -#@@@@@@$  .@@     \r\n"
			+ "      #@   :=====$@#     !@@@@@@@@@@@@@!.     #@$=====;  .@@     \r\n"
			+ "      #@          $@.     ,*$$$$$$$$$*,      ~@@         .@@     \r\n"
			+ "      #@ .        =@,                        ~@#         .@@     \r\n"
			+ "      #@.     ..  =@,                        ~@# . .    .,@@     \r\n"
			+ "      #@@@@@@@@@@@@@,                        ~@@@@@@@@@@@@@@     \r\n"
			+ "      *############$.                        .$############*     \r\n"
			+ "         .                                                       \r\n"
			+ "                                                                 \r\n"
			+ "  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#  \r\n"
			+ "  $###########################################################$  \r\n"
			+ "                                                                 \r\n"
			+ "                                                                 \r\n");
	System.out.println();
	System.out.println("?????? ?????? ????????????");
	int cnt = 0;
	gameEnding ending = new gameEnding();
	
	while(true) {
		
		System.out.print("[1]?????? ???? [2]???????? ???? [3]???????? [4]????  ");
		int choice = sc.nextInt();
		
		
		if(choice == 1) {
			
			++cnt;
			dao.SelectName();
			System.out.println();
			
			if(cnt == 2) {
				System.out.println("?????? ???? 2?? ?????? ???? ??????????????. ");
				System.out.println("???? ??????????.");
				ending.lose();
				afterTime = System.currentTimeMillis();
				break;
			}
		}else if(choice == 2) {
			System.out.println();
			System.out.println("?????? ???????? ???????? ??????????");
			System.out.println("[??????] [??????] [??????] [??????] [??????] [??????]");
			name = sc.next();
			mp3.play(".\\music\\playGun.mp3");
			dao.Alibi(name);
		}else if(choice == 3) {
			Evidence evidence = new Evidence();
			evidence.main(args);

		}else if(choice == 4) {
			afterTime = System.currentTimeMillis();
			System.out.println("???? ?????? ????????????.");
			System.out.println("????~!!");
			afterTime = System.currentTimeMillis();
			break;
		}
		

		
	}
	return afterTime;
	}

}


