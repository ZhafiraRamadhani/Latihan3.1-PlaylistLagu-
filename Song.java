// Kelas Song yang merepresentasikan sebuah lagu
public class Song {
        String title;  // Judul lagu
        Song next;     // Penunjuk ke lagu berikutnya

        // Konstruktor untuk menginisialisasi objek Song
        public Song(String title) {
            this.title = title;
            this.next = null;  // Awalnya, next adalah null
        }
    }

    // Kelas Playlist yang berisi metode untuk mengelola daftar lagu
    class Playlist {
        Song head;  // Penunjuk ke lagu pertama (head) dalam playlist

        // Konstruktor Playlist, awalnya kosong
        public Playlist() {
            head = null;
        }

        // Metode untuk menambah lagu di akhir playlist
        public void addSong(String title) {
            Song newSong = new Song(title);
            if (head == null) {
                // Jika playlist kosong, lagu pertama menjadi head
                head = newSong;
            } else {
                // Jika playlist tidak kosong, cari lagu terakhir
                Song current = head;
                while (current.next != null) {
                    current = current.next;
                }
                // Set next dari lagu terakhir ke lagu baru
                current.next = newSong;
            }
        }

        // Metode untuk menampilkan semua lagu dalam playlist
        public void displayPlaylist() {
            if (head == null) {
                System.out.println("Playlist kosong.");
                return;
            }

            Song current = head;
            System.out.println("Playlist:");
            while (current != null) {
                System.out.println("- " + current.title);
                current = current.next;
            }
        }

        public static void main(String[] args) {
            // Membuat objek playlist
            Playlist myPlaylist = new Playlist();

            // Menambah lagu ke playlist
            myPlaylist.addSong("Song 1 - Daur Hidup");
            myPlaylist.addSong("Song 2 - Laskar Pelangi");
            myPlaylist.addSong("Song 3 - We Are The Champion");

            // Menampilkan playlist
            myPlaylist.displayPlaylist();
        }
    }