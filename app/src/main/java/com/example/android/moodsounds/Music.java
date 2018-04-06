package com.example.android.moodsounds;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {

    /** Music title */
    private String musicTitle;

    /** Music Author */
    private String musicAuthor;

    /** Music Duration */
    private String musicDuration;

    /** Music Duration */
    private String musicMood;

    /**
     * Create a new Music object.
     *
     * @param musicTitle is the title of the music
     * @param musicAuthor is the Author of the music
     * @param musicDuration is the duration of the music
     * @param musicMood is mood of the music
     */
    public Music(String musicTitle, String musicAuthor, String musicDuration, String musicMood) {
        this.musicTitle = musicTitle;
        this.musicAuthor = musicAuthor;
        this.musicDuration = musicDuration;
        this.musicMood = musicMood;
    }

    private Music(Parcel in) {
        musicTitle = in.readString();
        musicAuthor = in.readString();
        musicDuration = in.readString();
        musicMood = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(musicTitle);
        out.writeString(musicAuthor);
        out.writeString(musicDuration);
        out.writeString(musicMood);
    }

    /**
     * Get the music title.
     */
    public String getMusicTitle() { return musicTitle; }

    /**
     * Get the music Author.
     */
    public String getMusicAuthor() { return musicAuthor; }

    /**
     * Get the music Duration.
     */
    public String getMusicDuration() { return musicDuration; }

    /**
     * Get the music Mood.
     */
    public String getMusicMood() { return musicMood; }

    /**
     *
     */
    public static final Creator<Music> CREATOR
            = new Creator<Music>() {
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

}