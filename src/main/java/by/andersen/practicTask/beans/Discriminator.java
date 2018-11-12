package by.andersen.practicTask.beans;

public class Discriminator {
    private int iddiscriminator;
    private String discriminator;
    private String name;
    private String extId;

    public int getIddiscriminator() {
        return iddiscriminator;
    }

    public void setIddiscriminator(int iddiscriminator) {
        this.iddiscriminator = iddiscriminator;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discriminator that = (Discriminator) o;

        if (iddiscriminator != that.iddiscriminator) return false;
        if (discriminator != null ? !discriminator.equals(that.discriminator) : that.discriminator != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (extId != null ? !extId.equals(that.extId) : that.extId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddiscriminator;
        result = 31 * result + (discriminator != null ? discriminator.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (extId != null ? extId.hashCode() : 0);
        return result;
    }
}
