package builder;

public class Smoothie {

    private final String milk;
    private final String pineApple;
    private final String banana;
    private final String mango;
    private final String ginger;
    private final String strawberry;

    public Smoothie(Builder builder) {
        milk = builder.milk;
        pineApple = builder.pineApple;
        banana = builder.banana;
        mango = builder.mango;
        ginger = builder.ginger;
        strawberry = builder.strawberry;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Smoothie is ready and the ingredients are:").append(" ");
        sb.append(milk).append(" ");
        if (pineApple != null) sb.append(pineApple).append(" ");
        if (banana != null) sb.append(banana).append(" ");
        if (mango != null) sb.append(mango).append(" ");
        if (ginger != null) sb.append(ginger).append(" ");
        if (strawberry != null) sb.append(strawberry).append(" ");

        return sb.toString();

    }

    public static class Builder {
        private String milk;
        private String pineApple;
        private String banana;
        private String mango;
        private String ginger;
        private String strawberry;

        public Builder(String milk) {
            if (milk == null) {
                throw new IllegalArgumentException("milk can not be null");
            }
            this.milk = milk;
        }

        public Builder withPineApple(String pineApple) {
            this.pineApple = pineApple;
            return this;
        }

        public Builder withBanana(String banana) {
            this.banana = banana;
            return this;
        }

        public Builder withMango(String mango) {
            this.mango = mango;
            return this;
        }

        public Builder withGinger(String ginger) {
            this.ginger = ginger;
            return this;
        }

        public Builder withStrawberry(String strawberry) {
            this.strawberry = strawberry;
            return this;
        }

        public Smoothie build() {
            return new Smoothie(this);
        }
    }

}
