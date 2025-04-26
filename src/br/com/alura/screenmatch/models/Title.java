package br.com.alura.screenmatch.models;

public abstract class Title implements Comparable<Title> {
    
    private String title;
    private int year;
    private String description;
    private boolean includeOnPlan;
    private  double totalRatings;
    private int totalReviews;
    private int durationInMinutes;

    public Title(String title) {
        this.title = title;
    }

    public Title(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Title(String title, int year, String description) {
        this.title = title;
        this.year = year;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description == null || description.isBlank() || description.isEmpty() ? "Não informado" : description;
    }

    public int getYear() {
        return year;
    }

    public boolean isIncludeOnPlan() {
        return includeOnPlan;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIncludeOnPlan(boolean includeOnPlan) {
        this.includeOnPlan = includeOnPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void rate(double rate) {
        totalRatings += rate;
        ++totalReviews;
    }

    public double getAverageRate() {
        return totalRatings / (double)totalReviews;
    }

    public void displayBasicInfo() {
        System.out.printf("%s %s %s\n", "=".repeat(15), title, "=".repeat(15));
        System.out.printf("Ano: %d\n", year);
        System.out.printf("Duração: %d %s\n", getDurationInMinutes(), getDurationInMinutes() > 1 ? "minutos" : "minuto");
        System.out.printf("Descrição: %s\n", description);
        System.out.println("=".repeat(32 + title.length()));
    }

    @Override
    public String toString() {
        return String.format("""
                Título: %s
                Ano: %d
                Avaliação: %.1f/10
                Descrição: %s
                """, title, year, getAverageRate(),getDescription());
    }

    @Override
    public int compareTo(Title o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    
}


