public class Main {
    public static void main(String[] args) {
//        var musicPlayer = new MusicPlayer() {
//            @Override
//            public void playMusic() {
//                System.out.println("Tocando a música");
//            }
//
//            @Override
//            public void pauseMusic() {
//
//            }
//
//            @Override
//            public void stopMusic() {
//
//            }
//        };
//
//        musicPlayer.playMusic();

        runMusic(new Computador());
        runVideo(new Computador());

    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
