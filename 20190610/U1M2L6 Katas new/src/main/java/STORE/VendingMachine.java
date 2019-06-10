package STORE;

public class VendingMachine {

        private Chips[] chips;
        private SodaPop[] sodapop;
        private Chocolate[] chocolate;
        private Mints[] mints;
        private  Gum [] gums;
        private Popcorn[] popcorns;

        public VendingMachine() {
        }

        public Chips[] getChips() {
                return chips;
        }

        public void setChips(Chips[] chips) {
                this.chips = chips;
        }

        public SodaPop[] getSodapop() {
                return sodapop;
        }

        public void setSodapop(SodaPop[] sodapop) {
                this.sodapop = sodapop;
        }

        public Chocolate[] getChocolate() {
                return chocolate;
        }

        public void setChocolate(Chocolate[] chocolate) {
                this.chocolate = chocolate;
        }

        public Mints[] getMints() {
                return mints;
        }

        public void setMints(Mints[] mints) {
                this.mints = mints;
        }

        public Gum[] getGums() {
                return gums;
        }

        public void setGums(Gum[] gums) {
                this.gums = gums;
        }

        public Popcorn[] getPopcorns() {
                return popcorns;
        }

        public void setPopcorns(Popcorn[] popcorns) {
                this.popcorns = popcorns;
        }
}


